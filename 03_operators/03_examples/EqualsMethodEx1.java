class Budgie {

}

public class EqualsMethodEx1 {

    /*
    -- equals() Method

    - Java inherits a method from class Object that tests to see if two
      objects of the class are “equal.” this method is called equals().
    - equals() method is used to determine if two objects of the same class
    - Understand two aspects of the equals() method:

        - What equals() means in class Object
        - What equals() means in class String


    -- equals() Method in Class Object

    - It works the same ways as == operators. If two references point to the same 
      object, the equals() method will return true.

    
    -- equals() Method Class String

    - Compare two strings, it will return true if the strings method, value ARE case sensitive.

*/

    enum Color { RED, BLUE } // ; is optional

    public static void main(String[] args) {

        Budgie b1 = new Budgie();
        Budgie b2 = new Budgie();
        Budgie b3 = b1;

        String s1 = "Bob";
        String s2 = "Bob";

        Color c1 = Color.RED;
        Color c2 = Color.BLUE;


        // equals() Method in Class Object
        Boolean gb = b1.equals(b2);
        Boolean bs = b1.equals(b3);
        System.out.println(gb); // false (not referring to the same class instance)
        System.out.println(bs); // true
        
        // equals() Method in Class String
        Boolean fg = s1.equals(s2); 
        System.out.println(fg); // true

        // Equality for enums
        Boolean ec = c1.equals(c2); // not the same
        System.out.println(ec); // false

    }
    
}
