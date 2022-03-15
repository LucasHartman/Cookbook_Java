public class Exercise54 {
    static int magnify = 2;
    public static void main(String[] args) {
        go();
    }

    static void go() {
        int magnify = 3; // Local Variable
        zoomIn();
    }

    static void zoomIn() {
        magnify *= 5; // Class Variable 10
        zoomMore(magnify); // input Class Variable
        System.out.println(magnify); // Class Variable 10
    }

    static void zoomMore(int magnify) { // Parameter
        magnify *= 7; // Local Variable
    }
}
