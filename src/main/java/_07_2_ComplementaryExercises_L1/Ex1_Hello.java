package _07_2_ComplementaryExercises_L1;

/* Exercise 1
  1. Ask for the user's name via console and print the following message on
   the screen message "HELLO {USER}!!!"
*/

import java.util.Scanner;

public class Ex1_Hello {

  public static void main(String[] args) {

    System.out.println("Input name");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
   scanner.close();

    System.out.println("HELLO " + name.toUpperCase() + "!!!");

  }

}
