/**
 * Super
 * Call a constructor inside an constructor of a Childclass
 */

// Parentclass
class Parentclass {

    // instance variable
    int parentVariable = 0;
    String hiddenVariable = "boo";

    // Constructor Parentclass
    Parentclass(int v) { 
        System.out.println("I live in the parent class " +v); 
    }
}





// Childclass
public class Super extends Parentclass {

    // instance variable
    String childVariable = "bro";

    // same name as an inherited instance variable is hidden, not overridden
    // This means that both variables exist, and
    // the one that is used depends on the location and reference type.
    String hiddenVariable = "Wooohs";

    // First Construcoter
    Super(int x) {
        // Inherit Parentclass Constructor
        // WARNING: a child constrcutor NEEDS to inheret one of the Constructers in the Parent Class, 
        //Without the super this constructor will not compile
        super(66);
    }

    // 2nd Construcotor Childclass
    Super() {
        // get Overloaded Constructor
        //this(44);

        // Inherit Parentclass Constructor
        // WARNING: a child constrcutor NEEDS to inheret one of the Constructers in the Parent Class, 
        // Without the super this constructor will not compile
        super(69);

        // Inherit variable from superclass
        System.out.println("get instance variable from parentclass: "+super.parentVariable);

        // get variable from child class
        System.out.println("get instance variable from parentclass: "+this.childVariable);

    }

    
    public static void main(String[] args) {

        // Initialize Parentclass 
        Parentclass obj = new Parentclass(11);  
        System.out.println(obj.parentVariable); //0
        System.out.println(obj.hiddenVariable); // boo

        // Initialize Childclass 
        Parentclass obj1 = new Super();  
        Parentclass obj2 = new Super(11);
        System.out.println(obj1.hiddenVariable); // Wooohs


    
    }
    
}
