package _10_2_ComplementaryExercises_L3;

/* Ex1
  Given a list containing String values,
   all values that are NOT null or empty ("") should be filtered.
https://beginnersbook.com/2017/10/java-8-filter-null-values-from-a-stream/
https://beginnersbook.com/2017/10/method-references-in-java-8/
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ex1 {

  public static void main(String[] args) {
    List<String> words = new ArrayList<>();
    words.add("Hello");
    words.add(null);
    words.add("Informatory");
    words.add("");

    List<String> list = words.stream()

        // 👇 Filter null values from a stream
//        .filter(str -> str != null)
        .filter(Objects::nonNull)

        // 👇 Filter empty values from a stream
//        .filter(str -> !str.equals(""))
//        .filter(str -> !str.isBlank())
        .filter(str -> !str.isEmpty())

        .collect(Collectors.toList());

//    list.forEach(System.out::println);
    System.out.println(list);
  }

}