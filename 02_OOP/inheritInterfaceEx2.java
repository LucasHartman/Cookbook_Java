/*
--  Abstract methods
-   Has a method signature (declaration)
-   Abstract method doesn't have a method body  (implementation)
-   It may have zero or more arguments.
-   Illegal combinations: final, static


Elements of Types               Classes             Interfaces
------------------------------------------------------------------
Instance variable               Yes                 Not applicable (don't work in an Interface)
Static variable                 Yes                 Only constants
Abstract methods                Yes                 Yes
Instance methods                Yes                 Java 8 default methods
Static methods                  Yes                 Java 8, inherited no, accessible yes
Constructors                     No                  Not applicable  (don't work in an Interface)
Initialization block            No                  Not applicable  (don't work in an Interface)
*/

interface MyInterface {

    // a1. abstract method
    void myAbstract(); 
}



public class InheritInterfaceEx2 implements  MyInterface {

    public static void main(String[] args) {

        // a3. Calling concreate method
        InheritInterfaceEx2 interfaceDemo = new InheritInterfaceEx2();
        interfaceDemo.myAbstract();
    }   



    // a2. abstract to concreate
    @Override
    public void myAbstract() { System.out.println("Now I'm a concreate method"); }
}