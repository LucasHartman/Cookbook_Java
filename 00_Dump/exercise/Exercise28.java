public class Exercise28 {

    private static int count; // 0
    private static String[] stops = new String[] { "Washington", "Monroe", "Jackson", "LaSalle" };
    public static void main(String[] args) {
       while (count < stops.length) {           // 00<04    01<04   02<04   03<04   04<04 false
          if (stops[count++].length() < 8) {    // 10<08
             continue;
           }
       }
       System.out.println(count); // 4
    }
 }
