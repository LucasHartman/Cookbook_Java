/*

*/

class CastleUnderSiegeException extends Exception {}

class KnightAttackingException extends CastleUnderSiegeException {}

public class Exercise26 {

    public void openDrawbridge() throws RuntimeException { // q1
        try {
            throw new KnightAttackingException();
        } catch (Exception e) {
            throw new ClassCastException(); // The ClassCastException is an unchecked exception, so it is not required to be handled or declared
        } finally { // The finally block throws a checked CastleUnderSiegeException, which is required to be handled or declared by the method, but is not. 
            throw new CastleUnderSiegeException();  // q2 There is no try-catch around line q2, and the method does not declare a compatible checked exception, 
                                                    // only an unchecked exception. For this reason, line q2 does not compile,
        }
    }
    public static void main(String[] moat) {
        new Exercise26().openDrawbridge(); // q3 compiles without issue because the unchecked RuntimeException is not required to be handled or declared by the call in the main() method.
    }
}