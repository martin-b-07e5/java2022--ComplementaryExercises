package com.martinBergagno._07_2_ComplementaryExercises_L2;

import java.util.ArrayList;
import java.util.Collections;

/* Ex3_x
  https://en.wikipedia.org/wiki/Standard_52-card_deck#Composition
* */

public class Ex3_x {

  public static void main(String[] args) {
    ArrayList<String> valuesAL = new ArrayList<>();

    valuesAL.add("Ace");
    valuesAL.add("2");
    valuesAL.add("3");
    valuesAL.add("4");
    valuesAL.add("5");
    valuesAL.add("6");
    valuesAL.add("7");
    valuesAL.add("8");
    valuesAL.add("9");
    valuesAL.add("10");
    valuesAL.add("Jack");
    valuesAL.add("Queen");
    valuesAL.add("King");

    System.out.println("\nprint");
    for (String i : valuesAL) {
      System.out.println(i);
    }

    System.out.println("\nprint reverse");
    Collections.reverse(valuesAL);
    for (String i : valuesAL) {
      System.out.println(i);
    }

    System.out.println("\nshuffle");
    Collections.shuffle(valuesAL);
    for (String i : valuesAL) {
      System.out.println(i);
    }

  }

}
