public class ForEx1 {

    public static void main(String[] args) {
        
        // Example: Basic
        for (int x = 0; x < 3; x++) {
            System.out.println(x); // 0 1 2
        }

        // Example: Infinte
        /*for ( ; ; ) {
            System.out.println("Indside an endless loop");
        }*/

        // Example: Multiple variables
        for (int i = 0, j = 0; (i<10) && (j<10); i++, j++) {
            System.out.println("i is " + i + "j is " +j);
        }

        // Example: Loop Array
        int[] arr = {1,2,3,4};
        for (int a : arr) {
            System.out.println(a); // 1 2 3 4
        }

        // Example Loop 2d Array
        int [][] twoDee = { {1,2,3}, {4,5,6}, {7,8,9} };
        for (int td : twoDee[2] ) {
            System.out.println(td); // 7 8 9
         }



    }
    
}
