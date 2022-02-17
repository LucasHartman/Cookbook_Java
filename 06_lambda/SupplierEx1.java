import java.util.function.Supplier;

/*
-- Supplier
-   The Supplier function has no input, but can return any type.
-   Syntax              Supplier<T> name = () -> Function;
-   Caller:             get()
-   Argument:           none
-   return:             any
*/

public class SupplierEx1 {
    static Supplier<String> supplierName = () -> "String";
 
    public static void main(String[] args) {
        System.out.println("Supplier: " +supplierName.get());
    }
}
