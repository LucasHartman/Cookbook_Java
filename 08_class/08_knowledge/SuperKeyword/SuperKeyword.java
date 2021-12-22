/*
The super keyword refers to superclass (parent) objects.

It is used to call superclass methods, and to access the superclass constructor.

The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.
*/

class Animal { // Superclass (parent)

    Animal() {
        System.out.println("Parent Constructor");
    }

    int classVar = 990;

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal { // Subclass (child)

    Dog() {
        // super();
        System.out.println("Child Constructor" + super.classVar);
    }

    public void animalSound() {
        super.animalSound(); // Call the superclass method
        System.out.println("The dog says: bow wow " + super.classVar);
    }
}

public class SuperKeyword {
    public static void main(String args[]) {
        Animal myDog = new Dog(); // Create a Dog object
        myDog.animalSound(); // Call the method on the Dog object
    }
}
