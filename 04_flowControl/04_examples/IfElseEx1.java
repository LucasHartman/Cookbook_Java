public class IfElseEx1 {

    /*

    if-else Branching

    - The expression in parentheses must evaluate to (a boolean) true of false
    - Most develpers consider it good practive to enclode blocks with curly braces, 
      even if there is only one statement in the block
    - You midhgt need ot nest if-else statement (it's nor recommended for readabitlity)
    - 




    */

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