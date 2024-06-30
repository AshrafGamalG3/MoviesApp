package com.example.moviesapp.data.local;

import androidx.room.TypeConverter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

public class Converter {

    @TypeConverter
    public List<Integer> fromJson(String data) {
        if (data == null) {
            return null;
        }
        Type type = new TypeToken<List<Integer>>() {}.getType();
        return new Gson().fromJson(data, type);
    }

    @TypeConverter
    public String toJson(List<Integer> genre_ids) {
        if (genre_ids == null) {
            return null;
        }
        return new Gson().toJson(genre_ids);
    }





}
