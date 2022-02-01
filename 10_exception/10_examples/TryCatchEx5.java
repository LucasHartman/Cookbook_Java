class CastleUnderSiegeException extends Exception {}

class KnightAttackingException extends CastleUnderSiegeException {}

public class TryCatchEx4 {
    public static void main(String[] moat) {
        new TryCatchEx4().openDrawbridge();  // q3
    }


    public void openDrawbridge() // throws RuntimeException { // q1
        try {
            throw new KnightAttackingException();   //  thrown in the try block is handled by the associated catch block.
        } catch (Exception e) {
            throw new ClassCastException();         // The ClassCastException is an unchecked exception
                                                    // so it is not required to be handled or declared and line q1
        } finally {
            throw new CastleUnderSiegeException();  // The finally block throws a checked CastleUnderSiegeException, 
                                                    // which is required to be handled or declared by the method, but is not.
                                                    // There is no try-catch around it
        }
    }
}