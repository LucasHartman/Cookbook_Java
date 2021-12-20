public class StringEx2 {


    public static void main(String args[]) {

        String s = "JAVA";

        s = s + "rocks";        // JAVArocks     (new String Object)
        s = s.substring(4,8);   // rock          (new String Object)
        s.toUpperCase();        // ROCK          (new String Object, but no reference)

        System.out.println(s); // rock

    }
}