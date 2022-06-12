package _07_2_ComplementaryExercises_L1;

/* Ex4_Factorial
  Write a program that calculates the factorial of a number
    n! = 1 x 2 x 3 x 4 x 5 x ... x (n-1) x n.
  Without using libraries.
*/

import java.util.Scanner;

public class Ex4_Factorial {

  public static void main(String[] args) {
    System.out.println("\nInput a number");

    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    int fact = 1;
    for (int i = 1; i < number; i++) {
      fact += fact * i;
    }
    System.out.println("\nFactorial of '" + number + "' is: " + fact);

    usingRecursion(number);
  }

  public static void usingRecursion(int number) {
    System.out.println("\nUsing recursion");

    int fact = factorial(number);
    System.out.println("Factorial of " + number + " is: " + fact);
  }

  public static int factorial(int number) {
    if (number == 0)
      return 1;
    else
      return (number * factorial(number - 1));
  }

}
