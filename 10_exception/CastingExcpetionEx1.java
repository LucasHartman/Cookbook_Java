public class CastingExcpetionEx1 {
    public static void main(String[] args) {

        final Object exception = new Exception(); // unchecked exceptions
        final Exception data = (RuntimeException)exception; // Narrowing Casting
        // Exception is not a subclass of RuntimeException, so the assignment on the
        // second line throws a ClassCastException at runtime.

    }
}