package com.example.moviesapp.ui.showmovies;

import android.util.Log;

import com.example.moviesapp.data.local.MyDatabase;
import com.example.moviesapp.data.model.ModelMovies;
import com.example.moviesapp.data.remote.RetroConnection;
import com.example.moviesapp.ui.showmovies.IRepo;

import java.util.List;

import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class Repo {
    IRepo iRepo;

    public Repo(IRepo iRepo) {
        this.iRepo = iRepo;
    }

    void getMovies(){
        getMoviesRemote();

    }

    void getMoviesRemote(){
        RetroConnection.getApiCalls().gResultsBeanSingle("03b409460cf77e5e523433ddfa291540")
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new SingleObserver<Response<ModelMovies>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(Response<ModelMovies> modelMoviesResponse) {
                        if (modelMoviesResponse.body()!=null&& modelMoviesResponse.body().getResults()!=null){
                            iRepo.getMovie(modelMoviesResponse.body().getResults());
                            cacheMovie(modelMoviesResponse.body().getResults());
                        }else {
                            getMoviesLocal();
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                     getMoviesLocal();
                    }
                });
    }

    void getMoviesLocal(){
        MyDatabase.getMyDatabase().gMyDao().getMovies().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<ModelMovies.ResultsBean>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(List<ModelMovies.ResultsBean> list) {
                iRepo.getMovie(list);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("TAG", "onError: "+e.getLocalizedMessage());
                    }
                });

    }

    void cacheMovie(List<ModelMovies.ResultsBean> list){
        MyDatabase.getMyDatabase().gMyDao().insertMovies(list).subscribeOn(Schedulers.io()).subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onComplete() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });

    }

}
