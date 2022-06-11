package com.martinBergagno._07_2_ComplementaryExercises_L1;

import java.util.Scanner;

/* Ex5_Multiplication
  Write an application that asks for 2 integers
   and performs the multiplication operation
    by successive additions (without using libraries).
*/

public class Ex5_Multiplication {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("\nInput 999 to exit");
      System.out.println("Input 2 positive numbers");

      int n1 = sc.nextInt();
      if (n1 == 999) {
        System.out.println("\nThanks for using our application.");
        break;
      }

      int n2 = sc.nextInt();
      if (n2 == 999) {
        System.out.println("\nThanks for using our application.");
        break;
      }

      int multiplication = 0;
      for (int i = 0; i < Math.abs(n2); i++) {
        multiplication += n1;
      }

      if ((n1 <= 0) && (n2 <= 0) || (n1 >= 0) && (n2 >= 0)) {
        System.out.println("multiplication: " + Math.abs(multiplication));
      } else {
        System.out.println("multiplication: " + (multiplication));
      }

    }

  }

}
