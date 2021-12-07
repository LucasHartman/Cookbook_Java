public class DoEx2 {

    public static void main(String[] args) {
        
        double iguana = 0;
        
        do {
            int snake = 1; // compile error
            // The variable snake is declared within the body of the 
            // do / while statement, so it is out of scope
            System.out.print(snake++ + " ");
            iguana--;
        } while (snake <= 5);
        System.out.println(iguana);
    }
    
}
