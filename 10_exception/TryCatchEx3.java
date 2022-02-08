public class TryCatchEx3 {

    public void go() {
        System.out.print("A"); // 1

        try {
            stop();
        } catch(ArithmeticException e) {
            Syste.out.print("B");
        } finally {
            System.out.print("C"); // 3
        }
        System.out.print("D");
    }

    public void stop() {
        System.out.print("E"); // 2
        Object x = null;
        x.toString(); // NullPointerException
        System.out.print("F");
    }


    public static void main(String[] args) {

        new TryCatchEx3().go(); // A E C stcck trace

    }
}