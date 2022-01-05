
/*
--  Singleton
-   singleton class is a class that can have only one object at a time.
-   After first time, if we try to instantiate the Singleton class, 
    the new variable also points to the first instance created.
-   1. Make constructor private.
-   2. Write a static method that has return type object of this singleton class.
*/

class Singleton {

    // Static variable reference of single_instance of type Singleton
    private static Singleton single_instance = null;

    // Declaring a variable of type String
    public String s;

    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private Singleton() {
        s = "Hello I am a string part of Singleton class";
    }

    // Static method
    // Static method to create instance of Singleton class
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }
}






public class SingletonEx1 {
    public static void main(String args[]) {

    // Instantiating Singleton class with variable x
    Singleton x = Singleton.getInstance();
 
    // Instantiating Singleton class with variable y
    Singleton y = Singleton.getInstance();

    // Instantiating Singleton class with variable z
    Singleton z = Singleton.getInstance();



    // Condition check
    if (x == y && y == z) {
        // Print statement
        System.out.println("Three objects point to the same memory location on the heap i.e, to the same object"); // rsult
    } else {
        System.out.println("Three objects DO NOT point to the same memory location on the heap");}

    }
}