/*
--  equals() vs ==
-   Source: https://www.geeksforgeeks.org/difference-between-and-equals-method-in-java/
-   equals()        method compares     value    (String.eqaults(String)
-   ==              operator compares   object   (Object == Object)
-   Example
    String bob = new String("bob");         new Object
    String notBob = bob;                    reference SAME OBJECT in the heap
    System.out.print((bob==notBob)+" "+(bob.equals(notBob)));   // true true


--  == operator
-   Reference comparison
-   Checks if both references points to same location or not.


--  equals()
-   equals() method should be used for content comparison
-   Evaluates the content to check the equality.
*/

    class Budgie {}

public class EqualsMethodEx1 {

    enum Color { RED, BLUE } // ; is optional

    public static void main(String[] args) {

        Budgie b1 = new Budgie(); // new object
        Budgie b2 = new Budgie(); // new object
        Budgie b3 = b1;           // inherit object

        String s1 = "Bob";        // new String
        String s2 = "Bob";        // String already exist in the heap

        Color c1 = Color.RED;
        Color c2 = Color.BLUE;


        // equals() Class Object comparison
        Boolean gb = b1.equals(b2);     // fasle    (different references)
        Boolean bs = b1.equals(b3);     // true     (same refrence)
        
        // equals() String comparison
        Boolean fg = s1.equals(s2); 
        System.out.println(fg);         // true     (same reference (String in the heap))

        // equals() enum comparison
        Boolean ec = c1.equals(c2);     // fasle    (different references)
    }
    
}
