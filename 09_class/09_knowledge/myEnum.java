/*
-------------------------------------------------------------------------------------------------------------------------------------
-- enums --
-------------------------------------------------------------------------------------------------------------------------------------
An enum specifies a list of constanc values assign to a type.

An enum is NOT a String or an int; an enum constant's type is the enum type. For example,
SUMMER and FALL are of the enum type Season.

An enum can be declared oustide or inside a class, but NOT in a method.

An enum declared outside the class must NOT be marked static,final,abstact, protected, or private

Enums can contian constructors, methods, variables and constance-specific class bodies.

Enum constans can send arguments to the enum constructor, using the syntax BIG(8), whether
the int literal 8 is passeed to the enum constructor.

enum constructors can have arguments and can be overload.

enum constructors can NEVER be invoded directly in code. They are alway called autometically when an enum is initialized.

The semicolon at the end of an enum delaration is optional. These are legal:

ENUM fOO { ONE, TWO, THREE}

MyEnu.values() returns an array of MyEnu's values.
*/

// Outside Enum
enum Size {

    // enum constants calling the enum constructors
    SMALL("The size is small."), MEDIUM("The size is medium."), LARGE("The size is large."),
    EXTRALARGE("The size is extra large.");

    // private final variable
    private final String pizzaSize;

    // private enum constructor
    private Size(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    // public method
    public String getSize() {
        return pizzaSize;
    }
}

public class myEnum {

    // Insdie Enum
    enum Level {
        LOW, MEDIUM, HIGH
    }

    public static void main(String[] args) {

        // inside Enum
        Level lv = Level.MEDIUM;
        System.out.println(lv);

        // outside Enum
        Size size = Size.SMALL;
        System.out.println(size.getSize());

        // print all
        for (Level l : Level.values()) {
            System.out.println("print level: " + l);
        }

        // ENUM to list
        Level[] l2 = Level.values();
        System.out.println("\nlist item: " + l2[2]); // HIGH

    }
}
