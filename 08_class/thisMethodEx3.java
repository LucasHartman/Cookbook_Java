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

class Bootchy {

    int bootch;
    String snootch;

    public Bootchy() {
        this("snootchy");
        System.out.print("first");
    }

    public Bootchy(String snootch) {
        this(420, "snootchy");
    }

    public Bootchy(int bootch, String snootch) {
        this.bootch = bootch;
        this.snootch = snootch;
        System.out.println("third");
    }

public class thisMethodEx3 extends Bootchy {

    Bootch b = new Bootchy();
    System.out.print( ); // third second first snootchy 420
    }
}