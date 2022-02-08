
/*
-- Overriding
-   inherits a method from a supertype, you have the opportunity to override the method

-   SAME name, SAME argument list SAME return type 
-   access modifier must be the same or broader in the child method
-   Thrown checked exceptions NOT new or broader

-   Private methods can't be overridden
-   Static methods  can't be overridden
-   Final methods   can't be overriden.
*/

class Computer {
    protected final int process() { return 5; } // Final Method
}



public class OverridingEx2 {
    @Override
    public final int process() { return 3; } // attempts to override this method, resulting in a compilation erro



    public static void main(String[] chips) {
        System.out.println( new OverridingEx2.process());
    }
}