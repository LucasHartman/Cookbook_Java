public class StringsEx1 {

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
    -   

    */

    public static void main(String[] args) {

        // create a new String object
        String s = new String();
        s = "abcdef";

        String s = new String("abcdef")

        String s = "abcdef";

    }
}