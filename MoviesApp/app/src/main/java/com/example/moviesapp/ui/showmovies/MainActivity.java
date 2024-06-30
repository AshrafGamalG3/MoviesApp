package com.example.moviesapp.ui.showmovies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import com.example.moviesapp.ui.showdetails.MainActivity2;
import com.example.moviesapp.adapter.AdapterMovies;
import com.example.moviesapp.adapter.OnClickMovie;
import com.example.moviesapp.data.model.ModelMovies;
import com.example.moviesapp.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    MovieViewModel movieViewModel;
        AdapterMovies adapterMovies=new AdapterMovies();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        movieViewModel=new ViewModelProvider(this).get(MovieViewModel.class);
        adapterMovies=new AdapterMovies();




        getMovies();
        observer();
        onClick();




    }


    void onClick(){
        adapterMovies.setOnClickMovie(new OnClickMovie() {
            @Override
            public void onClick(ModelMovies.ResultsBean resultsBean) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("movieId",resultsBean.getId());
                startActivity(intent);
            }
        });

    }
    void observer(){
        movieViewModel.gData.observe(this, new Observer<List<ModelMovies.ResultsBean>>() {
            @Override
            public void onChanged(List<ModelMovies.ResultsBean> list) {
                    adapterMovies.setResultsBeans(list);
                binding.recycler.setAdapter(adapterMovies);
            }
        });
    }

    void getMovies(){
        movieViewModel.getMovies();
    }
}