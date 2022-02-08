public class VarScope {

    public static void main(String[] args) {

        int score = 1;

        try {
            // int score = 1; // error - defined only within the try block
            System.out.print(score++);
         } catch (Throwable t) {
            System.out.print(score++);
         } finally {
            System.out.print(score++);
         }
         System.out.print(score++); // 123

    }
}