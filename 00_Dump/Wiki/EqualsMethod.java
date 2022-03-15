public class EqualsMethod {

    enum Color { RED, BLUE } // ; is optional
    public static void main(String[] args) {
        
        // compare String
        String x = "a";
        String y = "a";
        System.out.println(x.equals(y)); // true

        // compare toString
        StringBuilder sb = new StringBuilder(5);
        String s = "";
        System.out.println(sb.toString().equals(s.toString())); // true

        // compare Enum
        Color c1 = Color.RED;
        Color c2 = Color.BLUE;
        System.out.println(c1.equals(c2)); // false

        // equalsIgnoreCase()
        String lol = "lol";
        System.out.println(lol.toUpperCase().equals(lol)); // false
        System.out.println(lol.toUpperCase().equalsIgnoreCase(lol)); // true
    }
    
}
