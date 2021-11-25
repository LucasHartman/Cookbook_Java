
public class NonShortCircuiteEx1 {

    /*

    Logical Operators (Non-short-Circuit)

    &   AND       both must be true
    |   OR        at least one must be true

    ^   XOR       Only one operand must be true.
    !   NOR       inverts the outcome

    Non-Short-Circuid (& |) 
    - they evaluate both side of the expression, ALWAYS!
    even if the first operant (lef side) is false, the second operant will still be evalued.


    Short-Circuide (&& ||) 
    - Meaning they don't evaluate the right hand side if it that doesn't necessary
    Example:  
    if left hand side is false no need to evaluate right hand side one. 
    -  short-circuiting operators can be slightly slower because they cause branching in the program execution

    */

    public static void main(String[] args) {

                // AND
                boolean b1 = (true == true) & (true == true);      // true & true =  true
                boolean b2 = (true == false) & (true == true);     // false & true = false
                boolean b6 = (false == false) & (false == false);  // true & true =  true
                System.out.println(b1);
                System.out.println(b2);
                System.out.println(b6);
        
                // OR
                boolean b3 = (true == true) | (true == true);      // true | ture =  true
                boolean b4 = (false == true) | (true == true);     // false | true = true
                boolean b5 = (false == false) | (false == false);  // true | true =  true
                System.out.println(b3);
                System.out.println(b4);
                System.out.println(b5);

                // XOR
                boolean b7 = (true == true) ^ (true == true);      // true  ^ true = false
                boolean b8 = (false == true) ^ (true == true);     // false ^ true = true
                boolean b9 = (false == false) ^ (false == false);  // true  ^ true = false
                System.out.println(b7);
                System.out.println(b8);
                System.out.println(b9);

                // NOR
                boolean b10 = !(7==5); // true
                boolean b11 = (true & !false); // true
                System.out.println(b10);
                System.out.println(b11);


        

    }
}
