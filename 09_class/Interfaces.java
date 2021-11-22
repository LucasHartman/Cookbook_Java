/**
 * ------------------------------------------------------------------ Interface
 * 
 * When you implement an interface, you are fufilling its constract
 * 
 * Rules ------------------------------------------------------------------
 * 
 * 1. Interface Definition Rules Interfaces cannot be instantiated(can't create
 * instance of).
 * 
 * 2. All top-level types, including interfaces, cannot be marked projected or
 * private.
 * 
 * 3. Inteface are assumed to be abstract and cannot be marked final.
 * 
 * 4. Interfaces may include zero or more abstact methods.
 * 
 * 5. An interace can extend any number of interfaces.
 * 
 * 6. An interface reference may be cast to any reference that inherits the
 * interface, although this may produce an exception at runtime if the classes
 * aren’t related.
 * 
 * 7. The compiler will only report an unrelated type error for an instanceof
 * operation with an interface on the right side if the reference on the left
 * side is a final class that does not inherit the interface.
 * 
 * 8. An interface method with a body must be marked default, private, static,
 * or private static (covered when studying for the 1Z0-816 exam).
 * 
 * ------------------------------------------------------------------ Abstract
 * Interface Method Rules
 * ------------------------------------------------------------------ 1.
 * Abstract methods can be defined only in abstract classes or interfaces.
 * 
 * 2. Abstract methods cannot be declared private or final.
 * 
 * 3. Abstract methods must not provide a method body/implementation in the
 * abstract class in which is it declared.
 * 
 * 4. Implementing an abstract method in a subclass follows the same rules for
 * overriding a method, including covariant return types, exception
 * declarations, etc.
 * 
 * 5. Interface methods without a body are assumed to be abstract and public.
 * 
 * ------------------------------------------------------------------ Interface
 * Variables Rules
 * ------------------------------------------------------------------ 1.
 * Interface variables are assumed to be public, static, and final.
 * 
 * 2. Because interface variables are marked final, they must be initialized
 * with a value when they are declared.
 * 
 * 
 */

interface MyInterfaces {

    // Interface method (does not have a body)
    // Are automaticly abstract and public
    // Cannot be declared private or final
    void sleep();

    // deafutl method
    default void dreaming() {
        System.out.print("I'm dreaming");
    }

    // Interface Variables
    // public, static, and final(constant ) by default.
    public static final int INTERFACEVAR = 69;
    int amount = 10;

}

interface MyInterfaces2 {

    // interface method (does not have a body)
    public void wake();

}

// Concreate Class
// Must implement all inherited abstract methods
// A concreate class can be marked as final
public class Interfaces implements MyInterfaces, MyInterfaces2 {

    // Implementing Abstract Method to Concreate
    // The body is provided here
    // Implementing an abstract method, follows the same rules as method override
    // If you add paremeter to this method, the method would be Overloaded, which is
    // not a correct way of implementations.
    // Method must be implemented with the public keyword, or it wound compile
    public void sleep() {
        System.out.println("Zzzz");
    }

    public void wake() {
        System.out.println("good morning");
    }

    public static void main(String[] args) {

        Interfaces obj = new Interfaces();
        obj.sleep();
        obj.wake();

    }

}
