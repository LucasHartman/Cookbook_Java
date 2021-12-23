/*
--  super()
-   It is used to invoke Parent class constructor from Child
-   It must be used only inside Child’s constructor.
-   Call to super() must be the first statement.
-   Used to initialize parent class object in the process of child object creation.


--  this()
-   It is used to invoke current class constructor
-   It must be used only inside another constructor of same class.
-   Call to this() must be the first statement.
-   To connect constructors in a single class.
-   Used to initialize an object via multiple constructors.
*/

class Plant {

    private String name;
    
    // Constructer #1
    public Plant(String name) {
        this.name = name; 
    }
    
    // Constructoer #2
    public Plant() {
        this("fern");
    }

    
    public String getName() { 
        return name; 
    }

}


public class thisMethodEx2 extends Plant {


}