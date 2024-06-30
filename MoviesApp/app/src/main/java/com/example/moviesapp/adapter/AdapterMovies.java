package com.example.moviesapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.moviesapp.data.model.ModelMovies;
import com.example.moviesapp.databinding.ItemMoiveBinding;

import java.util.ArrayList;
import java.util.List;

public class AdapterMovies extends RecyclerView.Adapter<AdapterMovies.Holder> {
    List<ModelMovies.ResultsBean> resultsBeans;

    OnClickMovie onClickMovie;


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMoiveBinding binding=ItemMoiveBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new Holder(binding);
    }

    public void setOnClickMovie(OnClickMovie onClickMovie) {
        this.onClickMovie = onClickMovie;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.bind(resultsBeans.get(position));
    }

    public void setResultsBeans(List<ModelMovies.ResultsBean> resultsBeans) {
        this.resultsBeans = resultsBeans;
    }

    @Override
    public int getItemCount() {
        return resultsBeans==null?0:resultsBeans.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        ItemMoiveBinding binding;

        public Holder(@NonNull ItemMoiveBinding itemView) {

            super(itemView.getRoot());
            this.binding=itemView;


        }

        public void bind(ModelMovies.ResultsBean movie){
            binding.textTitle.setText(movie.getTitle());
            Glide.with(binding.getRoot().getContext()).load("https://image.tmdb.org/t/p/w500"+movie.getPoster_path()).into(binding.imageMovie);
            binding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onClickMovie!=null){
                        onClickMovie.onClick(resultsBeans.get(getAdapterPosition()));

                    }
                }
            });

        }
    }
}
