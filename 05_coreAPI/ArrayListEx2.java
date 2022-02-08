import java.util.ArrayList;
import java.util.List;

/*
--  ArrayList
-   The Java API provides an extensive range of classes that support common data structures such as 
    Lists, Sets, Maps, and Queues. "The Collection API"
-   The ArrayList class is in the java.util package.
-   ArrayList implements the List interface.
-   ArrayLists hold only object references, not actual objects and not primitives.
        int is being autoboxed (converted) into an Integer object and then added to the ArrayList.


--  Autoboxing
-   collections like ArrayList can hold objects but not primitives.
-   wrapper classes (e.g., Integer, Float, Boolean, and so on)
-   primitives still have to be wrapped before they can be
    added to ArrayLists, but autoboxing takes care of it for you.
*/


public class ArrayListEx2 {
    public static void main(String[] args) {

        List names = new ArrayList<>();

        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");

        if (names.remove("Bran")) {     // remove FIRST Bran, and return true, because Bran is in the list
            names.remove("Jon");        // remove Jon, but Jon is not in the list (return false)
        }

        System.out.println(names); // Robb, Rick, Bran
    }
}