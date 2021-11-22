/**
 * Absctract Class
 * 
 * - Abstract classes have important uses in defining a framework
 * 
 * 
 * ------------------------------------------------------------------------------------------------
 * Abstract Class Definition Rules
 * ------------------------------------------------------------------------------------------------
 * 1. Abstract classes cannot be instantiated (represent as or by an instance.)
 * 
 * InterfaceClass obj = new InterfaceClass(); // illegal
 * 
 * 2. All top-level types, including abstract classes, cannot be marked
 * protected or private
 * 
 * 3. Abstract classes cannot be marked final
 * 
 * 4. Abstract classes may include zero or more abstract and nonabstract
 * methods.
 * 
 * 5. An abstract class that extends another abstract class inherits all of its
 * abstract methods.
 * 
 * 6. The first concrete class that extends an abstract class must provide an
 * implementation for all of the inherited abstract methods.
 * 
 * 7. Abstract class constructors follow the same rules for initialization as
 * regular constructors, except they can be called only as part of the
 * initialization of a subclass.
 *
 * 
 * ------------------------------------------------------------------------------------------------
 * Abstract Method Defination Rules
 * ------------------------------------------------------------------------------------------------
 * 1. Abstract methods can be defined only in abstract classes or interfaces.
 * 
 * 2. Abstract method must not provide a method body/implementation in the
 * abstact claas in which they are declared.
 * 
 * 3. Abstract methods must not provide a method body/ implenmentation in the
 * abstract class in which they are declared.
 * 
 * 4. Implementing an abstact method in a subclass follows the same rules for
 * overriding a method, including covariant return types, excption declaration,
 * etc.
 * 
 * 
 */

// abstract Class
abstract class AbstractParent {

    // abstract method
    // must be marked with the abstact keyword
    public abstract String getName();

    // Concreate Method
    public void concreateMethod() {
        System.out.println("It's legal for me to be here");
    }

}

// Concrete Class
public class Abstracts extends AbstractParent {

    // Concreate Method
    public String getName() {
        return "Stork!";
    }

    public static void main(String[] args) {

        // initialize method
        new Abstracts().getName();

    }

}