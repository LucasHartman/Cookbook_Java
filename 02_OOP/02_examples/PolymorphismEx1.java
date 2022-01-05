/*
--  Polymorphism and Inheritance
-   Polymorphism means "many forms", and it occurs when we have many classes 
    that are related to each other by inheritance.
-   Remember that any Java object that can pass more than one IS-A test 
    can be considered polymorphic.

--  Inheritance
-   it usually revolved around subclasses inheriting methods from their superclasses.
-   it’s now possible to inherit concrete methods from interfaces. 

Elements of Types               Classes             Interfaces
------------------------------------------------------------------
Instance variable               Yes                 Not applicable
Static variable                 Yes                 Only constants
Abstract methods                Yes                 Yes
Instance methods                Yes                 Java 8 default methods
Static methods                  Yes                 Java 8, inherited no, accessible yes
Contructors                     No                  Not applicable
Initialization block            No                  Not applicable





*/

interface A { 
    public int getValue();              // delcare method
}

class B implements A {
    public int getValue() { return 1; }     // initialize method
}

public class polymorphismEx1 extends B {

    // Polymorphism
    public void add( A a ) { 
        a.getValue();
    }

    // Polymorphism  (overloading)
    public void add( B b ) { 
        b.getValue();
    }

    // is not inheritind, so it is not polymorphism
    public void add( polymorphismEx1 c ) { 
        c.getValue();
    }

    // Polymorphism  (overloading)
    public void add( A a, B b ) { 
        a.getValue();
    }

    // // is not inheritind, so it is not polymorphism
    public void add( polymorphismEx1 c1, polymorphismEx1 c2 ) { 
        c1.getValue();
    }


}