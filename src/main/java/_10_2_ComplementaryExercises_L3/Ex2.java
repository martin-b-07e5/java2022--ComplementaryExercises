package _10_2_ComplementaryExercises_L3;

/* Ex2
  Given a list containing Integers, generate another list which will contain
   the result of applying the power of 2 operation.

  👀$HOME/IdeaProjects/java2022/src/main/java/_07_2_ComplementaryExercises_L1/Ex4_Factorial.java
  👀$HOME/IdeaProjects/java2022/src/main/java/_07_2_ComplementaryExercises_L1/Ex6_Power.java
*/

import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5);

    List<Integer> list = numbers.stream()
        .map(base -> Ex2.powerRecursiveFunction(base, 2))
//        .map(base -> (int) Math.pow(base, 2))
        .collect(Collectors.toList());

    System.out.println(list);
    /*System.out.println("\n👇 list.forEach using lambda: ");
    list.forEach(n -> System.out.println(n));*/
  }

  public static int powerRecursiveFunction(int base, int exponent) {
    if (exponent == 0) {
      return 1;
    } else {
      return (base * powerRecursiveFunction(base, (exponent - 1)));
    }
  }

}