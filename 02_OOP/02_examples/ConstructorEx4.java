
/*
--  Constructor Overloaded
-   Overloading a constructor means typing in multiple versions of the constructor, 
    each having a different argument list
-   Overloading a constructor is typically used to provide alternate ways for clients to instantiate
    objects of your class. For example, if a client knows the animal name, they can pass that to an
    Animal constructor that takes a string. But if they don’t know the name, the client can call the no-
    arg constructor, and that constructor can supply a default name. Here’s what it looks like:

*/

public class ConstructorEx4 {

    String name;

    // This is the Defalut constructor
    ConstructorEx4() { 
        this.name = "dog";
        System.out.println("Animal name: " + name); 
    }

    // Overloaded Constructor
    ConstructorEx4(String name) { 
        name = this.name;
        System.out.println("Animal name: " +name); 
    }





    public static void main(String[] args) {

        ConstructorEx4 obj = new ConstructorEx4(); // Animal name is dog
    }
}