public class TryCatchEx4 {

    public void start() {
        try {
            System.out.print("Starting up_"); // 1
            throw new Exception();
        } catch (Exception e) {
            System.out.print("Problem_"); // 2
            System.exit(0); //  which terminates the JVM
        } finally {
            System.out.print("Shutting down"); // does not execute because the JVM is no longer running
        }
    }

    public static void main(String[] args) {


    }
}