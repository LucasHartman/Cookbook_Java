
public class Exercise36 {

    int x = 5;

    public static void main(String[] args) {

        final Exercise36 f1 = new Exercise36(); // ref var
        Exercise36 f2 = new Exercise36();       // ref var
        Exercise36 f3 = FizzSwitch(f1, f2);     // return ref var

        System.out.println((f1 == f3) + " " + (f1.x == f3.x)); // true true
    }

    static Exercise36 FizzSwitch(Exercise36 x, Exercise36 y) { // input refs
        final Exercise36 z = x;
        z.x = 6; // change value from ref
        return z; // return ref z, which equals ref x
    }
    
}
