package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

      Garage g = new Garage();

      Bil bil1 = new Benzinbil(5243, "Renault", "lagna205GT", 2009, 2, 95, 50);
      Bil bil2 = new Diselbil(3323, "Renault", "LagunaDci175", 2011, 2, true,50);
      Bil bil3 = new Elbil(4423, "Tesla", "model3 Long Range AWD", 2020, 4, 75, 560, 160);


      g.addBilTilPark(bil1);
      g.addBilTilPark(bil2);
      g.addBilTilPark(bil3);
      System.out.println(g);
      g.udregnGrønafgift();

    }
}
