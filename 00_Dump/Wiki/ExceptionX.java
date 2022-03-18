/*


                                                    Object
                                                    |
                                                    |
                                ------------------ Throwable --------------------
                                |                                               |
                                |                                               |
                            Exception (CHECKED)                                - (Error)
                                |                                              - StackOverflowError
                                |                                              - OutOfMemoryError
(UNCHECKED) ------------------------------------------------- (CHECKED) 
- NullPointerException                                      - IOException -------------- FileNotFoundException
- IndexOutOfBoundException                                  - ClassNotFoundException
- ArrayIndexOutOfBoundsException                            - SocketException
- IllegalArgumentException                                  - SQLException
- NumberFormatException                                     - 
- ClassCastException                                        - 
                   



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
    FileNotFoundException
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
import java.io.*;

class CheckExs {

    /*-----------------------------------------------
            -- Checked Exception (CompileTime)
    ..................................................
        -   Required to be handled OR declared
        -   try block must include either an catch, finally or both
        -   Overridden method can have any new or broader checked exceptions
        -   Nested try/catch block can't use the same variable name, already defined in the outside try/catch
        -   Second catch block can use the same variable name, they are different blocks
    -----------------------------------------------*/

    void ExceptionEx() {
        // TYPE:        Checked Exception (CompileTime)
        try {
            throw new Exception();
        } catch ( Exception e) {}
    }

    void ClassNotFoundException() {
        // TYPE:        Checked Exception (CompileTime)
        // ARISE:       Class is not found in the path of the class
        // EXAMPLE:     Missing Folder
        try {
            throw new ClassNotFoundException();
        } catch ( ClassNotFoundException e1) {
        } catch ( Exception e) {

            try {
            throw new Exception();
            } catch (Exception ex) {} // error: variable e is already defined in this method

        } catch (Throwable e) {} // variable e legal outside the previous method
    }

    void FileNotFoundEx() throws FileNotFoundException {
        System.out.println("Declaring instead of not Catching an Exception, wound break the code");
    }

}





public class ExceptionX extends CheckExs {

    /*-----------------------------------------------
            -- Unchecked Exception (Runtime)
    ..................................................
        -   Not required to be handled or declared
    -----------------------------------------------*/

    void RuntimeEx() {
        // TYPE:    Unchecked Exception (Runtime)
        throw new RuntimeException();
    }

    void NullPointEx() {
        // TYPE:    Unchecked Exception (Runtime)
        // ARISE:       Attempting to invoke an instance method of a null object.
        // ARISE:       Attempting to access or modify a particular field of a null object.
        // ARISE:       Attempting to obtain the length of a null object as an array.
        // EXAMPLE:     String s = new String[5];
        throw new NullPointerException();
    }

    void ArrayIndexOutOfBoundsEx() {
        // TYPE:    Unchecked Exception (Runtime)
        // ARISE:   access the elements of an Array beyond its size.
        // EXAMPLE: int[] arr = {1,2};      int x = arr[2];
        throw new ArrayIndexOutOfBoundsException();
    }


    void NumberFormatEX() {
        // TYPE:    Unchecked Exception (Runtime)
        // ARISE:   Format (convert) a string into a number
        // EXAMPLE: int x = Integer.parseInt("30k");
        throw new NumberFormatException();
    }


    void IllegalArgumentEx() {
        // TYPE:    Unchecked Exception (Runtime)
        // ARISE:   Indicate that a method has been passed an illegal argument.
        // EXAMPLE: Method requires date format like YYYY/MM/DD but if the user is passing YYYY-MM-DD
        throw new IllegalArgumentException();
    }


    void ClassCastEx() {
        // TYPE:    unchecked exception (Runtime)
        // ARISE:   Convert an object of one class type into an object of another class type
        // EXAMPLE: Will be thrown DownCast  an object of Parent class to its Child class type
        throw new ClassCastException();
    }


    void IllegalStateEx() {
        // TYPE:    Unchecked Exception (Runtime)
        // ARISE:   If we are dealing with the collection framework (List, Queue, Tree, Map)
        // EXAMPLE: -
        throw new IllegalStateException();
    }






    public static void main(String[] args) throws Exception {

        ExceptionX ex = new ExceptionX();
        ex.ClassNotFoundException();
        
    }
    
}
