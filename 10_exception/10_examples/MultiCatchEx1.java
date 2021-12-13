
public class MultiCatch {

    /*
    
    --  catch all Exception
    -   you can have a single catch block that just catches Exception.
    -   This will catch everything and anything.

    --  Multi-catch Block
    -   A multi-catch block allows multiple exception types 
        to be caught by the SAME catch block.
    -    It’s like a regular catch clause, except two or more exception types 
        are specified separated by a pipe (|).
    -   the variable name must appear only once and at the end. ( exception | exception e)
    -   With multiple catch blocks, the exceptions must be ordered from more
        specific to broader, or be in an unrelated inheritance tree. 



    */

    public static void main(String[] args) {

        try {
            System.out.println(Integer.parseInt(args[1])); 
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) { // Multi-catch Block
            System.out.println("Missing or invalid input");
        }

    }
}