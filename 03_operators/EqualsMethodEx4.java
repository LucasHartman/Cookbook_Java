/*
--  == operator
-   Reference comparison
-   Checks if both references points to same location or not.


--  equals()
-   equals() method should be used for content comparison
-   Evaluates the content to check the equality.
*/


public class Product {

    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class EqualsMethodEx4 {

    public static void main(String[] args) {

        Product pi = new Product(101, "Pen");
        Product p2 = new Product(101, "Pen"); // Same Content, different reference
        Product p3 = pi;

        boolean ans1 = pi == p2;                    // false (Compare Reference)
        boolean ans2 = pi.name.equals(p2.name);     // true  (Compare Content)

        System.out.print(ans1 +":" +ans2); // false true
    }
}
        

