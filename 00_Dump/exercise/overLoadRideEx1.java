/*
-- Notes
-   This example shows how to handle the exception with overloaded methods. 
    You need to have a try catch block in each method or where the are used.
*/

abstract class A {

}

interface B {

    default void defaultMethod() throws Exception { 
        System.out.println("Interface - default method"); 
        int x = 1;
        try {
            x = 50/0;
        } catch (Exception e) {
            x = 50;
        }

    }

}

public class overLoadRideEx1 implements B {

    private int defaultMethod(int x) throws ArithmeticException  { 
        System.out.println("Concrete class - default method");
        try { 
            x = 50/0; 
        } catch (ArithmeticException e) { 
            x = 50;
        }
        return x; 
    }

    
}
