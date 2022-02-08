/*
--  Static methods
-   static methods contain the complete definition of the function 
-   static methods cannot be overridden or changed in the implementation class.



Elements of Types               Classes             Interfaces
------------------------------------------------------------------
Instance variable               Yes                 Not applicable (don't work in an Interface)
Static variable                 Yes                 Only constants
Abstract methods                Yes                 Yes
Instance methods                Yes                 Java 8 default methods
Static methods                  Yes                 Java 8, inherited no, accessible yes
Contructors                     No                  Not applicable
Initialization block            No                  Not applicable
*/

interface MyInterface {

    // b1. static method
    static void myStatic() { System.out.println( "Hello, New Static Method Here" ); }
}



public class InheritInterfaceEx2 implements  MyInterface {

    public static void main(String[] args) {

        // b1. Calling  static method from Interface
        MyInterface.myStatic();

        // Calling static method from Class
        myStatic();
    }   

    // Class static method
    static void myStatic() { System.out.println("Called from Class"); }
}