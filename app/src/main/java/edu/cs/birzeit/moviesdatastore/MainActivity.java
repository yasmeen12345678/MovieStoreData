package edu.cs.birzeit.moviesdatastore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import model.IMovieDa;
import model.Movie;
import model.MovieDa;
import model.MovieWorkShop;
public class MainActivity extends AppCompatActivity {

    private TextView res;
    MovieWorkShop workShop= new MovieWorkShop();
    IMovieDa movie= workShop.getModel();
    public Spinner spinner;
   // public EditText editTextTextPersonName;
  // public EditText editTextTextPersonName2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner= findViewById(R.id.spinner);
     //   editTextTextPersonName=findViewById(R.id. editTextTextPersonName);
    //    editTextTextPersonName2=findViewById(R.id. editTextTextPersonName2);
         populateSpinner();
    }

    private void populateSpinner() {

        MovieDa da = new MovieDa();
        List<String> til = new ArrayList<>();
         til= da.getTit();
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,til);
        spinner.setAdapter(adapter);

    }

    public void btnGetMovieOnClick(View view) {


      //  String name=editTextTextPersonName.getText().toString();
       // int year= Integer.parseInt(editTextTextPersonName2.getText().toString());
        String x= spinner.getSelectedItem().toString();

        List<Movie> movies= movie.getMovies(x);
        String str= "";

        for(Movie b:movies)
        {
            str +=b.toString() +"\n";
        }


        res=(TextView) findViewById(R.id.editTextTextPersonName3);
        res.setText(str);

//        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }

}

