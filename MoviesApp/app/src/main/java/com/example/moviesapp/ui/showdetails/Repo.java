package com.example.moviesapp.ui.showdetails;

import android.util.Log;

import com.example.moviesapp.data.local.MyDatabase;
import com.example.moviesapp.data.model.ModelMovies;
import com.example.moviesapp.data.remote.RetroConnection;

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

    void getMovieDetailsOffline(int id){
        MyDatabase.getMyDatabase().gMyDao().getMovieById(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<ModelMovies.ResultsBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        // You can add disposable to a CompositeDisposable if you want to manage it
                    }

                    @Override
                    public void onSuccess(ModelMovies.ResultsBean resultsBean) {
                        iRepo.movieDetails(resultsBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        // Log the error
                        Log.e("Repo", "Error fetching movie details", e);
                    }
                });
    }
}
