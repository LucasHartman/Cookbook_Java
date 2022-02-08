public class ShortCircuitEx1 {

    /* 

    -- Logical Operators (short-circuiting)
-    Source: https://www.geeksforgeeks.org/java-logical-operators-with-examples/
-   perform logical “AND”, “OR” and “NOT” operation
-   similar to AND gate and OR gate in digital electronics. 
-   keep in mind is the SECOND CONDITION IS NOT EVALUATED if the first one is false
-   it has a short-circuiting effect.
-   AND (&&)    if both are true
                if (true && true) {}
-   OR (||)     if one is true
                if (false || true) {}
-   NOT (!)     Unary Operator, returns opposite value
                if (!false) // is true
    
-- Short-Circuit (&& ||) 
-   Meaning they don't evaluate the right hand side if it not necessary
-   if left hand side is false no need to evaluate right hand side one. 
-  short-circuiting operators can be slightly slower because they cause branching in the program execution

-- Non-Short-Circuit (& |) 
-   they evaluate both side of the expression, ALWAYS!
    even if the first operant (lef side) is false, the second operant will still be evalued.
*/

    public static void main(String[] args) {

        // AND
        boolean b1 = (true == true) && (true == true);      // true && true =  true
        boolean b2 = (true == true) && (true == false);     // true && false = false
        boolean b6 = (false == false) && (false == false);  // true && true =  true
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b6);

        // OR
        boolean b3 = (true == true) || (true == true);      // true || ture =  true
        boolean b4 = (true == true) || (true == false);     // ture || fasle = true
        boolean b5 = (false == false) || (false == false);  // true || true =  true
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

        /* The || and && operators work only with boolean operands. 
        The exam may try to fool you by using integers */
        boolean b7 = (5 && 6);  // error
        boolean b8 = (5 & 6);   // error
        
    }
}
