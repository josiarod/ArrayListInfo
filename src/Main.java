import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args){

    /*  Limitations of Arrays

        1) Fixed size, once declared, it cannot be changed later on
        2) Because of the fixed size, if we have empty elements in the array, it takes up unnecessary space in memory
        3) We cannot reorder or add items efficiently, it would require a new array

     */

    // Note:  We may choose to use arrays over ArrayLists when we know the number of items
    //        Using arrays is faster than ArrayLists when processing

    /***************************************************************************************************
     *   ARRAYS                                 |    ARRAYLISTS
     * -------------------------------------------------------------------------------------------------
     * Declaration:                             |
     *    String[] colors = new String[3];      |   ArrayList<String> colors = new ArrayList<>();
     * -------------------------------------------------------------------------------------------------
     * Assigning values:                        | Adding values:
     *    colors[0] = "blue";                   |   colors.add("blue");
     * -------------------------------------------------------------------------------------------------
     * Removing items:                          |
     *    You cannot delete items from arrays   |   colors.remove("blue") or colors.remove(0)
     * -------------------------------------------------------------------------------------------------
     * Getting the number of items:             |
     *    colors.length;                        |   colors.size();
     * -------------------------------------------------------------------------------------------------
     * Looping through and printing the values: | Enhanced for loop (can be used for arrays):
     *    for(int i=0; i<colors.length; i++) {  |   for(String s : colors) {
     *         System.out.println(colors[i]);   |       System.out.println(s);
     *    }                                     |   }
     ****************************************************************************************************/


    // Declare an array list of words
    ArrayList<String> words = new ArrayList<>();

    // Add words to the array list
    words.add("snowy");
    words.add("cloudy");
    words.add("rainy");
    words.add("sunny");
    words.add("foggy");

    // Check if list contains the word "snowy"
    if(words.contains("snowy")){
      System.out.println("Snowy found!\n");
    }

    // Check if list is empty
    if(words.isEmpty()){
      System.out.println("List empty!\n");
    }
    else {
      System.out.println("List is not empty!\n");
    }

    // Get the word at index 2
    System.out.println(words.get(2) + "\n");

    // Sort the list of words alphabetically
    Collections.sort(words);

    // Print out list after sorting
    System.out.println("List after sorting:");
    for(String s : words) {
      System.out.println(s);
    }
  }
}
