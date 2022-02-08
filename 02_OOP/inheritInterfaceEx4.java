/*
--  Default Methods
-   Java provides a facility to create default methods inside the interface.
-   These methods are non-abstract methods.
-   You can override default method

Source; https://www.geeksforgeeks.org/default-methods-java/


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

    // default method
    default void myDefault(){
      System.out.println("Default Method Executed");
    }
}



public class InheritInterfaceEx4 implements  MyInterface {

    public static void main(String[] args) {

        // default method executed
        InheritInterfaceEx4 d = new InheritInterfaceEx4();
        d.myDefault();
    }
}