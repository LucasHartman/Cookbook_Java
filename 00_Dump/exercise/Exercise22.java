/*
In Java, String is a class and not a primitive. 
This means it needs to begin with an uppercase letter in the declaration. 

The code does not compile,
If this was fixed, the answer would be Option B
*/

public class Exercise22 {
    public static void main(String[] args) { 
        string bike1 = "speedy";                // String not string
        string bike2 = new String("speedy");    // String not string

        boolean test1 = bike1 == bike2;             // false
        boolean test2 = bike1.equals(bike2);        // true
        System.out.println(test1 + " " + test2);    // false true
    }
}
