/*
-- indexOf() method
-   Returns the first occurrence of the specified character or -1, if the character does not occur.
*/

public class IndexOfEx1 {

    public static void main(String[] args) {

        String myString = "Hello";
        
        // find first occurrence of the specified character
        System.out.println(myString.indexOf('H')); // 0
        System.out.println(myString.indexOf('o')); // 4

        // if the character does not occur
        System.out.println(myString.indexOf('a')); // -1
        System.out.println(myString.indexOf('k')); // -1

        // start searching from selected index position
        System.out.println(myString.indexOf('l', 1)); // 2
        System.out.println(myString.indexOf('l', 3)); // 3
        
    }
}