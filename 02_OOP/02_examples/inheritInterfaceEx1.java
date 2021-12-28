/*


Elements of Types               Classes             Interfaces
------------------------------------------------------------------
Instance variable               Yes                 Not applicable
Static variable                 Yes                 Only constants
Abstract methods                Yes                 Yes
Instance methods                Yes                 Java 8 default methods
Static methods                  Yes                 Java 8, inherited no, accessible yes
Contructors                     No                  Not applicable
Initialization block            No                  Not applicable

--  Instance variable
-   an interface can contains variables like int, float and string too.
-   interface, variables are static and final by default. 
    - Static:   Only ONE COPY of each static variable per class. They're stored in the static memory
    - Final:    You cannot change the value of final variable(It will be constant).
-    All variables in an interface in java should have only public access modifier.
-   Note that if we don’t write public, static and final before interface variable

*/

interface MyInterface {

    // Instance Variable
    // public int myVar;            // illegal - final variable must be declared with a value
    // private int myVar2 = 1;  	// illegal - can't use private in an interface
    public static final int myVar1 = 1;


}



public class inheritInterfaceEx1 implements  MyInterface {

    int static myVar1 = 100; // illegal - myVar1 already exist in the Static Memoery

    public static void main(String[] args) {

        // call static variable
        System.out.println(MyInterface.myVar1);

        // Illegal
        System.out.println(myVar1); // error: non-static variable myVar1 cannot be referenced from a static context
        System.out.println(inheritInterfaceEx1.myVar1); // error: <identifier> expected
    
    }   

}