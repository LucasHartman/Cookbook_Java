/*
local variable within the myMethod, the argument value is used, 
but changes to the local variable do not affect the static variable.
*/

public class StaticVariableEx1 {

    static int var; // 0


    void myMethod(int var) {
        var += 1;
        System.out.println("local var: " +var);
    }

    public static void main(String[] args) {
        
        System.out.println(" static var: " +var);

         new StaticVariableEx1().myMethod(2); 

         System.out.println(" static var: " +var);
    }
    
}
