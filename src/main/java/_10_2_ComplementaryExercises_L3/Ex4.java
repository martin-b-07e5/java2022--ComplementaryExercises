package _10_2_ComplementaryExercises_L3;

/*Ex4
  We have an Integer list, from which we want to obtain another list by applying
   the factorial operation, but we don't want repeated values.
Input:
  List<Integer> palabras = List.of(1, 2, 4, 4, 4);
Output:
  [1, 2, 24]

👀 $HOME/IdeaProjects/java2022/src/main/java/_04_Activities/Ex2_factorial/Ex2_factorial.java

https://www.tabnine.com/code/java/methods/java.util.stream.Stream/distinct
https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#map-java.util.function.Function-
https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#distinct--
https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#collect-java.util.stream.Collector-
*/

import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 4, 4, 4);

    List<Integer> list = numbers.stream()
        .map(number -> factorial(number))
        .distinct()
        .collect(Collectors.toList());

    System.out.println(list);
  }

  public static int factorial(int number) {
    if (number == 0)
      return 1;
    else
      return (number * factorial(number - 1));
  }

}