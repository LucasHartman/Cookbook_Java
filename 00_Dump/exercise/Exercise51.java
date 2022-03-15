/*_________________________________________________________________________________________________________________________________
1. Unary Operators                         -      !      ++    --          negative    invert      increment
2. Multiplication, division, modulus       *      /      %                 multiple    division     remainder
3. Addition, subtraction                   +      -                        add         subtract
4. Relation operators                      <      >      <=    >=          greater     lesser      lesser-equal     greater-equal
5. Equality operators                      ==     !=                       equal       not-equal
6. Logical operators (non-circuit)         &      |    ^                   AND         OR
7. Short-circuit                           &&     ||                       AND         OR
8. Assignment operators                    =      +=     -=                equal       plusEqual   minusEqual
*/

public class Exercise51 {
    public static void main(String[] args) {
        
    boolean b1 = false;
    boolean b2; // declared

    int x=2, y=5;

    b1 =    2-12/4 > 5+-7    &&     b1 != y++>5     ==      7%4 > ++x   |   b1 == true;
        System.out.println(2-12/4);         // -1
        System.out.println(5+-7);           // -2
        System.out.println(2-12 > 5+-7);    // false
        System.out.println(false != 5>5);   // false
        System.out.println(7%4 > 3);        // false
        System.out.println(false == false); // true
        System.out.println(true | true);    // true

    b2 = (2-12/4 > 5+-7) && (b1 != y++>5) == (7%4 > ++x) | (b1 == true);

    System.out.println(b1 + " " +b2); // true true
    }
}
