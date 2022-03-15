public class Exercise33 {
    public static void main(String[] args) {
        new Exercise33().myMethod(5);
    }

    int myMethod( int x) {
        if (x<10) {
            return 1;
        } else if (x>=10) {
            return 2;
        }
    }
}