package com.example.seputarfakta;

import java.util.Random;

public class kumpulanFakta {

    //
   private String[] mfakta = {
            "James Gosling adalah orang yang membuat bahasa pemograman java",
            "Dart adalah bahasa pemograman yang multiplatform",
            "HTML bukanlah sebuah bahasa pemograman",
            "Programmer pertama di dunia adalah wanita",
            "PHP merupakan salah satu bahasa pemograman web",
            "MYSQL adalah DBMS yang banyak digunakan untuk pemula",
            "Python merupakan bahasa pemograman tingkat tinggi",
            "Dalam dunia pemograman teori dan praktek harus seimbang"
    };
    //
    public String getFakta(){

        String fakta;
        
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mfakta.length);
        fakta = mfakta[randomNumber];

        return fakta;
    }

}