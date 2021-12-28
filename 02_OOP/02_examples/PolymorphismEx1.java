/*
--  Polymorphism and Inheritance
-   Polymorphism means "many forms", and it occurs when we have many classes 
    that are related to each other by inheritance.


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

public class PolymorphismEx1 extends B {

    // Polymorphism
    public void add( A a ) { 
        a.getValue();
    }

    // Polymorphism
    public void add( B b ) { 
        b.getValue();
    }

    // is not inheritind, so it is not polymorphism
    public void add( PolymorphismEx1 c ) { 
        c.getValue();
    }

    // Polymorphism
    public void add( A a, B b ) { 
        a.getValue();
    }

    // // is not inheritind, so it is not polymorphism
    public void add( PolymorphismEx1 c1, PolymorphismEx1 c2 ) { 
        c1.getValue();
    }


}