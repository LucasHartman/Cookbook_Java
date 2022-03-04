/*
Since there are not brackets around the while loop, only line 17 is in the loop body. 

Line 18 gets executed once after the loop completes. 
This means that count will be 1 assuming the loop completes. 

Subtracting a month from JANUARY results in DECEMBER. 
Since the loop completes E is incorrect and Option B is the answer. 

Note that if the brackets were added as the indentation suggests, 
Option D would be the answer since we are counting months backwards.
*/

public class Exercise24 {
    public static void main(String[] args) {
    
        int count = 0;
        LocalDate date = LocalDate.of(2017, Month.JANUARY, 1);

        while (date.getMonth() != Month.APRIL)   // Since there are not brackets around the while loop, only line 17 is in the loop body.
            date = date.minusMonths(1);          // Subtracting a month from JANUARY results in DECEMBER. 
            count++;                             // gets executed once after the loop completes. 
        System.out.println(count);
    }

}
