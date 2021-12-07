public class TryCatchEx2 {

    static String s = "";
    public static void main(String[] args) {

        try {
            s += "1";
            throw new Exception();                  // exception is thrown
        } catch (Exception e) { s+= "2";            // exception is cathced
        } finally { s += "3"; doStuff(); s+= "4";   // arithmeticException is trown, but not catched
        }
        System.out.println(s);                      // code never gets executed
    }

    static void doStuff() { int x = 0; int y = 7/x; }
}
