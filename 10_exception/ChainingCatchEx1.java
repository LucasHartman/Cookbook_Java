public class ChainingCatchEx1 {

    /*
    --   Chained Exceptions
    -   situation in which one exception causes another Exception
    -   

    --   Example
    -   consider a method which throws an ArithmeticException because of 
        an attempt to divide by zero but the actual cause of exception was an 
        I/O error which caused the divisor to be zero.The method will throw 
        the ArithmeticException to the caller. The caller would not know about 
        the actual cause of an Exception.  Chained Exception is used in such situations.
    */

    public static void main(String[] args) {


    }
}