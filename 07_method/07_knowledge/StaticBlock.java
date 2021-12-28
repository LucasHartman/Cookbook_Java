/**
 * 
 * static block (also called static clause)
 * 
 * - static keyword can be used to create a block to be used to initialize
 * static variables.
 * 
 * - The code inside the static block is executed only once: the first time the
 * class is loaded into memory
 * 
 * - static block executes automatically when the class is loaded in memory.
 * 
 * - instance init blocks run right after the call to super() in a constructor.
 * 
 * Initializer - set to the value or put in the condition appropriate to the
 * start of an operation.
 * 
 * 
 * 
 * Syntax static { statements... }
 *
 * 
 * 
 */

public class staticBlock {

   public static int LENGTH = 5;

   static {
      System.out.println("In static block"); // executed first
      LENGTH = 10;
   }

   public static void main(String[] arguments) {
      System.out.println("In main"); // executed second
      System.out.println(LENGTH); // 10
   }

}
