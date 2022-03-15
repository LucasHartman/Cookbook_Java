import java.util.function.Predicate;

public class Exercise56 {

    public static void main(String[] args) {
        Exercise56 s = new Exercise56();
        // s.go(() -> adder(5,1) < 7);      // line A   has no input var
        s.go(x -> adder(6, 2) <9);          // line B
        // s.go(x, y -> adder(3, 3) <4);    // line C   has one to many input var
    }

    // method inputs Predicate, returning boolean
    void go(Predicate<Exercise56> e) {  
        Exercise56 s2 = new Exercise56();
        if(e.test(s2))
            System.out.println("true"); // true
        else
            System.out.print("false ");
    }

    // simple static method
    static int adder(int x, int y) {
        return x + y;
    }
}
