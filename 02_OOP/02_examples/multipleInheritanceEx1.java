
/*
Multiple Inheritance

-- legel & illegal uses of extends and implemnts
class Foo{}                                     // OK
class bar implements Foo{}                      // NO! Can't implement a class
interface Baz {}                                // OK
interface Fi{}                                  // OK
interface Fee implemnts Baz{}                   // NO! an interface can't implemnt an interface
interface Zee implements Foo{}                  // NO! an interface can't implements a class
interface Zoo extends Foo{}                     // NO! an interface can't extend a class
interface Boo extends Fi{}                      // OK. An interface can extends an interface
class Toon extends Foo, Button{}                // NO! An class can't extedsn multiple classes
class Zoom implements Fi, Baz{}                 // OK. an class can implement multiple interfaces
inteface Vroom extends Fi, Baz{}                // Ok. An interface can extends multiple interfaces
class Yow extends Foo implemtns Fi{}            // OK. A class can do all three (extends must be 1st)


*/

interface I1 {
    default int doStuff() { return 1; }
}

interface I2 {
    default int doStuff() { return 2; }
}

public class multipleInheritanceEx1 implements I1 {
    public static void main(String[] args) {

        new multipleInheritanceEx1().go();
    }

    void go() {
        System.out.println(doStuff()); // 3
    }

    @Override
    public int doStuff() {
        return 3;
    }

    // WE have duplicate methods in each interface (WILL NOT COMPILE)
    // SolutionL Create a method Override to make the code compile

}