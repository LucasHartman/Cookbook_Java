interface Vessel {}

interface Toy {}

class Boat implements Vessel { }

class Speedboat extends Boat implements Toy { }




public class InstanceofEx2 {

    /*
    Istanceof

    - child classes are instance of there parent class
    - implements and extends instance the parent class
    */

public static void main(String[] args) {
    String s = "0";

    Boat b = new Boat();
    Boat b2 = new Speedboat();
    Speedboat s2 = new Speedboat();

    if ((b instanceof Vessel) && (b2 instanceof Toy)) s += "1"; // (true) && (true) = true
    if ((s2 instanceof Vessel) && (s2 instanceof Toy)) s += "2"; // (true) && (true) = true
    System.out.println(s); // 012

    System.out.println(b instanceof Vessel);    // true
    System.out.println(b2 instanceof Toy);      // true
    System.out.println(s2 instanceof Vessel);   // true
    System.out.println(s2 instanceof Toy);      // true



}    
}
