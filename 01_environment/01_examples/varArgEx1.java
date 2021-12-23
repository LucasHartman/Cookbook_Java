/*
--  vararg
-   The varrags allows the method to accept zero or muliple arguments.
*/

public class varArgEx1 {

    public static void main(String[] args) {
        doStuff(1);
        doStuff(1,2);
    }
    
    static void doStuff(int x, int... doArgs) {
        System.out.println(x);

        for (int d : doArgs) {
            System.out.println(d);
        } 
    }
}