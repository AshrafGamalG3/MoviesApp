package com.example.moviesapp.ui.showdetails;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.moviesapp.data.model.ModelMovies;

public class MovieDetailsViewModel extends ViewModel implements IRepo {
    MutableLiveData<ModelMovies.ResultsBean> resultsBeanMutableLiveData = new MutableLiveData<>();

    Repo repo = new Repo(this);

    void getMovieDetailsOffline(int id) {
        repo.getMovieDetailsOffline(id);
    }

    @Override
    public void movieDetails(ModelMovies.ResultsBean resultsBean) {
        resultsBeanMutableLiveData.setValue(resultsBean);
    }
}
