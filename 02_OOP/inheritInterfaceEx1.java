/*

-- Inheritance
-   Inheritance allows a type to be a subtype of a supertype and thereby inherit public and
    protected variables and methods of the supertype
-  Inheritance is a key concept that underlies IS-A, polymorphism, overriding, overloading,
    and casting.
-   All classes (except class Object) are subclasses of type Object, and therefore they
    inherit Object’s methods.


--  Static variable
-   an interface can contain variables like int, float and string too.
-   interface, variables are static and final by default. 
    - Static:   Only ONE COPY of each static variable per class. They're stored in the static memory
    - Final:    You cannot change the value of final variable (Its a constant).
-   All variables in an interface in java should have only public access modifier.
-   You don’t have to write public, static and final before interface variable

--  Interface
-   When you implement an interface, you are fulfilling its contract.
-   You implement an interface by properly and concretely implementing all the abstract
    methods defined by the interface.
-   A single class can implement many interfaces
-   Imagine you are working with another team to build an application. You are developing
    code that uses a class that the other team has not finished writing yet.
    If the two teams agree on a common interface, one
    developer can write code that uses the interface, while another developer writes code that
    implements the interface.



Elements of Types               Classes             Interfaces
------------------------------------------------------------------
Instance variable               Yes                 Not applicable (don't work in an Interface)
Static variable                 Yes                 Only constants (see example below)
Abstract methods                Yes                 Yes
Instance methods                Yes                 Java 8 default methods
Static methods                  Yes                 Java 8, inherited no, accessible yes
Contractors                     No                  Not applicable
Initialization block            No                  Not applicable
*/

interface MyInterface {

    // Instance Variable
    // public int myVar;            // illegal - final variable must be declared with a value
    // private int myVar2 = 1;  	// illegal - can't use private in an interface
    
    public static final int myVar1 = 1; // legal -  you don't have to add "public static final" (but it makes it easer to read)
}



public class InheritInterfaceEx1 implements  MyInterface {

    int static myVar1 = 100; // Illegal - myVar1 already exist in the Static Memory and can't be changed

    public static void main(String[] args) {

        // call static variable
        System.out.println(MyInterface.myVar1);

        // Illegal
        System.out.println(myVar1); // error: non-static variable myVar1 cannot be referenced from a static context
        System.out.println(InheritInterfaceEx1.myVar1); // error: <identifier> expected
    }   
}