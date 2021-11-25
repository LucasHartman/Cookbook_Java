public class PrecedenceEx1 {
    
    /*

    “UMARELSA”
    ___________________________________________________________________
    1. Unary Operators                         -      !      ++,    --
    2. Multiplicaiton, divsion, modulus        *      /      %
    3. Addition, subtraction                   +      -
    4. Relation operators                      <      >      <=    >=
    5. Equality operators                      ==     !=
    6. Logical operators                       &      |
    7. Short-circuit                           &&     ||
    8. Assignment operators                    =      +=      -=


    -- recedence rules!
    
    1. When two operatos of the same precedence are in the same expresion,
    Java evaluates the expression from left to right.

    2. When parts of an expression are placed in parentheses,
    those pars are evaluted first.
    
    3. When parentheses are nested, the iinermost parentheses are evaluted fist.



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

        boolean e = (7 > 5 && 2 > 3); // true && faslse
        boolean f = (true & false == false | true); // == has the highest precedence
        System.out.println(e); // flalse
        System.out.println(f); // true

    }
}
