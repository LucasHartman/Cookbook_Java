/*
Source: https://www.baeldung.com/java-type-casting

Reference Casting

In both cases, we're “turning” one type into another.

reference variable only refers to an object but doesn’t contain the object itself.

And casting a reference variable doesn’t touch the object it refers to but only labels this object in another way, 
expanding or narrowing opportunities to work with it. 


Upcasting narrows the list of methods and properties available to this object
Casting from a subclass to a superclass is called upcasting.
In my own words: your reference varialbe gets narrowed down by going up the tree: subclass to parentclass


Downcasting can extend it
casting from a superclass to a subclass.

*/

class Parent {
    String name;

    void method() {
        System.out.println("Method from Parent");
    }

}

// Child Class
class Child extends Parent {
    int id;

    @Override
    void method() {
        System.out.println("Method from Child");
    }
}

public class referencesCasting {

    public static void main(String[] args) {

        // Upcasting <----------
        Parent p = new Child();
        p.name = "Lulu";

        // Printing the parentclass name
        System.out.println(p.name);
        p.method(); // method from Child

        // Downcasting Explicitly ( clear and detailed manner) <----------
        Child c = (Child) p;

        c.id = 1;
        System.out.println(c.name); // Lulu
        System.out.println(c.id); // 1
        c.method(); // Method from Child

    }
}