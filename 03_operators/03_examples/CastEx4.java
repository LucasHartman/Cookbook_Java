// Parent Class
class Animal { 
    public String noice() { 
        return "peep"; 
    } 
}


// Child Class
class Dog extends Animal {
    public String noise() { 
        return "bark"; 
    }
}


// Child Class
public class CastEx4 extends Animal {
    public String noice() {
        return "meow";
    }

    public static void main(String[] args) {
        Animal animal = new Dog();          // class Dog reference
        CastEx4 cat = (CastEx4) animal;     // CastEx4 Object = Casting Dog Object to CastEx4 Object
        System.out.println(cat.noice());    // Runtime: class Dog cannot be cast to class CastEx4 
    }

}