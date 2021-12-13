public class myString {


    /**
     * String
     * 
     * - When a string is created in Java, it occupies memory in the heap.
     * 
     * - the String class is immutable.  
     *   Therefore, whenever we create a string using the new keyword, 
     *   new memory is allocated in the heap for corresponding string
     * 
     * 
     * String Constant Pool (SCP)
     * The SCP is an area inside the heap memory. 
     * It contains the unique strings. In order to put the strings in the string pool, 
     * one needs to call the intern() method. Before creating an object in the string pool, 
     * the JVM checks whether the string is already present in the pool or not. 
     * If the string is present, its reference is returned.
     * 
     * 
     * 
     * ==============================================================================================
     * 
     * 
     * 
     * int into a String
     * - you can't store a int into a String
     *   String x = "fish" +1;                  // incompatible
     * 
     * 
     * 
     * compare String and StringBuilder
     * -  Java does not allow you to compare String and StringBuilder using ==
     *    String s1 = "java";
     *    StringBuilder s3 = new StringBuilder("java");
     *    if (s1 == s3) count++;                // incompatible
     * 
     * 
     */

    public static void main(String[] args) {


        // create String
        // Separate memory
        var s = "Hello";            // point to the String in the string pool
        var t = new String(s);      // calls the String constructor explicity and is there for a diffetn object than s
        System.out.println(s == t); // false      separate memory is allocated for each string literal. 



        // intern()
        // Same memory
        String str1 = new String("It's the same").intern(); // intern() method is invoked on the String objects. Therefore, the memory is allocated in the SCP
        String str2 = new String("It's the same").intern(); //  no new string object is created as the content of str1 and str2 are the same.
        System.out.println(str1 == str2);     // true   Share the same memmory



        // equals()
        // compares the two given strings based on the content of the string. 
        // If any character is not matched, it returns false.
        boolean a = "Hello".equals(s);  // true
        boolean b = "Hello" == s;       // true     compares references both point to the object from the string pool.



        // concat()
        // concatenates one string to the end of another string.
        String c = "Moon";
        c.concat("Base");
        System.out.println(c); // Moon      String is unmutable, so concat() doens nothing

        String d = c.concat("Base"); // Solution
        System.out.println(d); // MoonBase  Create a new string to concat a previous string



        // substring()
        // get a part of an string
        String numbers = "012345678";
        System.out.println(numbers.substring(1, 3)); // "12"        from 1 to 3
        System.out.println(numbers.substring(7, 7)); //             no output
        System.out.println(numbers.substring(1));    // "12345678"  everthing after input


        
        // String length
        System.out.println( numbers.length());



        // trim()
        // It returns the omitted string with no leading and trailing spaces
        String e = "    beast    ";
        System.out.println( e.trim() ); // beat



        // toUpperCase();
        String f = "Musk";
        System.out.println( f.toUpperCase() ); // "MUSK"



        // Format()
        // https://dzone.com/articles/java-string-format-examples
        int intVal = 11;
        float floatVal = 1.1f;
        char charVal = 'a';
        String strVal = "str";
        String formatLib = String.format("integer: %d \nfloat: %f \nChar: %c \nString: %s", intVal, floatVal, charVal, strVal); 
        System.out.println(formatLib);

        String addZeros = String.format("%020d", 93); // 00000000000000000093
        System.out.println("add numbers: "+addZeros);

        String bigNumber = String.format("%,d", 1000000000); // 10,000,000
        System.out.println("thousands separator: "+bigNumber);










        
    }
    
}
