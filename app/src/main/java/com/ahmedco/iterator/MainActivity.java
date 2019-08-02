package com.ahmedco.iterator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ahmedco.iterator.test2.AlertBar;
import com.ahmedco.iterator.test2.AlertCollection;

import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test2();
       //test1();
    }


    private void test2() {
        //http://www.newthinktank.com/2012/10/iterator-design-pattern-tutorial/
        /***
         give you a way to access its elements without exposing its internal structure.
        */
        SongsOfThe70s songs70s = new SongsOfThe70s();
        SongsOfThe80s songs80s = new SongsOfThe80s();
        SongsOfThe90s songs90s = new SongsOfThe90s();
        DiscJockey madMike = new DiscJockey(songs70s,songs80s,songs90s);
        // madMike.showTheSongs();
        madMike.showTheSongs2();
    }


    private void test1() {
        AlertCollection alertCollection = new AlertCollection();
        AlertBar alertBar = new AlertBar(alertCollection);
        alertBar.printAlerts();
    }
}

