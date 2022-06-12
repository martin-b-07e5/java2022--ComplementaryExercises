package com.martinBergagno._07_1_PracticeSolved._3If;

import java.util.Scanner;

/*
We will have a system that must classify the result of an evaluation.
As input data we will have an Integer and
 as output a String of the classification,
  in the following way:
    Range       Classification
    93 - 100    Excellent
    85 - 92     Outstanding
    75 - 84     Distinguished
    60 - 74     Good
    00 - 59     Disapproved
*/

public class If_Else {
  public static void main(String[] args) {
    System.out.println("Input numbers from 0 to 100");
    System.out.println("999 to exit");

    int nota;
    while (true) {

      Scanner scanner = new Scanner(System.in);
      nota = scanner.nextInt();

      if (nota >= 93 && nota <= 100) {
        System.out.println("Excellent");
      } else if (nota >= 85 && nota < 93) {
        System.out.println("Outstanding");
      } else if (nota >= 75 && nota < 85) {
        System.out.println("Distinguished");
      } else if (nota >= 60 && nota < 75) {
        System.out.println("Good");
      } else if (nota >= 0 && nota < 60) {
        System.out.println("Disapproved");
      } else if (nota == 999) {
        System.out.println("Bye");
        break;
      } else {
        System.out.println("ERROR - Input numbers from 0 to 100 \n" + "Input 999 to exit");
      }

    }

  }
}