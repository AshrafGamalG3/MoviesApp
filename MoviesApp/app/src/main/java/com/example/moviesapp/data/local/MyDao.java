package com.example.moviesapp.data.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.moviesapp.data.model.ModelMovies;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;
import retrofit2.Response;

@Dao
public interface MyDao {

    @Insert
    Completable insertMovies(List<ModelMovies.ResultsBean> list);

    @Query("select * from ResultsBean")
    Single<List<ModelMovies.ResultsBean>> getMovies();

    @Query("SELECT * FROM ResultsBean WHERE id = :id")
    Single<ModelMovies.ResultsBean> getMovieById(int id);


}
