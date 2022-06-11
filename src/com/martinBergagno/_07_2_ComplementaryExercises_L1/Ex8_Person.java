package com.martinBergagno._07_2_ComplementaryExercises_L1;

/* Ex8_Person
  Create an application that request data from a person in this order.
    Fn and Ln  String
    Age        int
    Address    String
    City       String

  It will then print the following message.
    {City} - {Address} - {Age} - {FN and LN}
*/

import java.util.Scanner;

public class Ex8_Person {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Input FN and LN: ");
    String fn_Ln = sc.nextLine();

    System.out.print("Input Age: ");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.print("Input Address: ");
    String address = sc.nextLine();

    System.out.print("Input city: ");
    String city = sc.nextLine();

    sc.close();

    System.out.println(city + " - " +
        address + " - " +
        age + " - " +
        fn_Ln
    );
  }

}
