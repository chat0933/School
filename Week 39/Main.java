package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        printWordsStartingWith("Ø");

        printWordsOfLength(3);


        //  printMostFrequentLetter();
        //test dine metoder ved at kalde dem her:
        printLongestWord();


        // task 2
        printFirstHalOfEachWord();

        // task 3
//printMostFrequentNumber

        // Task 4
//printLeastFrequentNumber
    }

    private static void printWordsOfLength(int l) {
        boolean wordisvalid = true;

        for (String s : text) {
            if (s.length() == l) {
                if (s.contains(",") || s.contains(".")) {
                    wordisvalid = false;
                }

                if (wordisvalid) {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:

    // task 1
    private static String printLongestWord() {
        String LongestWord = "";
        for (String s : text)    // for each word in text
        {
            if (s.length() > LongestWord.length()) {
                LongestWord = s;
            }
        }
        System.out.println("The longest word is: " + LongestWord);
        return LongestWord;
    }


    // Task 2
    private static void printFirstHalOfEachWord() {
        for (String s : text) // for each word in text
        {
            System.out.println(s.substring(0, s.length() / 2));
        }
    }
}


    //task 3
//    private static void printMostFrequentLetter() {
//        char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
//                's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'æ', 'ø', 'å'};
//        int letterArray[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//
  //      char mostFreequentletter = 'a';
    //    String s = " ";
//
  //      for (int i = 0; i < chars.lenght; i++) {
    //        s = s.toLowerCase();
//
  //          for (int h = 0; h < 29; h++) {
    //            }
      //      }
       // }
