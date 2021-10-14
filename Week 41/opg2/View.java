package com.company;

public class View {
   public static void doView(double result, String typeOfResult)    {
       String CURRENCY = "kr";
       String MSG = "MOMS";
    System.out.printf("Du betaler %.2f%3s i %s%n", result, CURRENCY, MSG);
    }
}
