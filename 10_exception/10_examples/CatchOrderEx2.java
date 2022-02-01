import java.io.IOException;
import java.io.FileNotFoundException;

/*
--  Multi Catch Block
-   When we are keeping multiple catch blocks, 
    the order of catch blocks must be from most specific to most general ones.
-   subclasses of Exception must come first and superclasses later.
-   If we keep superclasses first and subclasses later, the compiler will throw an unreachable catch block error.

*/

public class CatchOrderEx2 {
    public static void main(String... args) throws IOException {
        new CatchOrderEx1().print();
    }


    public void print() {
        try {
            // statements
         } catch(Exception e) {
            System.out.println(e);
         } catch(NumberFormatException nfe) { //unreachable block. Not supported by Java, leads to an error.
            System.out.println(nfe);
         }
    }
}