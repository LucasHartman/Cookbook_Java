public class StringEx3 {
    public static void main(String args[]) {

        String builder = "54321";               //  creates a String of length 5
        builder = builder.substring(4);         
        // String is immutable, a new String 
        // with the value 1 and assigns it to builder.
        
        System.out.println(builder); // 1
        System.out.println(builder.charAt(2)); // gives a StringIndexOutOfBoundsException
    }
}
