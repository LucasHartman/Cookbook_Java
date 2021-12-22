
class Arthropod {

    // Method can be used inside the package or outside through inheritance
    protected void printName(long input) {
        System.out.print("Arthropod");
    }

    // Overloaded Method PUblic
    void printName(int input) {
        System.out.print("Spooky");
    }
}


public class Spider extends Arthropod {

    // Method Overrider
    protected void printName(int input) {
        System.out.print("Spider");
    }
    public static void main(String[] args) {

        // object reference Child Class
        Arthropod a = new Spider();


        a.printName((short)4); // calls methid childclass
        a.printName(4);  // calls methid childclass
        a.printName(5L);  // calls method parentclass
    }
}