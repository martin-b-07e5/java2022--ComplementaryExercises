package _07_2_ComplementaryExercises_L1;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

/* Ex7_Uppercase
  Write a program that given an input String in lowercase
   converts it completely to uppercase.
  Don't use methods or libraries that perform toUppercase().
----------------------------------------------------------------------
Lower Case ASCII 	Upper Case ASCII
a – 97 	A – 65  » 97-65=32
b – 98 	B – 66  » 98-66=32

From the concept, we know that the difference between lowercase ASCII and upper case ASCII is 32.
    Find the length of String
    Run the loop from 0 to (length – 1)
    Visit each character of String and subtract 32 from it
    As we subtract 32, the lowercase letter gets converted to uppercase letter
    Print the uppercase string

https://www.devcubicle.com/java-program-to-convert-lowercase-to-uppercase-without-using-string-function/
https://www.flowerbrackets.com/convert-uppercase-to-lowercase-in-java-without-using-string-function/
*/

public class Ex7_Uppercase {

  public static void main(String[] args) {
    System.out.println("Input some text");
    Scanner sc = new Scanner(System.in);
    String aString = sc.nextLine();
    sc.close();

    System.out.println("string in uppercase is: " + myToUpper(aString));
    System.out.println("string in lowercase is: " + myToLower(aString));
  }

  static @NotNull String myToUpper(@NotNull String s) {
//    String result = "";
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char aChar;
      if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
        aChar = (char) (s.charAt(i) - 32);
      } else {
        aChar = s.charAt(i);
      }
//      result += aChar;
      result.append(aChar);
    }
    return result.toString();
  }

  static @NotNull String myToLower(@NotNull String s) {
//    String result = "";
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char aChar;
      if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
        aChar = (char) (s.charAt(i) + 32);
      } else {
        aChar = s.charAt(i);
      }
//      result += aChar;
      result.append(aChar);
    }
    return result.toString();
  }

}
