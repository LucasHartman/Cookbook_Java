
/*
--  Reference Variable
-   Java language also allows you to use an object reference variable to access a static member.
*/

class Frog {

    private static int frogCount = 0;       // static variable

    static int getCount() {                 // static getter methods
        return frogCount;
    }

    public Frog() {
        frogCount +=1;                      // Modify the value in the constructor
    }
}



public class StaticEx2 {
    public static void main(String[] ags) {

        new Frog();
        new Frog();
        new Frog();
        System.out.println( "from static " + Frog.getCount()); // 3 - static context

        new StaticEx2().go(); // 3 - instance context

        Frog f = new Frog();
        System.out.println( "from reference variable " + f.getCount()); // 4 - reference variable using static method
    }

    void go() {
        System.out.println( "from instance " + Frog.getCount()); // instance method using static method
    }
}