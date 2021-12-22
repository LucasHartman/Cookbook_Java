/**
 * Following Order of Initialization
 * - This is simply the order in which different methods, constructors, or blocks are called when an instance of the class is created
 * - Fields and instance initializer blocks are run in the order in which they appear in the file.
 * - The constructor runs after all fields and instance initializer blocks have run.
 * 
 * 
 * 
 */


public class OrderOfInitialization {
    private String name = "Fluffy";
     { System.out.println("setting field"); } // initialize 2nd
     
     public OrderOfInitialization() {
        name = "Tiny";
        System.out.println("setting constructor"); // initialize 3nd
     }

     public static void main(String[] args) {
        System.out.println("Main 1"); // initialize 1st
        OrderOfInitialization chick = new OrderOfInitialization();
        System.out.println("Main 2"); // initialize 4nd
    }
}
