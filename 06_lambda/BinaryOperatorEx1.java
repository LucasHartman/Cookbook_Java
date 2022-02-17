import java.util.function.BinaryOperator;

/*
-- BinaryOperator
-   Syntax                              BinaryOperator<T,T> name = (t,t) -> function;
-   Caller:                             name.apply(t,t)
-   Argument:                           2 any type
-   Return:                             same as argument 
*/

public class BinaryOperatorEx1 {
    static BinaryOperator<Integer> BinaryOperatorName = (i,j) -> i*j;

    public static void main(String[] args) {
        System.out.println("\nBinaryOperator: " +BinaryOperatorName.apply(2,3));
        
    }
}
