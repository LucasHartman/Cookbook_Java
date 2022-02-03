import java.util.function.Predicate;

public class LambdaEx3 {
    public static void main(String[] args) {

        Predicate<String> dash = c -> c.startsWith("luc");
        System.out.println(dash.test("lucas")); // true
    }
    
}
