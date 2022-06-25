package com.example4.demo4.ComplementaryExercisesLevel3;

/* Ex5
  ✅We have a list with objects of class Ex5_Student with the attributes:
   lastName, name and BirthDate (with types: String, String and LocalDate).
  ✅We want to generate a Map<String, Integer> where
   ✅the key of the Map will be the "lastname" concatenated with the "firstName" (with whitespace separator) and
   ✅the value will be the student's "age".
  ✅- The input list must be loaded with several students (at least 5) to upload the example and demonstrate its operation.
  ✅- The example is shown with only 1 student for brevity.
  👀- In the example LocalDate.now().minusYears(30) is used, in the exercise
       you should use another construction technique for the date (do not use .now() You can see methods .parse(), etc.)
Input:
  List<Ex5_Student> alumnos = List.of(new Ex5_Student("Homero", "Simpson", LocalDate.now().minusYears(30)));
Output:
  {"Simpson Homero"=30}

https://wahecode.com/java-convert-string-to-date/
https://www.tabnine.com/code/java/methods/java.time.Period/between
 */

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex5 {

  public static void main(String[] args) {
    List<Ex5_Student> students = List.of(
        new Ex5_Student("Homero", "Simpson", LocalDate.parse("1992-06-25")),
        new Ex5_Student("Marge", "Simpson", LocalDate.parse("1992-06-25")),
        new Ex5_Student("Lisa", "Simpson", LocalDate.parse("2010-06-25")),
        new Ex5_Student("Bart", "Simpson", LocalDate.parse("2014-06-25")),
        new Ex5_Student("Maggie", "Simpson", LocalDate.parse("2021-06-25")),
        new Ex5_Student("Abraham", "Simpson", LocalDate.parse("1945-06-25")),
        new Ex5_Student("Patty", "Bouvier", LocalDate.parse("1977-06-25")),
        new Ex5_Student("Selma", "Bouvier", LocalDate.parse("1977-06-25"))
    );

    Map<String, Integer> lnFnAge = students.stream()
        .collect(Collectors.toMap(
                s -> '"' + s.getLastName() + (" ") + (s.getFirstName()) + '"',
                s -> calculateAge(s.getBirthDate())
            )
        );

    System.out.println(lnFnAge);
  }

  private static int calculateAge(LocalDate birthDate) {
    return Period.between(birthDate, LocalDate.now()).getYears();
  }

}