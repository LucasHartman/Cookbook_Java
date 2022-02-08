
/*
-- Static
-   Source: https://www.javatpoint.com/static-keyword-in-java
-   Static is used for memory management mainly
-   We can apply static keyword with
    variables, methods, blocks and nested classes.
-   Static variable gets memory once in 
    the class area at the time of class loading.
-   Example:
    class Student {
        String name;                    // instance 
        static String college= "MIT"    // static 
    }

    
-- Static Method
-   A static method belongs to the class rather than the object of class.
-   A static method can be invoked without the need for creating an instance of the class
    ClassName.staticMethod()
-   A static method can access static data member and can change the value of it.
-   A static method can't non static data member or call non-static method
-   this and super cannot be used in static context.
-   Example:
    static void change() {
        college = "BOSTON"; // change static variable
        name = "Jeff"       // error non-static variable
    }


--  Static vs Instance Method or Block
-   An Instance method, constructor, instance initialization block to all static variables
-   Static methods and static initialization block cannot reference
    instance variables since they are defined across all instances
-   Example:
    public class A {
        public final static long staticVar;
        public final double instVar;
        {   staticVar   = 2; // legal
            instVar     = 8; // legal
        }   
        static {
            staticVar   = 1; // legal
            instVar     = 4; // illegal
        }
    }
        

-- Static Import
-   Source: https://www.geeksforgeeks.org/static-import-java/
-   We can access the static members of a class directly 
    without class name or any object.
-   Example:
    Math.sqrt() 
    sqrt()      // static import


--  Static main() method
-   you can’t access a non-static (instance) variable from a static method( main() ). 


-- Rules
-   static method cannot access an instance (non-static) variable
-   static method cannot access an instance (non-static) method
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