/*
                        Object
                        |
                        |
    ------------------ Throwable --------------------
    |                                               |
    |                                               |
    --  Exceptions (Checked)                        -- Error
    |
    |
    --  Checked Exceptions 
        (IO or Compile-Time)
    |
    |
    --  Unchecked Exceptions 
        (Runtime or NullPointer)


-- Override
-   Reuse name
-   MUST have same argument
-   MUST have same return type (or sub-type)
-   overridden method (i.e. declared in subclass) must not be more restrictive.


-- Rules

-   If the superclass method does NOT declare an exception, 
    subclass overridden method CANNOT declare the CHECKED exception but it CAN declare UNCHECKED exception.

    Parent  { method(){} }
    Child   { method() throws RuntimeException {} } // Legal
    Child   { method() throws Exception{} } // Cannot Compile

-   If the superclass method declares an exception, subclass overridden method can declare SAME, 
    subclass (NARROWER) exception or NO exception but cannot declare parent (BROADER) exception.

    Parent  { method() {} throws Exception {} }
    Child   { method() {} throws Exception {} }     // Legal
    Child   { method() {} trhows Throwable {} }     // Cannot Compile
    Child   { method() {} throws ExceptionIO {} }   // Legal


    Parent  { method() {} trhows RuntimeException {} }
    Child   { method() {} throws Exception {} }         // Cannot Compile

    Parent  { method() {} trhows Exception {} }
    Child   { method() {} throws RuntimeException {} }  // Legal


    */

class MyException extends Exception {}


class Parent {
    void doStuff() throws RuntimeException {}
    void moreStuff() throws Exception {}
}


class Child extends Parent {
    @Override
    public void doStuff() throws ArithmeticException {} // Narrower UnCheck Exception (or zero, same, new)
    @Override
    void moreStuff() throws MyException {} // Narrow Checked Exception (or zero, same)
}


public class OverrideException extends Child {
    public static void main(String[] args) {
        try {
            new OverrideException().doStuff();
            new OverrideException().moreStuff();
        } catch ( Exception e) { }
        
    }
    
}
