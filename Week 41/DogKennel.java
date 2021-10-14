package com.company;

public class DogKennel {

   // public class DogKennel {

        public static void main(String[] args) {
            // write your code here
            //TODO:
            // lav en ny hund
            Dog myDog = new Dog(true, "Walter");
            Dog myDog2 = new Dog(true, "Vilda");



            // Sæt en ejer

            myDog.setEjer("Hansen");

            // Print hundene + Ejer
            System.out.println("Hunden" + dogName()+ "er ejet af" + myDog.getEjer());
            }
    }

