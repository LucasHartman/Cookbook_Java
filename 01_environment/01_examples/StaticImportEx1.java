package test;
class Repetiion {
    public static String twice(String s) { return s + s; }
}

/*
--  Static Import
-   Access the static members of a class directly without class name or any object.
*/


import static test.Repetition; // import packge static

public class StaticImportEx1 {

    public static void main(String[] args) {
        System.out.println( twice("pizza") ); // inisialize static method
    }
}