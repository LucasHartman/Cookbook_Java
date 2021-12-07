import java.io.FileNotFoundException;
import java.util.function.Consumer;
import java.io.*;

/*

                                        java.lang.Throwable>
                                                |
                        ---------------------------------------------------
                        |                                                  |
                java.lang.Exception                               <Error> (Unchecked)
                        |
            ---------------------------------------------------------------------------------
            |                                       |                                       |
    Runtime Exception> (Unchecked)          <Other Exception>                      java.io.IOException
            |
    - ArithmeticException                                                                   |
    - ArrayIndexOutOfBoundsException                                       FileNotFoundException (checked Exception)
    - ClassCastException
    - NullPointerException
    - IllegalArgumentException
    - NumberFormatException



    - All exceptions are subclasses of Throwable
    
    - Java type, including Exception and RuntimeException, can be declared as the return type.

    - You can declare a method with RuntimeException as the return type.

    - You can declare any subclass of Error in the throws part of a method declaration\

    - You can declare any subclass of Exception in the throws part of a method declaration.

    - You can declare any subclass of RuntimeException in the throws part of a method declaration.

    - An overridden method is allowed to throw no exceptions at all

    - 

*/

public class ExceptionSheet {

    public static void main(String[] args) {

        // -------------------------------------------------------------------------
        // UnChecked Exceptions: RuntimeExceptions
        // - Exceptions that are thrown at runtime, are RuntimeExceptions
        // - Error and RuntimeException classes are unchecked exceptions
        // - Both runtime and checked
        // - Exceptions can be declared ( throw new NameOfException() or throws
        // NameOfException)
        // - Unchecked exceptions are allowed, but not required, to be
        // handled or declared.
        // --------------------------------------------------------------------------

        Runnable arithmetic = () -> {
            // RuntimeException: Arithmetic
            // Thrown when code attempts to divide by zero
            try {
                int answer = 11 / 0;
            } catch (ArithmeticException e) {
                System.out.println("\n ArithmeticException Caught:    " + e);
            }
        };
        arithmetic.run();

        Runnable arrayIndexOutOfBounds = () -> {
            // RuntimeException: ArrayIndexOutOfBounds
            // This line of code throws NullPointerException becasue,
            // list[index] is out of range
            try {
                int[] list = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
                int get = list[10];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nArrayIndexOutOfBoundsException Caught:    " + e);
            }
        };
        arrayIndexOutOfBounds.run();

        Runnable classCast = () -> {
            // RuntimeException: ClassCastException
            // the code has attempted to cast a reference to a type of which it's not a
            // subtype
            try {
                String type = "moose";
                Object obj = type;
                Integer number = (Integer) obj; // String can't be a Integer
                System.out.println(number);
            } catch (ClassCastException e) {
                System.out.println("\n ClassCastException Caught:    " + e);
            }
        };
        classCast.run();

        Consumer<String> nullPointer = s -> {
            // RuntimeException: NullPointerException
            // This line of code throws NullPointerException because s is null
            try {
                if (s.equals("test"))
                    System.out.println("Same");
                else
                    System.out.println("Not Same");
            } catch (NullPointerException e) {
                System.out.println("\nNullPointerException Caught:  " + e);
            }
        };
        nullPointer.accept(null);

        Runnable illegalArgument = () -> {
            // RuntimeException: IllegalArgumentException
            // -This line of code throws a IllegalArgumentException
            // - IllegalArgumentException is used when an unexpected parameter is passed
            // into
            // a method.
            try {
                throw new IllegalArgumentException(Integer.toString(-1));
            } catch (IllegalArgumentException e) {
                System.out.println("\nIllegalArgumentException Caught:    " + e);
            }
        };
        illegalArgument.run();

        // -------------------------------------------------------------------------
        // Checked Exception
        // Checked: are the exceptions that are checked at compile time.
        // method must either handle the exception or it must specify the exception
        // using throws keyword.
        // Checked exceptions are required to be handled or declared
        //
        // -------------------------------------------------------------------------

        Runnable fileNotFound = () -> {
            // FileNotFoundException
            // thrown when:
            // - A file with the specified pathname does not exist
            // - A file with the specified pathname does exist but is inaccessible for some
            // reason
            try {
                FileReader reader = new FileReader("file.txt");
                BufferedReader br = new BufferedReader(reader);
            } catch (FileNotFoundException e) {
                System.out.println("\n FileNotFoundException Caught:    " + e);
            }
        };
        fileNotFound.run();

        // -------------------------------------------------------------------------
        // Errors
        // - Error means something went so horribly wrong that your program should not
        // attempt to recover from it.
        // -Errors are allowed, but not required, to be handled or declared.
        //
        // --------------------------------------------------------------------------

        // -------------------------------------------------------------------------
        // Throw
        // - Exceptions can be declared ( throw new NameOfException() or throws
        // NameOfException)
        // - new keyword must be used if the exception is being created
        // - The new keyword is not used when throwing an existing exception.
        // --------------------------------------------------------------------------

        Runnable myThrow = () -> {
            // Example the the throw clause, declaring an exception
            // throw is followed by an instance of Exception class
            try {
                throw new ArithmeticException("Something went wrong!!"); // <---
            } catch (ArithmeticException e) {
                System.out.println("\nArithmeticException is Thrown:" + e);
            }
        };
        myThrow.run();

        // --------------------------------------------------------------------------
        // Try Catch
        // - If an error occurs, we can use try...catch to catch the error and execute
        // some code to handle it
        // - Multi-catch block, only one variable can be declared. example: catch
        // (Exception e)
        // - A regular try statement is required to have a catch clause and/or finally
        // clause.
        // - If a regular try statement does not have any catch clauses, then it must
        // have a finally block
        // - With multiple catch blocks, the exceptions must be ordered from more
        // specific to broader, or be in an unrelated inheritance tree.
        // --------------------------------------------------------------------------

        Runnable tryCatch = () -> {
            // Simple try catch and finally
            try {
                int[] myNumbers = { 1, 2, 3 };
                System.out.println(myNumbers[10]);
            } catch (Exception e) {
                System.out.println("Selected index does not exist.");
            } finally {
                System.out.println("Goodbye Cowboy");
            }
        };
        tryCatch.run();

        Runnable nonCatch = () -> {
            // Try without a catch, but still runs because of the finally clause
            try {
                int[] myNumbers = { 1, 2, 3 };
                System.out.println(myNumbers[10]);
            } finally {
                System.out.println("no catch clause, no fear finally is here");
            }
        };
        // nonCatch.run();

    }
}