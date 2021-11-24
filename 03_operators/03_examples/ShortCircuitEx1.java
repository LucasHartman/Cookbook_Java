public class ShortCircuitEx1 {

    /* 
    logical operators (short-circuit) 

    AND (&&)        Short-circuit 
    OR (||)         Short-circuit
    
    They are used to link boolean expressions together to from bigger boolan expressions.
    
    Short-Circuide (&& ||) 
    - Meaning they don't evaluate the right hand side if it that doesn't necessary
    Example:  
    if left hand side is false no need to evaluate right hand side one. 
    -  short-circuiting operators can be slightly slower because they cause branching in the program execution

    Non-Short-Circuid (& |) 
    - they evaluate both side of the expression, ALWAYS!
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
        boolean b7 = (5 && 6);
        
    }
}
