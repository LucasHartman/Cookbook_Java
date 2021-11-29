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

        System.out.println(" " + 7 + 2 + " "); // 7 2 (numbers)
        System.out.println(foo() + x + 5 + " "); // foo 42 5 ??????????
        System.out.println(x + y + foo()); // 86 foo (numbers)
    }

    static String foo() { return "foo"; }
    
}
