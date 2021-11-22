public class incrementOperators {
    /**
     * Increment and Decrement Operators
     * - add 1 to, or subtract 1 from, a variable.'
     * 
     * - An expression that uses an increment or decrement operator is a statement itself
     * 
     * - Increment and decrement operators can be placed before (prefix) or 
     * after (postfix) the variable they apply to.
     * 
     * 
     * 
     */

    public static void main(String[] args) {

        // use an increment or decrement operator in an assignment statement
        int a = 5;
        int b = a--;    // both a and b are set to 4


        // (prefix) or after (postfix)
        int a = 5;
        int b = 3;

        // postfix
        // While using the postfix form, we first use the value of the operand in the expression and then update it.
        int c = a * b++;   // c is set to 15        5 * 3 = 15

        // prefix
        // While using the prefix form, we first update the value of the operand and then we use the new value in the expression.
        int d = a * ++b;   // d is set to 20        5 * 4 = 20
        



    }
    
}
