/*
-- Abstract Class
-   An abstract class can contain both abstract and concrete methods, while an interface
    can only contain abstract methods.
-   The AbstractClass class is abstract; therefore, it cannot be instantiated
    Only concrete classes can be instantiated

    ChildClass shape = new AbstractClass();     // does not compile

-   A concrete class can extend an abstract class, and an
    abstract class can extend a concrete class. 
-   The protected, package-private, and public access
    modifiers can each be applied to abstract methods.
-   there is no requirement that an abstract class cannot contain a runnable main() method. 

*/

class Concrete {}

abstract class A extends Concrete {

    abstract void abstractMethod();

    protected abstract void abstractMethod2();

    // private abstract void abstractMethod3(); can't use private

    void concreteMethod() {}

    // private void concreteMethod2() {} private method is not visible

}

public class AbstractClass extends A {

    @Override
    void abstractMethod() {}

    public static void main(String[] args) {
        AbstractClass ref = new AbstractClass();
        ref.concreteMethod2();
    }
    
}
