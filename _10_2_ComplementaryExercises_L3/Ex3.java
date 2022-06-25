package com.example4.demo4.ComplementaryExercisesLevel3;

/* Ex3
  We have a list of Strings, from which TO KNOW the number of values that
   begin with the letter B (either upper or lower case, in that case we say
    that it will be ignoreCase).
Input:
  List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac",);
Output:
  3
https://www.tabnine.com/code/query/java.util.stream@Stream@count+%22startsWith%22
*/

import java.util.List;

public class Ex3 {

  public static void main(String[] args) {
    List<String> words = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
    int count = (int) words.stream()
        .filter(w -> w.startsWith("b") || w.startsWith("B"))
        .count();
    System.out.println(count);
  }

}