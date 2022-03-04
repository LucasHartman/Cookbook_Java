import java.time.*;

/*
Trick question. This appears to be about equality, but it is really about you recognizing
that the main() method is missing the static keyword. Running this problem gives a run-
time exception because the main() method is not properly declared. Therefore, Option A
is the answer. If this was fixed, the answer would be Option C because the int and String
comparisons return true.
*/

public class Exercise11 {

        public static void main(String[] args) { // main() method is missing the static keyword.

        System.out.println(new StringBuilder("zelda") == new StringBuilder("zelda")); // false

        System.out.println(3 == 3);                             // true
        System.out.println("bart" == "bart");                   // true    

        System.out.println(new int[0] == new int[0]);           // false  no objects just values
        System.out.println(LocalTime.now() == LocalTime.now()); // false  no objects just values
    }
    
}
