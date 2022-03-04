public class ExerciseEx19 {
    
    static String shoe1 = new String("sandal");
    static String shoe2 = new String("flip flop");
 
    public static void shopping() {
        String shoe3 = new String("croc");

        shoe2 = shoe1; // sandal
        shoe1 = shoe3; // croc
    }
 
    public static void main(String... args) {
        shopping(); // eligible to be garbage collection: "flip flop"
    }
}