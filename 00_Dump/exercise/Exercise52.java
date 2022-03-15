public class Exercise52 {
    static String s = "";
    public static void main(String[] args) {
        try {
            s += "1"; // 1
            throw new Exception();
        } catch (Exception e) { s += "2"; // 12
        } finally { s += "3"; doStuff(); s += "4"; // 123 java.lang.ArithmeticException:
        }
        System.out.println(s); // java.lang.ArithmeticException:
    }
    static void doStuff() { int x=0; int y= 7/x; }
}
