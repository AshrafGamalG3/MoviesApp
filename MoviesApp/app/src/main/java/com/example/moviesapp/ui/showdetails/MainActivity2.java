package com.example.moviesapp.ui.showdetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.example.moviesapp.R;
import com.example.moviesapp.data.model.ModelMovies;
import com.example.moviesapp.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding binding;
    MovieDetailsViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewModel =new ViewModelProvider(this).get(MovieDetailsViewModel.class);
        int id =getIntent().getIntExtra("movieId",-1);

        getMovieById(id);
        observer();
    }

    void getMovieById(int id){
        viewModel.getMovieDetailsOffline(id);
    }

    void observer() {
        viewModel.resultsBeanMutableLiveData.observe(this, new Observer<ModelMovies.ResultsBean>() {
            @Override
            public void onChanged(ModelMovies.ResultsBean resultsBean) {
                binding.date.setText(resultsBean.getRelease_date());
                binding.overview.setText(resultsBean.getOverview());
                binding.tagline.setText(resultsBean.getOriginal_title());
                binding.titleName.setText(resultsBean.getTitle());
                binding.voteCount.setText(String.valueOf(resultsBean.getVote_count()));
                binding.vote.setText(String.valueOf(resultsBean.getVote_average()));
                Glide.with(binding.getRoot().getContext()).load("https://image.tmdb.org/t/p/w500"+resultsBean.getPoster_path()).into(binding.image);
            }
        });
    }
    }


