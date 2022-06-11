package com.martinBergagno._07_2_ComplementaryExercises_L2;

/* Ex4_subList
  Load an arrayList with 12 student names (String),
   then separate them into 3 courses (3 arrayList) and print these courses.
  Help: Does Arraylist have a method to partition into sub-lists?

 https://www.programiz.com/java-programming/library/arraylist/sublist
 https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html#subList(int,int)
 */

import java.util.ArrayList;
import java.util.List;

public class Ex4_subList {

  public static void main(String[] args) {

    ArrayList<String> students = new ArrayList<>();
    students.add("James");
    students.add("Robert");
    students.add("John");
    students.add("Michael");  // 0-4
    students.add("David");
    students.add("William");
    students.add("Richard");
    students.add("Joseph");  // 4-8
    students.add("Thomas");
    students.add("Charles");
    students.add("Christopher");
    students.add("Daniel");  //  8-12

    List<String> course1 = students.subList(0, 4);
    List<String> course2 = students.subList(4, 8);
    List<String> course3 = students.subList(8, (students.size()));

    //    System.out.println(students.subList(0, 4));
    System.out.println("\n" + course1);
    for (int i = 0; i < course1.size(); i++) {
      System.out.println(course1.get(i));
    }

    //    System.out.println(students.subList(4, 8));
    System.out.println("\n" + course2);
    for (String s : course2) {
      System.out.println(s);
    }

    //    System.out.println(students.subList(8, (students.size())));
    System.out.println("\n" + course3);
    for (String s : course3) {
      System.out.println(s);
    }

  }

}
