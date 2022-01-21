/*
--  StringBuilder Class
-   java.lang.StringBuilder class should be used when you have to make a 
    lot of modifications to strings of characters.
-   As discussed in the previous section, String objects are immutable, so if you
    choose to do a lot of manipulations with String objects, you will end up with a lot of abandoned String
    objects in the String pool.
-    On the other hand, objects of type StringBuilder can be modified over and over again without leaving 
    behind a great effluence of discarded String objects.
-   The Default capacity (numbwe of inswzwa) of a StringBuilder is 16
-   The capacity is update automaticly
*/

public class StringBuilderEx1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("abc");    // capacity = 16 + arg lenght

        // StringBuilder Methods
        System.out.println("append          "+sb.append("def")); // you can also append numbers lke 3.132f
        System.out.println("reverse         "+sb.reverse());
        System.out.println("insert          "+sb.insert(3, "---"));
        System.out.println("delete          "+sb.delete(2,4));
        System.out.println("toString        "+sb.toString());
    }
}