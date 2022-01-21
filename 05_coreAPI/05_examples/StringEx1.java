/*
--  String Class
-   Strings Are Immutable Objects
-   each character in a string is a 16-bit Unicode character.
-   strings are objects. As with other objects, you can create an 
    instance of a string with the new keyword.  


--  immutable
-   Once you have assigned a String a value, that value can never change—it’s immutable
-   When changeing the string the reference (s) will refer to a new String, 
    but the old one would still exist in memory, but has no reference.


--  String and Memeory
-   To make Java more memory efficient, the JVM sets aside a special 
    area of memory called the String constant pool
-   When the compiler encounters a String literal, 
    it checks the pool to see if an identical String already exists.
-   If a match is found, the reference to the new literal is directed to the existing String, 
    and no new String literal object is created. 
*/
    
public class StringEx1 {
    public static void main(String args[]) {

        // create a new String object (Long)
        String s = new String();
        s = "ABCDEF";

        // create a new String object
        //String s = new String("abcdef");

        // create a new String object (Short)
        //String s = "abcdef";

        s.toLowerCase();            // no assignment, create a new, abondoned String
        System.out.println(s);      // ABCDEF


        // String Methods
        System.out.println("charAt              "+s.charAt(0));
        System.out.println("concat              "+s.concat("cat"));
        System.out.println("equalsIgnoreCase    "+s.equalsIgnoreCase("ABCDEF"));
        System.out.println("length              "+s.length());
        System.out.println("replace             "+s.replace('A', 'z'));
        System.out.println("substring           "+s.substring(0,2));
        System.out.println("toLowerCase         "+s.toLowerCase());
        System.out.println("toString            "+s.toString());
        System.out.println("toUpperCase         "+s.toUpperCase());
        System.out.println("trim                "+s.trim()); // remove spaces, front/back

    }
}