/*
This question appears to ask you about involved array logic. Instead, it is checking to
see if you remember that instance and class variables are initialized to null. Line 6 throws
a NullPointerException. If the array was declared, the answer would be E because the
code would throw an ArrayStoreException on line 8.
*/

public class ArrayEx1 {
        static int[][] game;        
        public static void main(String args[]) {
            game[3][3] = 6;         // throws a NullPointerException.
            // Object[] obj = game;
            // obj[3] = 'X';
            // System.out.println(game[3][3]);
            System.out.println(game[3][3]);
    }

}
