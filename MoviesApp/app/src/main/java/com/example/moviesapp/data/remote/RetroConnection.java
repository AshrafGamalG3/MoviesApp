package com.example.moviesapp.data.remote;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroConnection {

 private  static    Retrofit retrofit;

    public static Retrofit getRetroConnection(){
        if (retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl("https://api.themoviedb.org/3/")
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static ApiCalls getApiCalls(){
        return getRetroConnection().create(ApiCalls.class);
    }
}
