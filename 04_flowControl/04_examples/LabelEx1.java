/*
Labeled Statement

-  statements in a Java program can be labeled
- A label statement must be placed just before the statement being labeled, 
- and it consists of a valid identifier that ends with colon(:).
*/
    
public class LabelEx1 {
    public static void main(String[] args) {
        
        // Example: Label Break
        boolean isTrue = true;
        outer: // <--------------------------------label
            for(int i=0; i<5; i++) {
                
                while (isTrue) {
                    System.out.println("Hello");
                    break outer; // <--------------label break
                } // end if innter while loop

                System.out.println("Outer Loop"); // Won't print
            }
        
        // Example: Label Continue
        outer: // <--------------------------------label
            for ( int i=0; i<5; i++) {
                for (int j=0; j<5; j++) {

                    System.out.println("Hello");
                    continue outer; // <-----------label continue
                } // end of inner loop
                System.out.println("Outer"); // Never prints
            }
        System.out.println("Good-Bye");
            
    }            
}