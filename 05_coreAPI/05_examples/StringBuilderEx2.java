public class StringBuilderEx2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("abc");
        String s = "abc";

        sb.reverse().append("d");    // operations are working on StringBuilder sb
        s.toUpperCase().concat("d"); // operations are working on a new (lost) String

        System.out.println("." + sb ". ." +s + "."); // .abc.   cbad.

    }
}