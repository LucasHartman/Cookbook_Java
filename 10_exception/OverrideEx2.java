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
   

    -- Override & Exception
    -   If the superclass method does not declare an exception, 
        subclass overridden method cannot declare the checked exception 
    -   but it can declare unchecked exception (exception thrown at compile time).
    
    -- Override & Narrow Exception
    -   If SuperClass declares an exception 
        and SubClass declares a child exception of the SuperClass declared Exception.
    */


class OverridParent {

    // Method, with a broad exception
    public void myMethod() throws RuntimeException {
        System.out.println("Content ");
    }
    
}

public class OverrideEx1 extends OverridParent {

    // Method Override
    // ArithmeticException is a child exception
    // of the RuntimeException
    // So the compiler won't give an error
    public void myMethod() throws ArithmeticException {
        System.out.println("Different Content");
    }








    public static void main(String[] args) {
        
        OverridParent obj1 = new OverridParent();
        obj1.myMethod();

        OverrideEx1 obj2 = new OverrideEx1();
        obj2.myMethod();


    }
}


