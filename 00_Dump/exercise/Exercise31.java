public class Exercise31 {
    static int start = 2;
    final int end;

    public Exercise31(int x) { // parameter is local variable
       x = 4;
       end = x; // 4 (not local (has no data type))
    }

    public void fly(int distance) {
       System.out.print(end-start+" "); // 4-2=2
       System.out.print(distance); // 5
    }

    public static void main(String... start) {
       new Exercise31(10).fly(5); // 2 5
    }
}