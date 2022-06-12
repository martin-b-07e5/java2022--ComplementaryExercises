package com.martinBergagno._07_1_PracticeSolved._4Switch;

/*
Make a program that, given an input number between 1 and 7,
 return the day of the week as follows.
*/

import java.util.Scanner;

public class DayOfWeek {

  public static void main(String[] args) {

    int day = 0;
    while (day != 9) {
      System.out.println("Input 9 to exit\n");

      Scanner scanner = new Scanner(System.in);
      day = scanner.nextInt();

      switch (day) {
        case 1:
          System.out.println("Sunday");
          break;
        case 2:
          System.out.println("Monday");
          break;
        case 3:
          System.out.println("Tuesday");
          break;
        case 4:
          System.out.println("Wednesday");
          break;
        case 5:
          System.out.println("Thursday");
          break;
        case 6:
          System.out.println("Friday");
          break;
        case 7:
          System.out.println("Saturday");
          break;
        case 9:
          System.out.println("Bye");
          break;
        default:
          System.out.println("Looking forward to the Weekend");
      }

    }


  }

}
