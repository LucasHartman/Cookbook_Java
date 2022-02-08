public class BitwiseEx1 {

    /*
    Logical Operators (Bitwire)

    - They can be used with any of the integral types (char, short, int, etc). 

    Bite wise operators compare two variables bit by bit and 
    return a variable whose bits have been set based on wheter 
    the two variables being compared had respective bits that 
    were eighter;

    AND (&)     It returns bit by bit AND of input values
    OR (|)      It returns bit by bit OR of input values   
    XOR (^)     It returns bit by bit XOR of input values

    */

    public static void main(String[] args) {
        
        // AND
        byte b1 = 5 & 7; // 5
        byte b2 = 5 & 5; // 5
        System.out.println(b1);
        System.out.println(b2);

        // OR
        byte b3 = 5 | 7; // 7
        byte b4 = 5 | 5; // 5
        System.out.println(b3);
        System.out.println(b4);

        // XOR
        byte b5 = 5 ^ 7; // 2
        byte b6 = 5 ^ 5; // 0
        System.out.println(b5);
        System.out.println(b6);

    }
}
