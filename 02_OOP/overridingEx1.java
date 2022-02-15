
/*
-- Overload
-   REUSE name
-   MUST change argument
-   MAY change return type
-   MAY change access modifier
-   MAY throw any exception thrown / not thrown

-- Override
-   Reuse name
-   MUST have same argument
-   MUST have same return type (or sub-type)
-   MAY narrow access modifier, but not widen
-   IF super-class method does not throw an exception,
    subclass overriding method can only throws the unchecked exception,
    throwing checked exception will lead to compile-time error.
-   IF super-class method throws an exception,
    subclass overriding method can only throw same or subclass exception
-   ALSO there is no issue if subclass overridden method is not throwing any exception.

-   default methods inside the interface can be overridden
-   static  methods can't be overridden
-   Private method can't be overridden
-   Final   methods can't be overridden
-   instance variables can't be overridden, they are there own value

--  Main()
-  The main method can be final
-  Final method can't be overridden
-  We can access final methods in the subclass but we can not override final methods.
*/

class Parent {

    // narrow access
    protected void accessMethod() {
        System.out.println("accessMethod:   protected method");
    }

    // broad exception
    public void exceptionMethod() throws RuntimeException {
        System.out.println("exceptionMethod:    broad exception ");
    }

    public void superMethod() {
        System.out.println("superMethod:    parent method");
    }
}






public class overridingEx1 extends Parent {
    
    // broad acces
    @Override
    public void accessMethod() {                        
        System.out.println("accessMethod:   public method");
    }

    // narrow exception
    @Override
    public void exceptionMethod() throws ArithmeticException {
        System.out.println("exceptionMethod:    narrow exception ");
    }

    // using super keyword
    @Override
    public void superMethod() {
        super.superMethod();
        System.out.println("superMethod:    Child method"); 
    }






    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new overridingEx1();

        // access example
        obj1.accessMethod(); // protected method
        obj2.accessMethod(); // public method

        // exception example
        obj1.exceptionMethod(); // broad exception
        obj2.exceptionMethod(); // narrow exception

        // super example
        // exception example
        obj1.superMethod(); // parent method
        obj2.superMethod(); // parent method    Child method
    }

}