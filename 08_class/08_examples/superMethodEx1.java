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


class CD {

    int r;

    CD(int r){
        this.r =r; // initialize this class variable
    }

}

public class superMethodEx1 {

    int c;

    DVD(int r, int c) {
        super(r);   // initialize parent class variable
        this.c = c; // initialize this class variable
    }


    public static void main(String[] args) {
    }
}