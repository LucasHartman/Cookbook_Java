
public class IncrementEx1 {

    /*
    -- Increment and Decrement Operators

    -   ++    Increment (prefix and postfix)
    -   --    Decrement (prefix and postfix)
    - The operator is place either before (prefix) or after (postfix)

    - Look out for questions that use the increment or decrement operators on a final variable.
      Because final variables can’t be changed, it produces a error.

    */

    static int players = 0;

    public static void main(String[] args) {
        
        // postfix
        System.out.println( players++ );    // 0
        System.out.println( players );      // 1

        // postfix incremented by one but only after the value of players is used in the expression.

        // prefix
        System.out.println( ++players );    // 2

        // prefix increment happens before the value of the variable is used

    }

}
