package com.martinBergagno._07_2_ComplementaryExercises_L2;

/*Ex2_ArrayList
 * Create an ArrayList, add 5 integers. ✅
 * Then add an integer at the beginning of the list and another at the end. ✅
 * Finally, iterate and print the list items ✅
 *  and the list size (before and after adding in the first and last position). ✅
 */

import java.util.ArrayList;

public class Ex2_ArrayList {

  public static void main(String[] args) {

    ArrayList<Integer> integersAL = new ArrayList<>();

    // Create an ArrayList, add 5 integers. ✅
    for (int i = 1; i <= 5; i++) {
      integersAL.add(i * 100);
    }
    System.out.println(integersAL);

    // Then add an integer at the beginning of the list and another at the end. ✅
    int sizeBefore = integersAL.size();
    integersAL.add(0, 5);
    integersAL.add(55);
    int sizeAfter = integersAL.size();

    // Finally, iterate and print the list items ✅
    System.out.println("\nfor");
    for (int i = 0; i < integersAL.size(); i++) {
      System.out.println(integersAL.get(i));
    }

    // Finally, iterate and print the list items ✅
    System.out.println("\nenhanced for");
    for (Integer integer : integersAL) {
      System.out.println(integer);
    }

    // the list size (before and after adding in the first and last position)
    System.out.println("\nsize before add: " + sizeBefore);
    System.out.println("size after add: " + sizeAfter);

  }
}
