/*

*/

interface Plant {
    default String grow() { return "Grow!"; }
}

interface Living {
    public default String grow() { return "Growing!"; }
}
    
public class Exercise3 implements Plant, Living { // m1 A class cannot inherit two interfaces that declare the same default method
    
    // Overload
    public String grow(int height) { return "Super Growing!"; }
    
    public static void main(String[] leaves) {
        Plant p = new Tree(); // m2
        System.out.print(((Living)p).grow()); // m3
    }
}
    