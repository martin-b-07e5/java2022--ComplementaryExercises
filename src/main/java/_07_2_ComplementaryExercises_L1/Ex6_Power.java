package _07_2_ComplementaryExercises_L1;

import java.util.Scanner;

public class Ex6_Power {

  public static void main(String[] args) {
    int base, exponent;

    Scanner sc = new Scanner(System.in);

    System.out.println("Input the positive base");
    base = sc.nextInt();
    System.out.println("Input the positive exponent");
    exponent = sc.nextInt();

    int result = 1;
    for (int i = 1; i <= exponent; i++) {
      result *= base;
    }
    System.out.println("power: " + result);
  }

}
