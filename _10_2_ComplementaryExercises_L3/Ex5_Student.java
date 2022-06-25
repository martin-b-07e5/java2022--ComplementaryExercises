package com.example4.demo4.ComplementaryExercisesLevel3;

import java.time.LocalDate;

public class Ex5_Student {

  private final String firstName;
  private final String lastName;
  private final LocalDate birthDate;

  public Ex5_Student(String firstName, String lastName, LocalDate birthDate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  /*public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }*/

}