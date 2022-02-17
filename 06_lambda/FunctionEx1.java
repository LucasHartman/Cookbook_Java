import java.util.function.Function;
import java.util.function.BiFunction;

/*
-- Function
-   Syntax:             Function<T,R> name = (input, result) -> Function;
-   Caller:             apply()
-   Argument            any
-   return:             any

-- BiFunction
-   Syntax:             Function<T,U,R> name = (input1, input2, result) -> Function;
-   Caller:             apply()
-   Argument            any
-   return:             any
*/

public class FunctionEx1 {
    static Function<Integer, String> functionName = i -> Integer.toString(i);
    static BiFunction<Integer, Integer, String> biFunctionName = (i1,i2) -> Integer.toString(i1+i2);

    public static void main(String[] args) {
        System.out.println(
            "\nFunction: " +functionName.apply(99)
            +"\nBiFunction: " +biFunctionName.apply(1,2));
    }
}
