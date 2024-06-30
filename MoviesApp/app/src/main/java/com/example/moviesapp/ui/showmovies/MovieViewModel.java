package com.example.moviesapp.ui.showmovies;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.moviesapp.data.model.ModelMovies;

import java.util.List;

public class MovieViewModel extends ViewModel implements IRepo {

        Repo repo=new Repo(this);
   public MutableLiveData<List<ModelMovies.ResultsBean>> gData=new MutableLiveData<>();


   public void getMovies(){
        repo.getMovies();
    }
    @Override
    public void getMovie(List<ModelMovies.ResultsBean> list) {
        gData.setValue(list);
    }


}
