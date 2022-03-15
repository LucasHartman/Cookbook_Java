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

-- Super Method can have:
-   Any Exceptions
-   Unchecked Exception
-   Checked Exception


--  Override Method can only do:
    - New       Unchecked Exception
    - Same      Unchecked Exception
    - Narrower Unchecked Exception
    - Can't throw Checked Exception


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
