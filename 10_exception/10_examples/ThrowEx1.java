import java.io.IOException;

public class ThrowEx1 {

    /*

    Exception Declaration

    -- throw

      throw
      1. throw an exception
      2. thow single exception not multiple
      3. throw only unchecked excepition
      4. throw is followed by the instance variable
      5. throw is used within the method

      throws
      1. declare an exception which might get thrown
      2. declare multiple exceptions
      3. declare checked and uncheced exception
      4. syntax wise throws keywrod is floolowed by expcetion class names
      5. throws keyword is used with the method signature
    - 

    */

    public static void main(String[] args) {
        
        try {
            throw new NullPointerException("demo"); // <--- throw Exception
        } catch(NullPointerException e) {
            System.out.println("Caught explicit Exception");
        }
    }
    
}
