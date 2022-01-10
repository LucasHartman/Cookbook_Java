/*
--  Polymorphism and Inheritance
-   Polymorphism means "many forms", and it occurs when we have many classes 
    that are related to each other by inheritance.
-   Remember that any Java object that can pass more than one IS-A test 
    can be considered polymorphic.
-    Polymorphic method invocations apply only to overridden instance methods.

--  Inheritance
-   it usually revolved around subclasses inheriting methods from their superclasses.
-   it’s now possible to inherit concrete methods from interfaces. 

--  Reference Variable
-   A reference variable is always of a single, unchangeable type, 
    but it can refer to a subtype object. ( Parent obj = new Child() )
-   A single object can be referred to by reference variables of many different types—as
    long as they are the same type or a supertype of the object.
-   The reference variable’s type (not the object’s type) determines which methods can be called!



*/

interface A { 
    public int getValue();              // delcare method
}

class B implements A {
    public int getValue() { return 1; }     // initialize method
}

public class PolymorphismEx1 extends B {

    // Polymorphism
    public void add( A a ) { 
        a.getValue();
    }

    // Polymorphism  (overloading)
    public void add( B b ) { 
        b.getValue();
    }

    // is not inheritind, so it is not polymorphism
    public void add( PolymorphismEx1 c ) { 
        c.getValue();
    }

    // Polymorphism  (overloading)
    public void add( A a, B b ) { 
        a.getValue();
    }

    // // is not inheritind, so it is not polymorphism
    public void add( PolymorphismEx1 c1, PolymorphismEx1 c2 ) { 
        c1.getValue();
    }


}