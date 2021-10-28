package com.company;

import java.util.ArrayList;

public class Garage{
    ArrayList<Object> cars = new ArrayList<>();

    void addBilTilPark(Object object) {
        cars.add(object);
    }

    // mangler det sidste for at få udregnet afgifterne
     void udregnGrønafgift(){
        double afgift =0;
        for(Object object: cars){
        afgift =
        }
        System.out.println("test"+afgift+"kr");
    }


    @Override
    public String toString() {
        return "Garage{" +
                "cars=" + cars +
                "udregnGrønafgift"+
                '}';
    }
}


// "omvendt / r omvendt / r"; for mellemrum. skal ind i override    (newline