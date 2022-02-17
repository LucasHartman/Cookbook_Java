/*
-- ClassCastException
- Source: https://www.baeldung.com/java-classcastexception
-   No need to be declare in the method's or constructor's throws clause.
    Because it a RuntimeException (unchecked Exception), only checked exception need to be declared.
-   It can occur when we tried to convert an object of one class type into an objet of another class
-   
*/

// Parent
interface Animal {
    String getName();
}

// Child
class Mammal implements Animal {
    @Override
    public String getName() {
        return "Mammal";
    }
}

// Brother from another mother
class Amphibian implements Animal {
    @Override
    public String getName() {
        return "Amphibian";
    }
}

public class UE_ClassCastEx1 extends Amphibian {
    @Override
    public String getName() {
        return "Amphibian";
    }

    public static void main(String[] args) {
        try {
        Animal animal = new UE_ClassCastEx1();  // Type Animal ,reference UE-ClassCastEx1
        Mammal mammal = (Mammal) animal;        // Explicitly casting to Mammal (incompatible type)
        } catch (ClassCastException e) {
            System.out.println("Class Cast Exception: \n" +e);
        }
    }
    
}

        /*
                    Animal
                    |
            ---------------------
            |                   |
            Amphibian           Mammal
            |
            UE_ClassCastEx1
        */
