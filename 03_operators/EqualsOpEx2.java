/*
--  == operator
-   Checks if the object in memory, whether its an primitive value or a memory address. 
-   case 1:     both sides are primitive (stored in the stack memory), 
                returns true if they both are equal
-   case 2:     1 side is primitive, the other reference variable (heap memory are reference pointer in the stack memory. 
                So all that is in the stack memory is the memory address)
                For example: left is primitive 1 and the right side is an array, this will return a false.
-   case 3:     Both side are reference variable, pointer to the same memory address equals true   
-   Checks if both references points to same location or not.

        System.out.println(new StringBuilder("zelda") == new StringBuilder("zelda")); // false
        System.out.println(3 == 3);                             // true
        System.out.println("bart" == "bart");                   // true    
        System.out.println(new int[0] == new int[0]);           // false  no objects just values
        System.out.println(LocalTime.now() == LocalTime.now()); // false  no objects just values
*/

class C1 {
    int c;
    C1(int c) {this.c = c; }
}

enum Days {
    M, T, W, TH, F, SA, SU 
}

public class EqualsOpEx2 {


    public static void main(String[] args) {
        
        int x = 1;
        int y = 1;
        int[] a = {1,2,3};
        int[] b = {1,2,3};
        C1 r1 = new C1(4);
        C1 r2 = new C1(4);
        C1 r3 = r1;

        System.out.println("compare primitives:     " + ( x==y) );      // true
        System.out.println("compare references:     " + ( a==b) );      // false
        System.out.println("compare references:     " + ( r1==r2) );    // false
        System.out.println("compare references:     " + ( r1==r3) );    // true
        System.out.println("compare ref. field:     " + ( r1.c==r2.c) ); // true
        System.out.println("compare enum:           " + ( Days.M==Days.M) ); // true
        System.out.println("compare enum:           " + ( Days.M==Days.W) ); // false
        System.out.println("compare non objects:    " + (new int[0] == new int[0]) ); // false (no objects)


    }
    
}
