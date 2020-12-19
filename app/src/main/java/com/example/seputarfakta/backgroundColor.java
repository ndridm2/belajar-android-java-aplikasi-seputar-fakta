package com.example.seputarfakta;

import android.graphics.Color;

import java.util.Random;

public class backgroundColor {
    //
    private String[] mWarna = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#c0ab18",
            "#f092b0"
    };

    public int getWarna() {

        String warna;

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mWarna.length);
        warna = mWarna[randomNumber];
        int changeInt = Color.parseColor(warna);

        return changeInt;
    }
}
