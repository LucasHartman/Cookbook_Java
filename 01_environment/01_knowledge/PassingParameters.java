/** Passing Parameters to a Java Program (Chapter 01)
 * - Let’s see how to send data to our program’s main() method.
 * - The code args[0] accesses the first element of the array.
 * - Spaces are used to separate the arguments.
 * 
 * Steps
 * 1. run file:         java PassingParameters Fish Taco
 * 2. output:           Fish Taco
 * 
 */

public class PassingParameters {
    public static void main(String[] args) {
        System.out.println(args[0]); // Fish
        System.out.println(args[1]); // Taco
     }
}
