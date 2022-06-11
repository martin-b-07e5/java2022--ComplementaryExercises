package com.martinBergagno._07_2_ComplementaryExercises_L2;

public class Ex6_Employee {
  private final String firstName;
  private final String lastName;
  private final int DNI;
  private final int hoursWorked;
  private final int valuePerHour;

  public Ex6_Employee(String firstName, String lastName, int DNI, int hoursWorked, int valuePerHour) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.DNI = DNI;
    this.hoursWorked = hoursWorked;
    this.valuePerHour = valuePerHour;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getDNI() {
    return DNI;
  }

  public int getHoursWorked() {
    return hoursWorked;
  }

  public int getValuePerHour() {
    return valuePerHour;
  }

  public float salary() {
    return hoursWorked * valuePerHour;
  }
}
