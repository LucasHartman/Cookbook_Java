/*
A. Line 8
B. Line 9
C. Line 10
D. Line 11
E. Line 12
F. Line 13

C, D, E. For this question, it helps to remember that the value of a case statement must
be a literal expression or a final constant variable, and have a compatible data type. For
these reasons, 

Lines 10 and 12 do not compile, making Options C and E correct answers.
Line 10 uses a constant value, but long is not compatible with switch statements, while
Line 12 uses a variable that is not marked final. Next, a switch statement may only have
one default block. Therefore, Line 11 or 14 must be removed. Since Line 14 is not in the
list of options, Option D becomes the last correct answer. The rest of the lines are fine since
removing Lines 10, 11, and 12 allows the code to compile.
*/

public class Exercise14 {
    public static void main(String[] args) {
        
        final long winter = 10;
        final byte season = 2;
        int fall = 4;
        final short summer = 3;

        switch(season) {
            case 1:
            case winter: System.out.print("winter"); // long can't be autocast to int
            default: // remove ?
            case fall : System.out.print("fall"); // not marked final
            case summer: System.out.print("summer");
            default: // can have 2 default keywords
        }
    }
}
