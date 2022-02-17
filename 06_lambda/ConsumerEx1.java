import java.util.function.Consumer;
import java.util.function.BiConsumer;

/*
-- Consumer
-   Interface:          Consumer<T> name = (t) -> Function;
-   Caller:             accept(t)
-   argument:           any
-   return:             none

-- BiConsumer
-   Interface:          BiConsumer<T,U> name = (t,u) -> Function;
-   Caller:             accept(t,u)
-   argument:           any
-   return:             none
*/

public class ConsumerEx1 {
    static Consumer<String> print = s -> System.out.println(s);
    static BiConsumer<String, String> biprint = (s1,s2) -> System.out.println(s1 + s2);
    
    public static void main(String[] args) {
        print.accept("Hello World");
        biprint.accept("Hello", " Mars");
    }
}