package com.example.moviesapp.ui.showmovies;

import com.example.moviesapp.data.model.ModelMovies;

import java.util.List;

public interface IRepo {
    void  getMovie(List<ModelMovies.ResultsBean> list);


}
