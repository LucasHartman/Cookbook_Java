
/*
--  Encapsulation
-   Encapsulation is about protecting the data elements.
-   supports flexibility and maintainability and extensibility


-- Protected
-   Can be applied to data members, method, and constructor
-   Modifier can't be applied to the top-level classes and interface.
-   Access all members
        1. The current package
        2. Child classes outside the package


-- Private
-   Can be applied to data members, method, and constructor
-   Modifier can't be applied to the top-level classes and interface.
-   Access all members
        1. only from within the class


-- Package (Default)
-   A class, method or variable declare without any access modifier,
    is considered package(default).
-   Access all members:
        1. The current package


--  Rules
1.  Keep instance variables hidden (with an access modifier, often private)
2.  Make public accessor methods, and force calling code to use those methods rather than
    directly accessing the instance variable. 
    These so-called accessor methods allow users of your
    class to set a variable’s value or get a variable’s value.
3.  For these accessor methods, use the most common naming convention of 
    set<SomeProperty> and get<SomeProperty>.


--  Access Methods
-    getters and setters, other terms accessors and mutator's
-   The point is, you can change your mind later 
    and add more code to your methods without breaking your API. <----------------


-- Same Package
-   you can access classes in the same package without using import keyword.
-   Example:
    package example;
    public class B{
    public static void main(String[] args){
        A myA = new A();
        }
    }
*/

public class EncapsulationEx1 {

    // instance variable hidden
    private String name;

    // accessor method, getter
    public String getName() {
        return name;
   }

   // accessor method - setter
    public void setName(String newName) {
        // add more code in the future without breaken your API
        name = newName;
    }



    public static void main(String[] args) {

    }
}