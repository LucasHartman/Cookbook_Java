
/* tags: if-statement, if-then

--  if-else Branching
-   The expression in parentheses must evaluate to (a boolean) true of false
-   Most developers consider it good practive to enclode blocks with curly braces, 
    even if there is only one statement in the block
-   You might need to  nest if-else statement (it's nor recommended for readabitlity)
-   if-then statement may execute a single statement or a block of code {}


--  if statement without brackets
    if(true)
        triceratops++;
        triceratops--;
-   triceratops--; is not part of the if statement
-   if-then statement may execute a single statement or use {}


-- nested if-then
    if(flair >= 15 && flair < 37) {         // first if-then
        System.out.print("Not enough");
    } if(flair==37) {                       // Second if-then
        System.out.print("Just right");
    } else {
        System.out.print("Too many");
    }
-   notice that the second if-then statement is not connected to
    the first if-then statement, as there is no else joining them.


--  else statement
-   You can't have two else statement, you dummy
*/


public class IfElseEx1 {
    public static void main(String[] args) {

        // Example 1
        int x =1;
        if ( x == 3)        { System.out.println("A");}
        else if ( x < 4)    { System.out.println("B");} // result
        else if ( x < 2)    { System.out.println("D");}
        else                { System.out.println("E");}


        // Exmaple 2
        int y = 5;
        int z = 2;
        if (((z>3) && (y<2)) | true) { // 
            System.out.println("true");
        }
        
    }

}
