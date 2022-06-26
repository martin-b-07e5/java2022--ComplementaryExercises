package _07_2_ComplementaryExercises_L1;

import java.util.Scanner;

/* Ex3_Sequence
Write a program that, given an integer as input data,
 prints a sequence of number (increments of 1) as follows:
  Input:
    5
  Output:
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/
public class Ex3_Sequence {

  public static void main(String[] args) {
    System.out.println("input number");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    sc.close();

    for (int i = 0; i < number; i++) {
      for (int j = 1; j <= i + 1; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

}
