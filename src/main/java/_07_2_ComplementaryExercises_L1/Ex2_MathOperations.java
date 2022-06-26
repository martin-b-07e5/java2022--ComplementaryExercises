package _07_2_ComplementaryExercises_L1;

/* Ex2_MathOperations
2. Hello Obi Wan Ken obi
Write a program that requests 2 integers through the console.
 It then prints the result of addition, subtraction, multiplication, division, and modulus.
*/

import java.text.MessageFormat;
import java.util.Scanner;

public class Ex2_MathOperations {
  public static void main(String[] args) {
    System.out.println("Input two numbers");
    Scanner sc = new Scanner(System.in);
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    sc.close();

    int addition = number1 + number2;
    int subtraction = number1 - number2;
    int multiplication = number1 * number2;
    int division = number1 / number2;
    int modulus = number1 % number2;

    System.out.println(number1 + " + " + number2 + ": " + addition);
    System.out.println(MessageFormat.format("{0} - {1}: {2}", number1, number2, subtraction));
    System.out.printf("%d * %d: %d%n", number1, number2, multiplication);
    System.out.printf("%d / %d: %d%n", number1, number2, division);
    System.out.println(number1 + " % " + number2 + ": " + modulus);
  }
}
