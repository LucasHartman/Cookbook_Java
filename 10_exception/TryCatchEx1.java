import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchEx1 {

    /*

    -- Exception handler

    - The term exception means “exceptional condition” and is an occurrence that alters the normal program flow. 
    - A bunch of things can lead to exceptions, including hardware failures, resource exhaustion, and good old bugs. 
    - When an exceptional event occurs in Java, an exception is said to be “thrown.” the code that’s responsible for 
      doing something about the exception is called an “exception handler,” and it “catches” the thrown exception.
    

    -- try
    - try is used to define a block of code in which exceptions may occur.
    -  This block of code is called a “guarded region” (which really means “risky code goes here”).


    -- catch clauses
    - catch clauses match a specific exception (or group of exceptions)
    -   var is not allowed in a catch block since it doesn’t indicate the exception being caught
    

    -- finnally
    - clean up after ourselves if an exception occurs. 
    - This is the right place to close your files, release your network sockets, 
      and perform any other cleanup your code requires.
    

      --  catchall exception handler
      - This code will catch every exception generated.
      - not recomended
      -  handler does not know how to handle.

      -- Exception Matching
      - When an exception is thrown, Java will try to find 
        (by looking at the available catch clauses from the top down)
    */

    public static void main(String[] args) {

        // example
        try {
            // do stuff
        } catch ( Exception ex) {
            // do exception handling
            ex.printStackTrace();
        } finally {
            // clean up
        }


        // example: catchall
        try {
            // do something
        } catch ( Exception e ) { // <---- no no no no
            e.printStackTrace();
        }


        // example: Exception Matching
        try {
            RandomAccessFile raf = 
            new RandomAccessFile("myfile.txt", "r");
            byte b[] = new byte[1000];
            raf.readFully(b, 0, 1000);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IO Error");
            System.err.println(e.toString());
            e.printStackTrace();
        }

    }
}
