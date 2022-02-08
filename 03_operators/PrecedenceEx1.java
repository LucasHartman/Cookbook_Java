public class PrecedenceEx1 {
    
    /*

    “UMARELSA”
    _________________________________________________________________________________________________________________________________
    1. Unary Operators                         -      !      ++,    --          negative    invert      increment
    2. Multiplicaiton, divsion, modulus        *      /      %                  multiple    divsion     remainder
    3. Addition, subtraction                   +      -                         add         substract
    4. Relation operators                      <      >      <=    >=           greater     lesser      lesser-equal     greater-equal
    5. Equality operators                      ==     !=                        equal       not-equal
    6. Logical operators (non-circuit)         &      |                         AND         OR
    7. Short-circuit                           &&     ||                        AND         OR
    8. Assignment operators                    =      +=      -=                equal       plusEqual   minusEqual


    -- recedence rules!
    
    1. When two operatos of the same precedence are in the same expresion,
    Java evaluates the expression from left to right.

    2. When parts of an expression are placed in parentheses,
    those pars are evaluted first.
    
    3. When parentheses are nested, the innermost parentheses are evaluted fist.

    */

    public static void main(String[] args) {

        int a =  (-7 - 4 );
        int b = (-(7 - 4)); 
        System.out.println(a); // -11
        System.out.println(b); // -3

        int c = (2 + 3 * 4); // multiply comes first
        int d = ((2 + 3) * 4);
        System.out.println(c); // 14
        System.out.println(d); // 20

        boolean e = (7 > 5 && 2 > 3); // true && false
        boolean f = (true & false == false | true); // == has the highest precedence
        System.out.println(e); // false
        System.out.println(f); // true

    }
}
