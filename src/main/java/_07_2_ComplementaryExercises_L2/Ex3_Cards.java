package _07_2_ComplementaryExercises_L2;

import java.util.ArrayList;
import java.util.Collections;

/* Ex3_Cards
Create a list containing as elements the numbering of cards of a French deck (only the values, not figures).
 You must.
  - load the ArrayList (in order), ✅
  - print, ✅
  - print in reverse order, ✅
  - shuffle (Disorder) the ArrayList, and print again. ✅

 Help: ArrayList implements the Collection interface,
  is there any method that allows me to do the sort operation (mix) randomly?
 Idem for the reverse side.

https://en.wikipedia.org/wiki/Standard_52-card_deck#Composition
https://en.wikipedia.org/wiki/French-suited_playing_cards

https://beginnersbook.com/2014/07/random-shuffling-of-an-array-in-java/

*/

public class Ex3_Cards {

  public static void main(String[] args) {
    ArrayList<Integer> valuesAL = new ArrayList<>();

    System.out.println("\nload the ArrayList (in order) and print it.");
    for (int i = 1; i < 14; i++) {
      valuesAL.add(i);
    }

    for (int i = 0; i < valuesAL.size(); i++) {
      System.out.println(valuesAL.get(i));
    }

//    ArrayList<Integer> valuesAL_reverse = (ArrayList<Integer>) valuesAL.clone();  // clone

    System.out.println("\nprint valuesAL in reverse order");
//    Collections.sort(valuesAL, Collections.reverseOrder());  // reverse
    valuesAL.sort(Collections.reverseOrder());  // reverse
    for (Integer i : valuesAL) {
      System.out.println(i);
    }

    System.out.println("\nshuffle (disorder) the ArrayList, and print again");
    Collections.shuffle(valuesAL);
    for (Integer i : valuesAL) {
      System.out.println(i);
    }

  }

}
