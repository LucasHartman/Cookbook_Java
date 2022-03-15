/*
_________________________________________________________________________________________________________________________________
1. Unary Operators                         -      !      ++    --          negative    invert      increment    decrement

2. Multiplication, division, modulus       *      /      %                 multiple    division    remainder
3. Addition, subtraction                   +      -                        add         subtract

4. Relation operators                      <      >      <=    >=          greater     lesser      lesser-equal greater-equal
5. Equality operators                      ==     !=                       equal       not-equal

6. Logical operators (non-circuit)         &      |    ^                   AND         OR   xor
7. Short-circuit                           &&     ||                       AND         OR

8. Assignment operators                    =      +=     -=                equal       plusEqual   minusEqual
*/

public class Operators {
    public static void main(String[] args) {

        // Logical (non-circuit, inviolate both side) 
        System.out.println( true    &  true);       // true
        System.out.println( false   &  false);      // false
        System.out.println( true    &  false);      // false
        System.out.println( false   &  true);       // false

        System.out.println();

        System.out.println( true    |  true);       // true
        System.out.println( false   |  false);      // false
        System.out.println( true    |  false);      // true
        System.out.println( false   |  true);       // true

        System.out.println();

        System.out.println( true    ^   true);      // false
        System.out.println( false   ^   false);     // false
        System.out.println( true    ^   false);     // true
        System.out.println( false   ^   true);      // true


    }
    
}
