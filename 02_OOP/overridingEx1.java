
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