public class ErrorEx1 {

    /*

    Error

    - Error represent unusual situations that are not caused by program errors and indicate
      things that would not normally happen during program execution, such as the JVM running out of memory.
    - Generally, your application won’t be able to recover from an Error, so you’re not required to handle them.
    - Errors are technically not exceptions because they do not derive from class Exception.

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
    <Runtime Exception> (Unchecked)          <Other Exception>                         IOException
            |
    - ArithmeticException                                                                   |
    - ArrayIndexOutOfBoundsException                                        FileNotFoundException (checked Exception)
    - ClassCastException
    - NullPointerException
    - IllegalArgumentException
    - NumberFormatException


    */
    public static void main(String[] args) {
        
    }
    
}
