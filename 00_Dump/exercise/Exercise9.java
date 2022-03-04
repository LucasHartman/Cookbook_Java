/*
A. Looping through the same list multiple times is allowed. Notice how there are not braces
around the loops. This means that only the print statement is inside the loop. It executes four
times. However, the println() only executes once at the end, making Option A the answer.
*/

import java.util.List;
import java.util.Arrays;

public class Exercise9 {
    public static void main(String[] args) {

        List<String> exams = Arrays.asList("OCA", "OCP");

        for (String e1 : exams) // loop 2 times
            for (String e2 : exams) // Notice how there are not braces around the loops. // loops 2 times       (2*2=4)
                System.out.print(e1 + " " + e2 +" "); // This means that only the print statement is inside the loop.
                System.out.println(); //  the println() only executes once at the end
    }
}

// output:  OCA OCA OCA OCP OCP OCA OCP OCP (print one line)