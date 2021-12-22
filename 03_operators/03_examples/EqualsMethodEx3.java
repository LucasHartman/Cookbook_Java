public class EqualsMethodEx3 {

    /*
    */

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(5); // empty StringBuilder
        String s = ""; // empty String (but not null object)

        if (sb.equals(s)) {
            System.out.println("Match 1");
        } else if (sb.toString().equals(s.toString))) { // true (convert both values to String, which make them both reference the same memory heap)
            System.out.println("Match 2"); // Now they both 
        } else {
            System.out.println("No Match")
        }

    }
}
        

