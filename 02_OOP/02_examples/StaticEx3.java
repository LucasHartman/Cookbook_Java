/*
--  redefined static method
-   static methods can’t be overridden, but can be redefined in a subclass

*/

class Animal {

    // parent static method
    static void doStuff() {
        System.out.print("animal ");
    }
}



public class StaticEx3 extends Animal {
    public static void main(String[] args) {

        Animal.doStuff();            // animal - invode static method

        StaticEx3.doStuff();        // dog
    }


    // child static method
    static void doStuff() {
        System.out.print("dog");
    }
}