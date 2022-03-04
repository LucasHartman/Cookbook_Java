/*

*/

public class Exercise7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // creates an empty StringBuilder
        sb.append("red");   // red - adds three characters to it.
        sb.deleteCharAt(0); // removes the first character resulting in ed
        sb.delete(1,1);     /* deletes the characters starting at position
                            1 and ending right before position 1. Since there are no indexes 
                            that meet that description,the line has no effect. */
        System.out.println(sb); // ed
    }
}
