public class DivideOpEx1 {

    /*
    Dividing Operator

    - When dividing ints, remainders are always rounded down.
    */

    public static void main(String[] args) {
        
        int x = 12;
        int a = 5;
        int b = 7;

        System.out.println( x/a + " " + x/b); // 2 1
        // 12 / 5 = 2.4     int 2
        // 12 / 7 = 1.7     int 1
    }
    
}
