package com.example.moviesapp.data.remote;

import com.example.moviesapp.data.model.ModelMovies;

import java.util.List;

import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiCalls {

    @GET("discover/movie")
    Single<Response<ModelMovies>> gResultsBeanSingle(@Query("api_key") String api_key);
    @GET("movie/{movie_id}")
    Single<Response<ModelMovies.ResultsBean>> getMovieById(@Path("movie_id") int movieId,@Query("api_key") String api_key);
}
