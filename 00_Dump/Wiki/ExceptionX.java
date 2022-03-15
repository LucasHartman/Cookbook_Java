/*


                        Object
                        |
                        |
    ------------------ Throwable --------------------
    |                                               |
    |                                               |
    --  Exceptions (Checked)                        -- Error
    |
    |
    --  Checked Exceptions 
        (IO or Compile-Time)
    |
    |
    --  Unchecked Exceptions 
        (Runtime or NullPointer)



-- Checked Exceptions
-   Checked exceptions are checked at compile-time.
-   it should handle the exception using try-catch block or 
    it should declare the exception using throws keyword.
-   otherwise the program will not compile
-   If method declaration includes the Exception class, which is a checked exception. 
    But an unchecked exception is thrown, even so
    the checked exception must be handled or declared in the main() method in which it is called.

    -   Object.Throwable.Exception.Checked Exception...
    -   IO              Exception
    -   ClassnotFound   Exception
    -   Socket          Exception
    -   SQL             Exception
    -   Exception

-- Unchecked Exceptions
-   An unchecked exception is the one which occurs at the time of execution.
-   These are also called as Runtime Exceptions.
-   Runtime exceptions are ignored at the time of compilation. 
-   This Exception occurs due to bad programming.
-   Unchecked exception are not required to be handled or declared
-   Error are almost impossible to handle
-   Runtime Exceptions can be handled with the try-Catch Block

    -   Object.Throwable.Exception.Runtime Exception...
    -   Null Pointer            Exception
    -   IndexoutofBound         Exception
    -   ArrayIndexOutOfBounds   Exception
    -   IllegalArgument         Exception       is thrown in order to indicate that a method has been passed an illegal argument.
    -   Numberformat            Exception
    -   ClassCast               Exception
    -   Object.Throwable.Error...
    -   StackOverflow           Error
    -   OutOfMemory             Error

-- Error
-   An Error generally indicates an unrecoverable problem.
-   While it is possible to catch an Error, it is strongly recommended that an application never do so,
-   Error extends from Throwable, not Exception, and is unchecked.

-- try/catch
-   A try statement requires a catch or a finally block
-   It can also have an catch an finally block
-   If an exception is found in the try block, the code inside the try block is not executed.
-   A variable defined  in a try block is a local variable and is not in scope of the catch,finally and outside the try/catch/finally
-   catch order goes from narrow to wider exception

-- finally
-   finally block can throw an exception
-   not every line in a finally block could be executed 
-   finally statement required brackets {}
-   If the catch throws an Unchecked Exception (throws new NUllPointerException)
    and the finally too (throw new RuntimeException(); ).
    Than the caller sees the RuntimeException in the stack trace.

-- throws
-   Is used in the method declarations
-   throws a broad exception like RuntimeException, 
    can't be caught with a narrowed exception, 
    like ArrayIndexOutOfBoundsException
-   If a throws
*/

public class ExceptionX {
    
}
