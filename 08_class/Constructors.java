
/**
 * 
 * Constructer
 * Create a Cosntructer
 * OverLoad Constructer
 * call Constructer inside a Constructer
 * 
 * 
 * Default Constructor
 * Every class in Java has a constructor whether you code one or not. If
 * you don’t include any constructors in the class, Java will create one for
 * you without any parameters. 
 * 
 * 
 * polymorphism
 * - A method is overloaded if it has the same name but a 
 *   different signature as another accessible method
 * 
 * 
 */

class Constructors {

    // Instance Variables
    private int weight;
    private String color;


    /* Constructor
    -  matches the name of the class
    - There is no return value */
    public Constructors() {}


    /* Constructor Overload
    - A class can have mulitple construcotrs, so long each constructors has a uniqe signautre (distinct parameter)
    - parameters can be any valid class, array, or primitive type, 
      including generics, but may not include var.  */
    public Constructors(int weight) {
        // assign Instacne Variable
        this.weight = weight;
    }


    // Constrcutor inside a constrcutor
    public Constructors(String color, int weight) {
        // Calling an overloaded constructor
        // warning: must be first statement
        this(weight);

        // Calling an overloaded constructor
        // warning: this will compile but will create a
        // new object rather than setting the fields 
        new Constructors(44); 
        
        // assign Instacne Variable
        this.color = color;
    }







    public static void main(String[] args) {

        // This calls the third constructor.
        Constructors myOBJ1 = new Constructors();
        Constructors myOBJ2 = new Constructors(72);
        Constructors myOBJ3 = new Constructors("Red", 69);

    }

}

