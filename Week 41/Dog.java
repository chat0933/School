package com.company;

import java.util.ArrayList;

public class Dog {
    private String dogName;;
    private Owner ejer;
    private ArrayList<Dog> OffSpring = new ArrayList<>();


    public boolean feedDog() {
        int x = 3;
        if (isHungry == true) {
            System.out.println("The dog is hungry");
            while (x > 1) {
                isHungry = false;
                System.out.println("The dog has eaten its food and is no longer hungry");
            }
        }
        return false;
    }

    private boolean isHungry = true;
    public void setDogName(String dogName) {
        this.dogName = dogName;
    }


    public Dog(boolean isHungry, String dogName) {
        this.isHungry = isHungry;
        this.dogName = dogName;
    }


    public ArrayList<Dog> getOffSpring() {
        return OffSpring;
    }

    public String getDogName() {
        return dogName;
    }


    public Owner getEjer() {
        return ejer;
    }

    public void setEjer(Owner ejer) {
        this.ejer = ejer;
    }

    public void setOffSpring(ArrayList<Dog> offSpring) {
        OffSpring = offSpring;
    }

    public void setEjer(String name) {
    }
}
