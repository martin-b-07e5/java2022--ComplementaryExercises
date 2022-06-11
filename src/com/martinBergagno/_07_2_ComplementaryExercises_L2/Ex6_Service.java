package com.martinBergagno._07_2_ComplementaryExercises_L2;

/* Ex6_Service
  A collection of Employees is available, for each employee is known:
    - firstName y lastName
    - DNI
    - hoursWorked
    - valuePerHour

  All employees are loaded into a set (HashSet),
    ✅ calculate the salary (hoursWorked x valuePerHour) of that entire list
     and then
    ✅ store in a Map (or Dictionary) where "the key is the dni" and "the value is the calculated salary".
  ------------------------------
  A HashSet is a collection of items where every item is unique, and it is found in the java.util package
  it does not guarantee that the order will remain constant over time. This class permits the null element.
  This class offers constant time performance for the basic operations (add, remove, contains and size),

  https://www.w3schools.com/java/java_data_types.asp

  https://www.w3schools.com/java/java_hashset.asp
  https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/HashSet.html
  https://www.programiz.com/java-programming/hashset

  https://www.w3schools.com/java/java_hashmap.asp
  https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/HashMap.html
  https://www.programiz.com/java-programming/hashmap
*/

import java.util.HashMap;
import java.util.HashSet;

public class Ex6_Service extends Ex6_Employee {

  //  constructor
  public Ex6_Service(String firstName, String lastName, int DNI, int hoursWorked, int valuePerHour) {
    super(firstName, lastName, DNI, hoursWorked, valuePerHour);
  }

  public static void main(String[] args) {

    HashSet<Ex6_Employee> employeesHS = new HashSet<>();
    HashMap<Integer, Float> employeesSalaryHM = new HashMap<>();

    //  All employees are loaded into a HashSet
    employeesHS.add(new Ex6_Employee("John F.", "Kennedy", 19610120, 6048, 150));
    employeesHS.add(new Ex6_Employee("Lyndon B.", "Johnson", 19631122, 18144, 150));
    employeesHS.add(new Ex6_Employee("Richard", "Nixon", 19690120, 15120, 150));
    employeesHS.add(new Ex6_Employee("Gerald", "Ford", 19740809, 9072, 150));
    employeesHS.add(new Ex6_Employee("Jimmy", "Carter", 19770120, 12096, 150));
    employeesHS.add(new Ex6_Employee("Ronald", "Reagan", 19810120, 24192, 150));
    employeesHS.add(new Ex6_Employee("George H. W.", "Bush", 19890120, 12096, 150));
    employeesHS.add(new Ex6_Employee("Bill", "Clinton", 19930120, 24192, 150));
    employeesHS.add(new Ex6_Employee("George W.", "Bush", 20010120, 24192, 150));
    employeesHS.add(new Ex6_Employee("Barack", "Obama", 20090120, 24192, 150));
    employeesHS.add(new Ex6_Employee("Donald", "Trump", 20170120, 12096, 150));
    employeesHS.add(new Ex6_Employee("Joe", "Biden", 20210120, 3024, 150));

    System.out.println("\nshow HashSet");
    for (Ex6_Employee i : employeesHS) {
      System.out.println(i.getFirstName() + " " + i.getLastName() +
          ", DNI: " + i.getDNI() +
          ", Hours worked: " + i.getHoursWorked() +
          ", Value per hour: $" + i.getValuePerHour() +
          " » Salary: $" + i.salary()  // calls the method for calculating the salary
      );
    }

    //  store in a HashMap  where "the key is the dni" and "the value is the calculated salary".
    for (Ex6_Employee i : employeesHS) {
      employeesSalaryHM.put(i.getDNI(), i.salary());
    }

    System.out.println("\nshow HashMap");
    /*
    System.out.println(" Print keys");
    for (Integer i : employeesSalaryHM.keySet()) {
      System.out.println("  DNI: " + i);
    }

    System.out.println(" Print values");
    for (Float i : employeesSalaryHM.values()) {
      System.out.println("  salary: $" + i);
    }
    */
    System.out.println(" Print keys and values");
    for (Integer i : employeesSalaryHM.keySet()) {
      System.out.println("  DNI: " + i + "  -  salary: $" + employeesSalaryHM.get(i));
    }

  }

}
