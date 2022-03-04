/*
F. The code compiles without issue, making Options D and E incorrect. 

Applying the ternary ? : operator, the variable ship is assigned a value of 10.0. 

The expression in the first if-then statement evaluates to true, so Goodbye is printed.
Note that there is no else statement between the first and second if-then statements, therefore 

the second if-then statement is also executed. The expression in the second if-then statement evaluates to false, so the
else statement is called and See you again is also printed. 

Therefore, Option F is the correct answer, with two statements being printed.
*/

public class Exercise16 {

    private int space = 5;
    private double ship = space < 2 ? 1 : 10; // g1     10
    
    public void printMessage() {
        if(ship>1) {                          // true
            System.out.println("Goodbye");
        } 
        
        if(ship<10 && space>=2) System.out.println("Hello"); // g2      false
        else System.out.println("See you again");
    }
    public static final void main(String... stars) {
        new Cowboy().printMessage(); // "Goodbye See you again"
    }
}
    

