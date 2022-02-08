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

class Vehicle {

    int x;

    Vehicle() {
        this(10);
    }

    Vehicle(int x) {
        this.x = x;
    }
}


public class thisMethodEx1 extends Vehicle {

    int y;

    thisMethodEx1() {
        //super();  // this must be first method
        this(20);   // this must ALSO be first method
    }

    thisMethodEx1(int y) {
        this.y = y;
    }

    public String toString() {
        return super.x +":" +this.y;
    }

    public static void main(String[] args) {
        Vehicle y = new thisMethodEx1();
        System.out.println(y); // Compilcation fails
        // if you remove the super(), the result will be 10:20
    }
}