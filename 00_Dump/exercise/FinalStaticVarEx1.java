/*
-- Exercise
-   Write a program that can initialize a final static variable.
    To initialize, use a Static Block and try a Constructor.

-- Notes
-   Source: https://www.geeksforgeeks.org/final-static-variable-java/
-   Static variables are rarely used other than being declared as constants. 
    Constants are variables that are declared as public/private, final, and static. 
    Constant variables never change from their initial value
-   Default values are same as instance variables. For numbers, the default value is 0
-   When declaring class variables as public static final, then variable names (constants) are all in upper case. 
    If the static variables are not public and final, the naming syntax is the same as instance and local variables.
-   A constructor can't initialize a static variable, because an constructor is not static.
-   If the static variable declared as final, then we have to perform initialization explicitly whether we are using it or not and 
    JVM won’t provide any default value for the final static variable.
*/

public class FinalStaticVarEx1 {
    
    private static final int var1;

    static { var1=1; }

    /*
    FinalStaticVarEx1(int v) {
        this.var1 = v;
        var1 = v;
    }*/


    public static void main(String[] args) {
        System.out.println(" the value of var1 is: " +var1);
    }
}
