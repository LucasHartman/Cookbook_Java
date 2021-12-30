/*
--  Abstract methods
-   Has a method signature (declaration)
-   Abstract method doesn't have a method body  (implementation)
-   It may have zero or more arguments.
-   An abstract method do not have a body.
-   Illegal combinations: final, static


Elements of Types               Classes             Interfaces
------------------------------------------------------------------
Instance variable               Yes                 Not applicable (don't work in an Interface)
Static variable                 Yes                 Only constants (see example below)
Abstract methods                Yes                 Yes
Instance methods                Yes                 Java 8 default methods
Static methods                  Yes                 Java 8, inherited no, accessible yes
Contructors                     No                  Not applicable  (don't work in an Interface)
Initialization block            No                  Not applicable  (don't work in an Interface)
*/

interface MyInterface {

    // a1. abstract method
    void myAbstract(); 
}



public class inheritInterfaceEx2 implements  MyInterface {

    public static void main(String[] args) {

        // a3. Calling concreate method
        inheritInterfaceEx2 interfaceDemo = new inheritInterfaceEx2();
        interfaceDemo.myAbstract();
    }   



    // a2. abstract ot concreate
    @Override
    public void myAbstract() { System.out.println("Now I'm a concreate method"); }
}