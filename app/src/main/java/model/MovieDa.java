package model;

import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MovieDa  implements IMovieDa {

    private ArrayList<Movie> movies = new ArrayList<>();

    public MovieDa() {
        movies.add(new Movie("how to Be single", "comedy", 1999));
        movies.add(new Movie("split", "action", 1998));
        movies.add(new Movie("perfect strangers", "drama", 1980));
        movies.add(new Movie("the edge of love", "emotiomal", 1996));
        movies.add(new Movie("the vow", "romantic", 1992));
        movies.add(new Movie("old school", "documentary", 1993));
        movies.add(new Movie("the conjuring", "History", 1994));
        movies.add(new Movie("crazy", "horror", 1994));

    }

    public List<Movie> getMovies(String til) {
        ArrayList<Movie> type = new ArrayList<>();
        for (Movie m : movies) {
            if (m.getTitle().equals(til)) {

                   type.add(m);
                }
            }

        return type;
    }


   public ArrayList<String> getTit() {
        ArrayList<String> tit = new ArrayList<>();
        for (int k = 0; k < movies.size(); k++) {
            if (tit.contains(movies.get(k).getTitle()) == false)
                tit.add(movies.get(k).getTitle());
        }
        return tit;
    }

    public ArrayList<String> SearchTitle() {
        ArrayList<String> tit = new ArrayList<>();
        for (int k = 0; k < movies.size(); k++) {
            if (tit.contains(movies.get(k).getName()) == false)
                tit.add(movies.get(k).getName());
        }
        return tit;
    }

    public ArrayList<Integer> SearchYear() {
        ArrayList<Integer> tit = new ArrayList<>();
        for (int k = 0; k < movies.size(); k++) {
            if (tit.equals(movies.get(k).getYear()) == false)
                tit.add(movies.get(k).getYear());
        }
        return tit;
    }

   public ArrayList<String> SearchForOneThing() {
        ArrayList<String> tit = new ArrayList<>();
        for (int k = 0; k < movies.size(); k++){
            if (tit.contains(movies.get(k).getName()) == Boolean.parseBoolean(null))
                tit.add(movies.get(k).getTitle());
    }
                return tit;

    }




}