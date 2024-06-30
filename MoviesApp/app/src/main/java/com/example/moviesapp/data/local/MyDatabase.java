package com.example.moviesapp.data.local;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.moviesapp.data.model.ModelMovies;


@Database(entities = {ModelMovies.ResultsBean.class},version = 1)
@TypeConverters(value = Converter.class)
public  abstract class MyDatabase extends RoomDatabase {
    private static MyDatabase myDatabase;

  public abstract MyDao gMyDao();

    public static synchronized  void  getInstance(Context context)
    {
        if (myDatabase==null){
            myDatabase= Room.databaseBuilder(context,MyDatabase.class,"moviesdb")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
    }

    public static MyDatabase getMyDatabase(){
        return myDatabase;
    }
}
