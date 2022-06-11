package com.martinBergagno._07_2_ComplementaryExercises_L2;

/* Ex5_hoursWorked
  Given 2 ArrayList containing
   hours worked (array1) and
    hourly value (array2),
     from the weekly hour load summary of an employee.

  Another list should be generated containing totals and
   then print
    the total to be collected.
*/

import java.util.ArrayList;

public class Ex5_hoursWorked {

  public static void main(String[] args) {

    ArrayList<Integer> hoursWorked = new ArrayList<>();
    ArrayList<Integer> hourlyRate = new ArrayList<>();
    ArrayList<Integer> totalPerDay = new ArrayList<>();

    hoursWorked.add(9);
    hoursWorked.add(10);
    hoursWorked.add(12);
    hoursWorked.add(6);
    hoursWorked.add(8);

    hourlyRate.add(25);
    hourlyRate.add(26);
    hourlyRate.add(35);
    hourlyRate.add(23);
    hourlyRate.add(24);

    //    load array totalPerDay
//    int totalHoursWorkedPerWeek = 0;
    for (int i = 0; i < hoursWorked.size(); i++) {
      totalPerDay.add(hoursWorked.get(i) * hourlyRate.get(i));
//      totalHoursWorkedPerWeek += hoursWorked.get(i);
    }
//    System.out.println("\nTotal hours worked per week: " + totalHoursWorkedPerWeek);

    //    scroll array totalPerDay
    int weeklyTotal = 0;
    for (Integer day : totalPerDay) {
      weeklyTotal += day;
    }

    // the exercise only asks to show this.
    System.out.println(totalPerDay);
    System.out.println("Weekly Total: U$D " + weeklyTotal);

/* print additional information
    int weeklyTotalX = 0;
    for (int i = 0; i < totalPerDay.size(); i++) {
      System.out.println("\nday " + (i + 1) +
          "\nHours Worked: " + hoursWorked.get(i) +
          "\nHourly rate: U$D " + hourlyRate.get(i) +
          "\nTotal day: U$D " + totalPerDay.get(i)
      );
      weeklyTotalX += totalPerDay.get(i);
    }
    System.out.println("\nWeekly Total: U$D " + weeklyTotalX);
*/

  }

}
