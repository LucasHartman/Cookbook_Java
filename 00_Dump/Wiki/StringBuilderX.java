/*
-- StringBuilder
-   java.lang.StringBuilder
-   Used when you have to make a lot of modifications to strings of characters.
-   StringBuilder is Mutable


-- Methods:
1           append(String s)                                    append the specified string
2           insert(int offset, String)                          insert the specified string
3           replace(int start Index, int endIndex, String str)  replace string
4           delete(int startIndex, int endIndex)                delete string from specified start and index
5           reverse()                                           reverse character order
6           capacity()                                          return character storage size
7.          ensureCapacity()                                    ensures minimum capacity
8.          charAt(int index)                                   returns the character a the given index
9.          length()                                            total number of characters
10.         substring(int beginIndex)                           return String for specified index
11.         substring(int beginIndex, endIndex)

--  StringBuilder capacity() method
-   Source: https://www.geeksforgeeks.org/stringbuilder-capacity-in-java-with-examples/
-   The capacity refers to the total amount of characters storage size in StringBuilder.
-   The default capacity of an (Empty) StringBuilder equals 16  
-   A StringBuilder Initialized with "Number of Characters" has a capacity of 16 + "Number of Characters"
-   If you append Characters the capacity remains, unless the added characters goes beyond current the capacity
*/

public class StringBuilderX {
public static void main(String[] args) {
     
    // Declare Empty StringBuilder
    StringBuilder sb = new StringBuilder();

    // Append
    sb.append("Hello"); // Hello

    // Insert
    sb.insert(3,"ooo");
    System.out.println(sb); // Helooolo

    // replace
    sb.replace(3,6,"aaa");
    System.out.println(sb); // Helaaalo


    StringBuilder sb1 = new StringBuilder("abc");
    StringBuilder sb2 = sb1;
    sb1.append("d");
    System.out.println(sb1 +" " +sb2 +" " +(sb1==sb2)); // abcd abcd true (different variable but same reference address)

    
    }
    
}
