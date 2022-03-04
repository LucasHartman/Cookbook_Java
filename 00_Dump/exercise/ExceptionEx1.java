/*

-- Overridden method exceptions
-   An overridden method must not declare any new or broader checked exceptions, but it
    is allowed to declare narrower exceptions or drop checked exceptions. 

-- covariant return type
-   it was not possible to override any method by changing the return type.
-   But it is possible to override method by changing the return type, 
    if the type is Non-Primitive.
-   example:

    class A {
        A get(){return this;}
    }

    class B extends A {
        @Override
        B get(){return this;} // B is a different return type (covariant return type)
    }

*/

class BubbleException extends Exception {}

class Fish {

    // The getFish() method is declared properly in the Fish class
    Fish getFish() throws BubbleException {
        throw new RuntimeException("fish!");
    }
}


public class ExceptionEx1 extends Fish {
    
    // successfully overridden
    // drop checked exceptions
    // The overridden method also uses a covariant return type.
    // final has no meaningful impact, since the method and class are not extended
    public final ExceptionEx1 getFish() {
        throw new RuntimeException("clown!");
    }
public static void main(String[] bubbles) {

    /*
    the call f.getFish() uses a Fish reference variable. 
    Since the Fish reference variable is used and 
    that version of the method declares a checked Exception, 
    the compiler enforces that the checked exception must be handled by the main() method. 
    Since this checked exception is not handled with a 
    try-catch block nor by the main() method declaration, the code does not compile
    */

    final Fish f = new ExceptionEx1();

    // the method declares a check Exception
    // It must be handled here
    try{
        f.getFish();
    } catch (BubbleException e) {
        System.out.println(e);
    } catch (RuntimeException e) {
        System.out.println(e);
    }

    System.out.println("swim!");
    }
}

// Long story short, exception that are thrown are not handed, their for is must be handled in the main(), by using a try/catch