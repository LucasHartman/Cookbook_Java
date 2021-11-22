import java.util.*;

public class coreExam {


    public static void roar(String roar1, StringBuilder roar2) {
        roar1.concat("!!!");
        roar2.append("!!!");
    }

    public static void main(String[] args) {
        
        // types
        int numFish = 4;
        String fishType = "tuna";
        String anotherFish = numFish +"1"; // can't store an int into in String
        System.out.println(anotherFish + " " +fishType);
        System.out.println(numFish + " " +1);



        // Memory
        var s = "Hello";
        var t = new String(s);
        if ("Hello".equals(s)) System.out.println("one");
        if ( t == s ) System.out.println("three");
        if (t.intern() == s) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello".intern() == t) System.out.println("five");



        // List, diamand operator, cast Object
        List<String> gorillas = new ArrayList<>();      // type of List<String>
        for (var koko : gorillas)                       // koko is a String type
            System.out.println(koko);

        var monkeys = new ArrayList<>();                // ArrayList<> = Object type
        for( var albert : monkeys);                     // abort is a Object type
            //System.out.println(albert);

        List chimpanzees = new ArrayList<Integer>();
        for (var ham : chimpanzees)
            System.out.println(ham);


        // insert, append
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);


        // Compare Error
        int count = 0;
        String s1 = "java";
        String s2 = "java";
        StringBuilder s3 = new StringBuilder("java");
        if (s1 == s2) count++;
        if (s1.equals(s2)) count++;
        // if (s1 == s3) count++; 
        if (s1.equals(s3)) count++;
        System.out.println(count);



        // mutable, unmutable,
        String roar1 = "roar";
        StringBuilder roar2 = new StringBuilder("roar");
        roar(roar1, roar2);
        System.out.println(roar1 +" " +roar2);



        // 
        var string = "12345";
        var builder = new StringBuilder("12345");
        char e = builder.charAt(4);
        System.out.println(e);

        builder.replace(2,5, "6"); // replace index 2 t/m 5 with "6"
        System.out.println(builder.toString() ); // 126



        String numbers = "012345678";
        System.out.println(numbers.substring(1, 3)); // "12"        from 1 to 3
        System.out.println(numbers.substring(7, 7)); //             no output
        System.out.println(numbers.substring(1));    // "12345678"  everthing after input



       //
       String s11 = "purr";
       String s22 = "";

       s11.toUpperCase();
       s11.trim();
       s11.substring(1, 3);
       s11 += "two";

       s22 += 2;
       s22 += 'c';
       s22 += false;

       if ( s22 == "2cfalse") System.out.println("==");
       if ( s22.equals("2cfalse") )
       System.out.println("equals");
       System.out.println( s11.length());



        // 
        var puzzle = new StringBuilder("Java");
        puzzle.append("vaJ$");
        System.out.println(puzzle.toString() );



        //  multidimensional array
        int[][] scores = new int[5][]; // specify  a size, it is legal to leave out the size for later dimensions of a multidimensional array, the first one is required.
        Object[][][] cubbies = new Object[3][0][5]; // specify  sizes
        java.util.Date[] dates[] = new java.util.Date[2][]; // import 
        



        // Im dying
        List<Integer> list = Arrays.asList(10, 4, -1, 5);
        int[] array = {6, -4, 12, 0, -10 };
        Collections.sort(list);

        Integer converted[] = list.toArray(new Integer[4]);
        System.out.println(converted[0]); // -1
        System.out.println(Arrays.binarySearch(array, 12));


        // 

    }
    
}
