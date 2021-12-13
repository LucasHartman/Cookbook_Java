public class ChainingCatchEx1 {

    /*
    --  catch order
    -   1. you must be able to recognize if the exception is a checked  or an unchecked (Runtime) exception
    -   2. you need to determine whether any of the exceptions are subclasses of the others.
    -   It is not possible for both catch blocks to be executed when chained together like this.
    -   Java looks at them in the order they appear. 
    -   if it is impossible for one of the catch blocks to be executed, a compiler error about unreachable code occurs.
    -   when a superclass catch block appears before a subclass catch block. a compiler error about unreachable code occurs.
    */

    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        try {
            System.out.print(a/b); // 0 (runtime exception)
        } catch (RuntimeException e) { // (Super Class) caught here (ArithmeticException is a child class of RuntimeException)
            System.out.print(-1);
        } catch (ArithmeticException e) { // (Sub Class) unreachable code
            System.out.print(0); 
        } finally {
            System.out.print("done");
        }

    }
}