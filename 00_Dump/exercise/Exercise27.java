public class Exercise27 {

    public static void main(String[] args) {
        
        letters: for (char ch=0; ch<=3; ch++) {
            System.out.println("letters");
            numbers: for (int n=0; n<=3; n++) {
            //System.out.println(ch);
            System.out.println("numbers");
            // continue letters; // get out of inner loop and continue letters
            // continue numbers; // finish inner loop (normal flow)
            continue; // normal flow
            }
        }
    }
    
}
