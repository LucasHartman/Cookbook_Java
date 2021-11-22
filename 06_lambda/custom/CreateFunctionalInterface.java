
    /**
     * Creating your own functionla interface 101
     * Steps:
     * 1. Define a function interface, which has a Single Abstract Method
     * 2. Declare the sing abstract metod by turning it into a lambda expression
     * 3. Initiate the lambda expression
     * 
     * 
     * 
     * functionla interface
     * - Any interface with a SAM(Single Abstract Method)
     * - a functional interface may still have multiple default methods.
     * - It's recommended that all functional interfaces have an informative @FunctionalInterface annotation.
     * - @FunctionalInterface annotation is used to ensure that the functional interface can’t have more than one abstract method. 
     * 
     * 
     * 
     * Functional Interfaces Can Be Implemented by a Lambda Expression
     * - A Java lambda expression implements a single method from a Java interface. 
     * 
     * 
     * 
     * lambda expressions
     * - A lambda is an anonymous function
     * 
     * 
     */

//  functional interface 
// Can be implemented by a Java Lambda Expression
@FunctionalInterface
interface MyFunctionalInterface {

    // 1. define
    // single non-implemented method, a.k.a SAM (Single Abstract Method)
    int calculate(int x);



    // defulat method
    // a functional interface may still have multiple default methods
    public default void print(String text) {
        System.out.println(text);
    }



    // static method
    // a functional interface may still have multiple static methods
    public static void printText(String text) {
        System.out.print(text);
    }

}





// In this class were running the FunctionlInterface in a Lambda Expression
class CreateFunctionalInterface {
    public static void main(String args[]) {

        // input value
        int a = 5;
 
        // 2. Declare
        // Define the "calculate method" in a lambda expression  
        MyFunctionalInterface s = (int x)->x*x;
 
        // 3. Initiate
        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans); // 25
    }
}
