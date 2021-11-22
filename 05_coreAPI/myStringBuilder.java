public class myStringBuilder {

    /**
     * StringBuilder 
     * 
     * - mutable sequence of characters
     * 
     * 
     * ==============================================================================================
     * 
     * 
     * 
     * compare String and StringBuilder
     * -  Java does not allow you to compare String and StringBuilder using ==
     *    String s1 = "java";
     *    StringBuilder s3 = new StringBuilder("java");
     *    if (s1 == s3) count++;                // incompatible
     * 
     * */


     public static void main(String[] args) {


         // Creating a StringBuilder
        StringBuilder sb1 = new StringBuilder();             // empty sequence
        StringBuilder sb2 = new StringBuilder("animal");    // containing a specific value 
        StringBuilder sb3 = new StringBuilder(10);          // number of slots



        // print string
        System.out.println(sb2.toString());



        // append()
        // append  a StringBuilder, because they are mutable
        sb2.append(" Crossing"); // animal Crossing



        // capacity()
        //  returns the current capacity of the string ( total amount of characters storage size)
        // An empty StringBuilder class contains the default 16 character capacity
        System.out.println(sb1.capacity()); // 16
        System.out.println(sb2.capacity()); // 22  16+(animal=6)=22
        System.out.println(sb3.capacity()); // 10


        // insert()
        System.out.println( sb2.insert( 6, "aaaa") );   // inster bij index


        // charAt()
        var builder = new StringBuilder("12345");
        char e = builder.charAt(4); // get value form index 4
        System.out.println(e); // 5


        // replace()
        builder.replace(2,5, "6"); // replace index 2 t/m 5 with "6"
        System.out.println(builder.toString() ); // 126


        // delete()
        // delete a part of a STringBuilder
        StringBuilder numbers = new StringBuilder("0123456789");
        numbers.delete(2, 8);
        System.out.println(numbers.toString()); // 0189     deletes: 234567



        // deleteCharAt
        // remove character by index
        numbers.deleteCharAt(0);
        System.out.println(numbers.toString()); // 189     deletes: 0


        // revers()
        var puzzle = new StringBuilder("Java");
        puzzle.reverse();
        System.out.println(puzzle.toString() ); // "avaJ"




         





     }
    
}
