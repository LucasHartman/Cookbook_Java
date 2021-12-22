
public class PolarBear {

    // ref object StringBuilder input "t"
    StringBuilder value = new StringBuilder("t");  // 1
    { value.append("a"); } // 2
    { value.append("c"); } // 3

    // private Constructor
    private PolarBear() {
        value.append("b");  // 4
    }

    // Constructor Overload
    public PolarBear(String s) {
        this(); // inherit Constructor
        value.append(s);
    }    

    // Construcotr Overload
    public PolarBear(CharSequence p) {
        value.append(p);
    }
    public static void main(String[] args) {

        // ref Object
        Object bear = new PolarBear();

        // ref object - 
        bear = new PolarBear("f"); // 5

        // properly cast to PolarBear
        System.out.println(((PolarBear)bear).value); // tacbf
    }
}