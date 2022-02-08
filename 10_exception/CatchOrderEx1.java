import java.io.IOException;
import java.io.FileNotFoundException;

/*
--  Multi Catch Block
-   When we are keeping multiple catch blocks, 
    the order of catch blocks must be from most specific to most general ones.
-   subclasses of Exception must come first and superclasses later.
-   If we keep superclasses first and subclasses later, the compiler will throw an unreachable catch block error.

*/

public class CatchOrderEx1 {
    public static void main(String... args) throws IOException {
        new CatchOrderEx1().print();
    }


    public void print() {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException enfe) {
            System.out.print("X");
        } catch (IOException exception) {
            System.out.print("Z");
        } finally {
            System.out.print("Y");
        }
    }
}