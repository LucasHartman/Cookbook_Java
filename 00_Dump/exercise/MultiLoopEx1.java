/*
One line needs to be changed for this code to compile.
If the code is fixed to compile, half of the cells in the 2D array have a value of 0.

*/

public class MultiLoopEx1 {

    public static void main(String[] args) {
    
    int[] crossword [] = new int[10][20];   // It is allowed to split up the braces in the 2D array declaration
    // The array starts out with all 200(10*20) of the cells initialized to the default value for an int of 0.

    for (int i=0; i<crossword.length; i++)      // Both loops iterate starting at 0 and stopping before 10, which causes only half of the array to be set to 'x'.
        for ( int j=0; j<crossword.length; j++) 
            crossword[i][j] = 'x';              // The other half still has the initial default value of 0
    
    //System.out.println(crossword.length());   // does not compile because arrays use length. It is ArrayList that uses size().
        
    }
}
