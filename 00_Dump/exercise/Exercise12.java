/*
Note that line p2 accesses a static method using an instance reference,
which is discouraged but permitted in Java. 

First, a varargs int array of [0,0] is passed to the swing() method. 

The try block throws ArrayIndexOutOfBoundsException, since the third element is requested and the size
of the array is two. 

For this reason, the print() statement in the try block is not executed.

Next, since ArrayIndexOutOfBoundsException is a subclass of RuntimeException, the
RuntimeException catch block is executed and 2 is printed. 

The rest of the catch blocks are skipped, since the first one was selected. 

The finally block then executes and prints 4. Lastly,
control is returned to the main() method without an exception being thrown, and 5 is printed.
Since 245 is printed, Option D is the correct answer
*/

public class Exercise12 {

    public static void swing(int... beats) throws ClassCastException { // static method
        try {                                   // the try block is not executed.
            System.out.print("1"+beats[2]);     // p1   IndexOutOfBounds    
        } catch (RuntimeException e) {
        System.out.print("2");
        } catch (Exception e) { // The rest of the catch blocks are skipped, since the first one was selected.
        System.out.print("3");
        } finally {             // The finally block then executes
        System.out.print("4"); 
        }
    }
    public static void main(String... music) {
        new Exercise12().swing(0,0); // p2      First, a varargs int array of [0,0] is passed to the swing() method.
        System.out.print("5");
    }
}

// 2 4 5
