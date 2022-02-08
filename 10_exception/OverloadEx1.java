/*

-- Method Override
-   SAME NAME & PARAMETER
-   Overriding means having two methods with the same method name and parameters
-   One of the methods is in the parent class and the other is in the child class.
-   Polymorphism applies to overriding, not to overloading.

-- Method Overload
-   SAME NAME, DIFFERENT PARAMETERS
-   Overloading occurs when two or more methods in one class 
-   same method name but different parameters.

-- Overload & Exception
- Can throw anything

*/

public class OverloadEx1 {

    // Method
    void myMethod() throws ArithmeticException {
        System.out.println("method 1");
    }

    // Method Overload
    void myMethod(int x) throws NullPointerException {
        System.out.println("method 2");
    }




    public static void main(String[] args) {
        
        OverloadEx1 obj = new OverloadEx1();
        obj.myMethod();
        obj.myMethod(4);
    }


}
