/*
Look at the loop condition carefully. It tries to assign null to a String variable. This
is not an expression that returns a boolean. Therefore, the code does not compile, and
If this was fixed by making the loop condition tie == null, then
Option B would be correct.
*/


public class Exercise2 {
    public static void main(String[] args) {
        String tie = null; 
        while (tie = null) // = not ==
        tie = "shoelace";
        System.out.print(tie); // shoelace
        }
    }
