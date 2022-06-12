package _07_2_ComplementaryExercises_L1;

import java.util.Scanner;

/*Ex9_Letter
  Given an input string (sentence, text, etc.)
   calculate how many times a given letter appears.
 */
public class Ex9_Letter {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Input sentence: ");
    String sentence = sc.nextLine();

    System.out.print("Input letter to count: ");
    String letter = sc.nextLine();

//    int numOfOccurrences = sentence.split(letter, -1).length - 1;
    int numOfOccurrences = sentence.length() - sentence.replaceAll(letter, "").length();
    System.out.println("numOfOccurrences of " + letter + ": " + numOfOccurrences);
  }

}
