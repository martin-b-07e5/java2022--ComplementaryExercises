package com.martinBergagno._07_1_PracticeSolved._5For;

import java.util.Scanner;

public class Multiplication {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("Input 99 to exit\n");

      int number = sc.nextInt();

      if (number == 99) {
        break;
      }

      for (int i = 1; i <= number; i++) {
        System.out.println(number + " * " + i + " = " + (number * i));
      }
    }

    sc.close();
    System.out.println("bye. sc.close");
  }

}
