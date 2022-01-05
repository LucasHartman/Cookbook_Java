
/*
--  Static
-   static method or variable without having any instances of that class 
-   static variable of a class will be shared by all instances of that class; there is only one copy
-   

--  static main()
-   you can’t access a nonstatic (instance) variable from a static method( main() ). 

-- Rules
-   static method cannot acces an instance (nonstatic) variable
-   static method cannot acces an instance (nonstatic) method
-   static method CAN access a static method or variable
-   static methods can’t be overridden, but can be redefined in a subclass

*/

public class StaticEx1 {

    static int frogCount = 0;   // static variable
    int x = 3;                  // instance variable

    public StaticEx1() {
        frogCount +=1;
    }



    public static void main(String[] args) {

        new StaticEx1(); // create new constructor
        new StaticEx1(); // create new constructor
        new StaticEx1(); // create new constructor
        System.out.println("Frog count is now " +frogCount); // Frog count is now  3


        x=5; // ERRORL can’t access a nonstatic (instance) variable from a static method( main();
    }
}