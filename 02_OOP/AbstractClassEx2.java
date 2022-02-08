
/*
--  Abstract Class
-   An abstract class can contain both abstract and concrete methods
*/

interface Sphere {
    default String getName() { return "Unknown"; }
}

abstract class Planet {
    abstract String getName();
}


public class AbstractClassEx2 extends Planet implements Sphere  {

    public AbstractClassEx2() {
        super(); // Planet default constructor
    } 

    public String getName() { return "Mars"; } // initialize Planet getName, overrides Interface getName

    public static void main(String[] args) {
        System.out.println( ( (Planet)new AbstractClassEx2() ).getName()); // Mars
    }
}

