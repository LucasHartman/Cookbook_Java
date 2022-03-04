/*
A. final int min, max = 100;
B. final int min = 0, max = 100;
C. int min, max = 100;
D. int min = 0, max = 100;
E. static int min, max = 100;           
F. static int min = 0, max = 100;

E, F. A static method is not allowed to access instance variables without an instance
of the class, making Options E and F correct. Notice that only max is initialized to 100 in
Option E. Since min doesn’t have a value specified, it gets the default value, which is 0.
*/

public class Exercise6 {
    // INSERT CODE
    static int min, max = 100;  // min = default 0           
    static int min = 0, max = 100;

public static void main(String[] math) {
    System.out.println(max - min); // call static values
    }
}
