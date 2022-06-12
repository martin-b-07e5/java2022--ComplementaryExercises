package _07_2_ComplementaryExercises_L2;

/*Ex1_ArrayList
  Create an ArrayList and load it with your favorite cities in Argentina, then print the ranking.
*/

import java.util.ArrayList;

public class Ex1_ArrayList {

  public static void main(String[] args) {

    ArrayList<String> cities = new ArrayList<>();
    cities.add("Resistencia");
    cities.add("Corrientes");
    cities.add("C.A.B.A.");

    System.out.println("Ranking (For)");
    for (int i = 0; i < cities.size(); i++) {
      System.out.println("#" + (i + 1) + " - " + cities.get(i));
    }

    System.out.println("\nRanking (For-each)");
    int i = 1;
    for (String city : cities) {
      System.out.println("#" + i + " - " + city);
      i++;
    }

  }
}
