/*
--  java.lang.StringBuilder
-   Source: https://www.javatpoint.com/StringBuilder-class
-   Used when you have to make a lot of modifications to strings of characters.
-   String objects are immutable, so if you choose to do a lot of manipulations with String objects 
    you will end up with a lot of abandoned String objects in the String pool.
-    On the other hand, objects of type StringBuilder can be modified over and over again without leaving 
    behind a great effluence of discarded String objects.
-   Methods:
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
11.         substring(int beginIndex, endIndex)                 return String from begin to end index 


--  StringBuilder capacity() method
-   Source: https://www.geeksforgeeks.org/stringbuilder-capacity-in-java-with-examples/
-   The capacity refers to the total amount of characters storage size in StringBuilder.
-   The default capacity of an (Empty) StringBuilder equals 16  
-   A StringBuilder Initialized with "Number of Characters" has a capacity of 16 + "Number of Characters"
-   If you append Characters the capacity remains, unless the added characters goes beyond current the capacity

*/

public class StringBuilderEx1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("abc"); // capacity = 16


        // Capacity in Actions
        System.out.println("capacity: " +sb.capacity()); // 16 + 3 = 19
        System.out.println("append:   " +sb.append("xyz"));
        System.out.println("capacity: " +sb.capacity()); // 19


        // StringBuilder Methods
        System.out.println("append          "+sb.append(3.132)); // 3.132f automatically converted to String
        System.out.println("length:         " +sb.length());
        System.out.println("reverse         "+sb.reverse());
        System.out.println("insert          "+sb.insert(3, "---"));
        System.out.println("delete          "+sb.delete(2,4));
        System.out.println("toString        "+sb.toString());
    }
}