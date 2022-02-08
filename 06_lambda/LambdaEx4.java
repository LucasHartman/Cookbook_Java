import java.util.function.Predicate;

public class LambdaEx4 {
    public static void main(String[] args) {

        Predicate clear = c -> c.equals("clear");
        System.out.println(clear.test("pink"));
    }
    
}
