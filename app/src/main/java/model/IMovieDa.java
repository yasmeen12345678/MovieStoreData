package model;

import android.widget.EditText;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public interface IMovieDa {

    List<Movie> getMovies(String til);
    ArrayList<String> getTit();
    ArrayList<String> SearchTitle();
    public ArrayList<Integer> SearchYear();
    ArrayList<String> SearchForOneThing();



}
