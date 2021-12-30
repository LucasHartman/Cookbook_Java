/*
--  Default Methods
-   

Source; https://www.geeksforgeeks.org/default-methods-java/


Elements of Types               Classes             Interfaces
------------------------------------------------------------------
Instance variable               Yes                 Not applicable (don't work in an Interface)
Static variable                 Yes                 Only constants (see example below)
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



public class inheritInterfaceEx4 implements  MyInterface {

    public static void main(String[] args) {

        // default method executed
        inheritInterfaceEx4 d = new inheritInterfaceEx4();
        d.myDefault();
    }
}