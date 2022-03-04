/*

*/

public class MultiLoopEx2 {

    public static void main(String[] args) {

        int result = 8; //  result is first set to 8
        loop: while (result > 7) { // the boolean condition is true because 8 > 7
            result++; // increment to 9
       
            do { //  Then the inner loop runs
            result--; // 9 8 7 6 5
            } while (result > 5); //  decrementing result until it is no longer greater than 5.
            break loop; // The break statement says to skip to after the labeled loop,
        }
    System.out.println(result);    //  Then result is printed as 5
    }
}
