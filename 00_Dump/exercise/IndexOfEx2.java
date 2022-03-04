/*
-- indexOf() method
-   Returns the first occurrence of the specified character or -1, if the character does not occur.

-- solution
-   The first time through the loop, we are calling indexOf on an empty
    StringBuilder. This returns -1. Since we cannot insert at index -1, the code throws a
    StringIndexOutOfBoundsException.
*/

public class IndexOfEx2 {
    public static void main(String... books) {

    StringBuilder sb = new StringBuilder(); // declare, empty

    for (String book : books)           // loop empty StringBuilder
    sb.insert(sb.indexOf("c"), book);   // no "c" no variable(book), returns -1, StringIndexOutOfBoundException
    System.out.println(sb);             // The code compiles but throws an exception at runtime
    }
}