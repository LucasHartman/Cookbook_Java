public class WhileEx1 {

    /*
    While loop

    - Useful if you don't know how many times a block or statement should repeat.
    - Loops aslong the condition it true.
    - key point to remember about a while loop is that it might not ever run


    -- Semicolon
    -   the loop body is empty due to the semicolon right after the condition. 
    This means the loop condition keeps running
    String tie = null;
    while (tie == null);   <-----------
       tie = "shoelace";
       System.out.print(tie);


    */

    public static void main(String[] args) {
        
        int x = 2;
        while( x == 2) {            // 1st: true, 2nd: false
            System.out.println(x);  // 2
            ++x;
        }

    }
    
}
