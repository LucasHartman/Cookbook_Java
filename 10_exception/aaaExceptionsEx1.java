/*
-- Checked Exceptions
-   Checked exceptions are checked at compile-time.
-   it should handle the exception using try-catch block or 
    it should declare the exception using throws keyword.
-   otherwise the program will not compile


    -- Declare the exception - throws keyword
    -   Syntax: myMethod() throws IOException {}
    -   Avoid the compilation error is: 
        Declare the exception in the method using throws keyword.
    -   Throws is a keyword in Java which is used in the signature of method to 
        indicate that this method might throw one of the listed type exceptions.
    -   We can use throws keyword to delegate(NL:afvaardigen) the responsibility 
        of exception handling to the caller
    -   Then caller method is responsible to handle that exception. 
 

    -- Handle - try-catch blocks
    -   try block is used to enclose the code that might throw an exception.
    -   catch block is used to handle the Exception

    -   Object.Throwable.Exception.Checked Exception...
    -   IO              Exception
    -   ClassnotFound   Exception
    -   Socket          Exception
    -   SQL             Exception


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
    -   IllegalArgument         Exception
    -   Numberformat            Exception
    -   ClassCast               Exception
    -   Object.Throwable.Error...
    -   StackOverflow           Error
    -   OutOfMemory             Error


-- try/catch/final


-- try keyword
-   A try block must include either a catch or finally block, or both
-   A local variable defined in the try block, is not in scope of the catch and final block


-- catch keyword
-   Catch and final blocks must be in the right order, catch first, final second
-   Catch must have a variable type and name, like this: (Exception e)
-   IOException is a subclass of Exception, so it must appear first in any related catch blocks
-   You can catch exceptions with a super type like RuntimeException, but not with a subtype
-- final keyword
-   The finally block is called regardless of whether or not the related catch block is executed.   
-   Finally block can throw an exception, in which case not every line of the finally block would be executed
-   Unlike an if-then statement, which can take a single statement, a finally statement requires brackets {}


--  throws keyword
-   An overridden method must not throw any new or broader checked exceptions than the method it inherits.


-- throw
-   Syntex: throw new ClassCastException();


-- Throw and Handle at execution
    public class Fortress {
      public void openDrawbridge() throws Exception {
         try {
            throw new Exception("Circle");
         } catch (Exception e) {
            System.out.print("Opening!");
         } finally {
            System.out.print("Walls");  // p2
         }
      }
   public static void main(String[] moat) {
      new Fortress().openDrawbridge();  // Exception is thrown but not handled or declared
   }

*/

public class aaaExceptionsEx1 {
    
}
