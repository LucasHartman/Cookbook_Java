/*
T
Since the constructor is called twice, with snap() executed after each constructor call, the
output printed is 1 2
*/


public class Exercise1 {
    
    static int teeth; // 0           The teeth variable is static, meaning the same value is accessible from all instances of the class
    double scaleToughness; // 0

    public Exercise1() {
        teeth++;    // the static variable teeth is incremented each time the constructor is called.
    }

    public void snap(int teeth) { 
        //  Since teeth is a local variable within the snap() method, the argument value is used, 
        // but changes to the local variable do not affect the static variable teeth.
        System.out.print(teeth+" ");
        teeth--; 
        //  Since the local variable teeth is not used after it is decremented, the decrement
        //  operation has no meaningful effect on the program flow or the static variable teeth.
    }
    public static void main(String[] unused) {
        new Exercise1().snap(teeth); // 1
        new Exercise1().snap(teeth); // 2
    }
    
}
