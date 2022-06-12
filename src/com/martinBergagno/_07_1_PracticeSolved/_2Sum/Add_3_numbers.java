package com.martinBergagno._07_1_PracticeSolved._2Sum;

/* Realize a program that when executed,
  can enter three integers,
  then print them, in the next form:
    The first number is: 4
    The second number is: 5
    The third number is: 6
*/

import java.util.Scanner;

public class Add_3_numbers {
  public static void main(String[] args) {
    // Create an object Scanner which will take the InputStream.
    Scanner scanner = new Scanner(System.in);
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    int n3 = scanner.nextInt();
    int sum = n1 + n2 + n3;
    System.out.println("The first number is: " + n1);
    System.out.println("The second number is: " + n2);
    System.out.println("The third number is: " + n3);

    System.out.println("sum: " + (n1 + n2 + n3));
    System.out.println("sum: " + sum);

    scanner.close();


  }


}
