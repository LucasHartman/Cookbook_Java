/*
-   The first two iterations through the loop complete successfully
-   the two arrays are not the same size and the for loop only 
    checks the size of the first one
-   The third iteration throws an ArrayIndexOutOfBoundsException
*/

public class Exercise20 {
    public static void main(String... args) {

        String[] nycTourLoops = new String[] { "Downtown", "Uptown", "Brooklyn" };
        String[] times = new String[] { "Day", "Night" };
       
        for (int i = 0, j = 0; i < nycTourLoops.length; i++, j++)
            System.out.println(nycTourLoops[i] + " " + times[j]);
        }   
}
