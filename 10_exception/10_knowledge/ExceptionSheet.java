import java.io.FileNotFoundException;
import java.util.function.Consumer;
import java.io.*;

public class ExceptionSheet {

    /*
    ----------------------------------------------------------------------------------------------------------------

                                                                        Object
                                                                            |
                                                                        <Throwable>
                                                                            |
                                                    ---------------------------------------------------
                                                    |                                                  |
                                                <Exception>                                    <Error> (Unchecked)
                                                    |
            ---------------------------------------------------------------------------------
            |                                       |                                       |
    <Runtime Exception> (Unchecked)               (Checked)                             IOException (Checked)
            |                                       |                                       |
    - ArithmeticException                   - ArithmeticException                 FileNotFoundException 
    - ArrayIndexOutOfBoundsException        - ArrayIndexOutOfBoundsException      
    - ClassCastException                    - ClassCastException
    - NullPointerException                  - NullPointerException
    - IllegalArgumentException              - IllegalArgumentException
    - NumberFormatException                 - NumberFormatException

    ----------------------------------------------------------------------------------------------------------------

    -- Checked exception
    -   Checked exceptions tend to be more anticipated
    -   checked exception, must be handled in a try/catch block or declared by the method
    -   Java enforeces the programmer to do something about the Checked Exepection
        1. Handeling in the method (try/catch)
        2. Declare in the method siganture (throws), that someone else should handle it.
        (There are many roads to Rome, someone else can decide the best way to handel an exception)


    -- UnChecked exception (RuntimeExceptions)
    -   Exceptions that are thrown at runtime
    -   You can declare unchecked exceptions
    -   unchecked exception is any exception that does not need to be
        declared or handled by the application code


    --  Error
    -   Error represent unusual situations that are not caused by program errors and indicate
        things that would not normally happen during program execution, such as the JVM running out of memory.
    -   Generally, your application won’t be able to recover from an Error, so you’re not required to handle them.
    -   Errors are technically not exceptions because they do not derive from class Exception.
    -   Errors are allowed, but not required, to be handled or declared.
    
    ----------------------------------------------------------------------------------------------------------------

    -- throw
    1.  throw an exception
    2.  thow single exception not multiple
    3.  throw only unchecked excepition
    4.  throw is followed by the instance variable
    5.  throw is used within the method


    -- throws
    1.  declare an exception which might get thrown
    2.  declare multiple exceptions
    3.  declare checked and uncheced exception
    4.  syntax wise throws keywrod is followed by expcetion class names
    5.  throws keyword is used with the method signature

    ----------------------------------------------------------------------------------------------------------------

    -- try
    -   try is used to define a block of code in which exceptions may occur.
    -   This block of code is called a “guarded region” (which really means “risky code goes here”).
    -   A regular try statement is required to have a catch clause and/or finally clause.


    -- catch clauses
    -   catch clauses match a specific exception (or group of exceptions)


    -- finnally
    -   clean up after ourselves if an exception occurs. 
    -   This is the right place to close your files, release your network sockets, 
        and perform any other cleanup your code requires.
    -   If a regular try statement does not have
        any catch clauses, then it must have a finally block
    -   A finally block is never required with a try-with-resources statement

    ----------------------------------------------------------------------------------------------------------------

    --  ArithmeticException
    -   Trying to divide an int by zero gives an undefined result. When this occurs, 
        the JVM will throw an ArithmeticException


    --  ArrayIndexOutOfBoundsException
    -    array indexes start with 0 and go up to 1 less
        than the length of the array

    --  ClassCastException
    -   Java tries to protect you from impossible casts. 
        Like an Integer to String

    --  IllegalArgumentException
    -   The code work, but you have an Integer argument,
        but the input is a negative number.
        In that case the programmer can throw an IllegalArgumentException

    --  NullPointerException
    -   If the reference is null, the JVM will throw a NullPointerException.

    --  NumberFormatException

    */

    public static void main(String[] args) {


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