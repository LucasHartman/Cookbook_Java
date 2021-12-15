public class ArrayListEx1 {

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
    -   


    */

    public static void main(String[] args) {

        // declare & construct
        List<String> c = new ArrayList<String>(); 


        // initilize
        c.add("Rome");
        c.add("Naples");
        c.add("Rome");


        // Methods
        s.add("Amsterdam");
        s.get(1);
        s.size();
        s.contains("Amsterdam");
        s.indexOf("Amsterdam");
        s.remove(1);
        s.revmoe("Amsterdam"); // first in list
        s.clear();


        // Wrap (autoboxing)
        Integer y = new Integer(555);   // wrap 
        int x = y.intValue();           // unwrap
        
        



    }
}