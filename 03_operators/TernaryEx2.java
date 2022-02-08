public class TernaryEx2 {

    public static void main(String[] args) {
        
        int i = 42;

        // Nested Ternary
        String s = (i<40) ? "life" : (i>50 ? "universe" : "everything");
        //     s = (false)?        :(false)?            : "everything"
        
        System.out.println(s); // everything
    }
    
}
