public class ContinueEx2 {

    /*
    -- continue
    -   unlabeled continue statements is that the current iteration
        stops early and execution jumps to the next iteration.
    */

    public static void main(String[] args) {
        
        int[] ia = {1,3,5,7,9};

        // outer loop
        for(int x : ia) {

            // innner loop
            for (int j = 0; j<3; j++) {

                if (x>4 && x<8) continue;
                
                System.out.print(" " +x); // 1 1 3 3 9 9
                // loop 1: x = 1
                // loop 2: x = 1 (we are still in the inner loop)
                // loop 3; X = 3
                // LOOP 4: X = 3 ( we are again still in the inner loop)
                // loop 5; X = 5 (x>4 && x<8)
                // LOOP 6: x = 5 (x>4 && x<8) j==1
                // loop 7; X = 5 (x>4 && x<8)
                // LOOP 8: x = 5 (x>4 && x<8) j==1
                // loop 9; X = 9
                // LOOP 10; X = 9 J==1
                
                if(j==1) break; // 2nd: ends inner loop
                
                continue;
            } // end inner loop

            continue;
        } // end outer loop
    }
}
