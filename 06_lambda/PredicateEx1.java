import java.util.function.Predicate;
import java.util.function.BiPredicate;

/*
-- Predicate
-   Syntax:                     Predicate<T> name = (t) -> function;
-   Caller:                     name.test(t)
-   Argument:                   any type
-   Return:                     boolean type 

-- BiPredicate
-   Syntax  :                  Predicate<T,U> name = (t,u) -> function;
-   Caller:                     name.test(t,u)
-   Argument:                   any type
-   Return:                     boolean type 
*/

public class PredicateEx1 {
    static Predicate<String> predicateName = input -> input.startsWith("G");
    static BiPredicate<String,Integer> biPredicateName = (s,i) -> s.length() == i;

    public static void main(String[] args) {
        System.out.println(
            "\nPredicate: "+ predicateName.test("Great")
            +"\nBiPredicate: " +biPredicateName.test("Hello",5));
    }
}
