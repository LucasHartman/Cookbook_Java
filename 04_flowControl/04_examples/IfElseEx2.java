public class IfElseEx2 {

    public static void main(String[] args) {
        
        int penguin = 50, turtle = 75;
        boolean older = penguin >= turtle;
        
        if (older = true) System.out.println("Success");
        else System.out.println("Failure");
        else if(penguin != 50) System.out.println("Other"); // compile error
        // else if does not matches
    }
    
}
