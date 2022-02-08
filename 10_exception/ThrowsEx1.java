public class ThrowsEx1 {

    /*


    -- throws
    - The throws keyword in Java is used to declare exceptions that can occur during the execution of a program.
      1. declare an exception which might get thrown
      2. declare multiple exceptions
      3. declare checked and uncheced exception
      4. syntax wise throws keywrod is floolowed by expcetion class names
      5. throws keyword is used with the method signature

      -- throw
      1. throw an exception
      2. thow single exception not multiple
      3. throw only unchecked excepition
      4. throw is followed by the instance variable
      5. throw is used within the method

      -- Checked Exceptions
      - Are the exceptoins that are checked at compile time

      -- Uncheced Exceptions
      - Exceptions that are not checked at compile time
      - Error and RutnimeException are unchecede exceptions.


    */

    // Declare Exception (possibly thrown by this method)
    static public int division(int a, int b) throws ArithmeticException{
        int t = a/b;
        return t;

    public static void main(String[] args) {

      try {
         System.out.println( division( 15, 0 ) );
      } catch(ArithmeticException e){
         System.out.println("You shouldn't divide number by zero");
      }
        

    }
}
