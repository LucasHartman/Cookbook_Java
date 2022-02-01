/*

-   Note that if an exception occurred on, say, line 3 of the try block, 
    the remaining lines in the try block (4 and 5) would never be executed.
-   The first operation fails, you won’t continue trying to
    run other code that’s also guaranteed to fail.
 
Finally Block
-   execution starts at the first line of the try block. If there are no exceptions thrown in
    the try block, execution transfers to the first line of the finally block.
-   finally always runs
-   If an exception is thrown, finally runs. If an exception is not thrown, finally runs
-   finally clauses are not required
-   because the compiler doesn’t even require catch clauses, sometimes you’ll
    run across code that has a try block immediately followed by a finally block. 
-   try does need a catch clause or a final

-   class IndexOutOfBoundsException has two subclasses,
    ArrayIndexOutOfBoundsException and StringIndexOutOfBoundsException
-   FileNotFoundException is a subclass of IOException.
-   EOFException, which is a subclass of IOException

-   The handlers for the most specific exceptions must always be placed above those for more general exceptions

-- Declare exception
-   the exceptions that a method can throw must be declared (unless the exceptions are subclasses of RuntimeException). 
-   (Just because the method declares that it throws an exception doesn’t mean it always will. 
    It just tells the world that it might.)
-   Suppose your method doesn’t directly throw an exception but calls a method that does. 
-   RuntimeException subclasses are exempt, so the compiler won’t check to see if you’ve declared them.
-   But all non-RuntimeExceptions are considered “checked”
    exceptions because the compiler checks to be certain you’ve acknowledged that “bad things could happen here.”
-   Each method must either handle all checked exceptions by supplying a catch clause or 
    list each unhandled checked exception as a thrown exception.



-------------------------------------------------------------------------------------------------------------------------------

--  RuntimeException
-   Unchecked checked:      Compiler won’t check to see if they are handled or declared.
-   RuntimeException, Error, and all their subtypes are unchecked exceptions
-   RuntimeException is the superclass of NullPointerException, it is an unchecked exception and need not be declared. 

--  non-RuntimeException
-   checked checked:        the compiler checks to make sure they’re handled or declared.
-   “handle or declare”:    Handle by using catch clause OR declare by thrown exception
-   checked exception must be caught somewhere in your code
-   Whether that method actually throws the exception itself or calls another method that throws it is unimportant to us; 
    we simply know that we either have to catch the exception or declare that we threw it. 
-   If you invoke a method that throws a checked exception but you don’t
    catch the checked exception somewhere, your code will not compile.

*/

public class ExceptionNotes {
    
}
