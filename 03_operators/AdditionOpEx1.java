public class AdditionOperator {

    /*
    AdditionOperator
    
    - Concatenation runs from left to right, 
    - and if either operand is a String, the operands are concatenated. 
    - If both operands are numbers, they are added together.
    */

    public static void main(String[] args) {
        
        long x = 42L;
        long y = 44L;

        System.out.println(" " + 7 + 2 + " ");      // " " + 7 + 2 + " "        7 2
        System.out.println(foo() + x + 5 + " ");    // foo + 42 + 5             foo 42 5
        System.out.println(x + y + foo());          // (42+44=88) + foo 86      88 foo
    }

    static String foo() { return "foo"; }
    
}
