package _07_2_ComplementaryExercises_L2;

/* Ex7_FizzBuzz
  ✅ Create a function that given 2 int arguments
   (being the first one smaller than the second), returns an array of Strings.
  ✅ With the sequence of integers from beginning to end.
  But
    ✅ if the number is a multiple of 2 it'll place the value "Fizz",
    ✅ if it's a multiple of 3 "Buzz" and
    ✅ if it's a multiple of both it'll set "FizzBuzz".

Remark:
   ✅ The "2 arguments" indicate with which value to start calculating and
    "the second" with which value to brake (not included in the calculation).

✅ Eg: (1, 5) ----> will calculate values of 1, 2, 3, 4

Input:
✅ fizzBuzzFunction(1,6)  // 6 marks the limit, and it's not included.
    [“1”, “Fizz”, “Buzz”, “Fizz”, “5”]
✅ fizzBuzzFunction(1,8)
    [“1”, “Fizz”, “Buzz”, “Fizz”, “5”, “FizzBuzz”, “7”]
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7_FizzBuzz {

  public static void main(String[] args) {
    System.out.println("input number");

    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();

    ArrayList<String> returnOfFizzBuzzFunction = fizzBuzzFunction(n1, n2);
    System.out.println(returnOfFizzBuzzFunction);
  }

  public static ArrayList<String> fizzBuzzFunction(int n1, int n2) {

    ArrayList<String> arrayOfStrings = new ArrayList<>();

    if (n1 < n2) {
      // load the ArrayList
      for (int i = n1; i < n2; i++) {
        if ((i % 2 == 0) && (i % 3 == 0)) {
          arrayOfStrings.add("FizzBuzz");
        } else if (i % 2 == 0) {
          arrayOfStrings.add("Fizz");
        } else if (i % 3 == 0) {
          arrayOfStrings.add("Buzz");
        } else {
          arrayOfStrings.add(String.valueOf(i));
        }
      }
    }

    return arrayOfStrings;
  }

}
