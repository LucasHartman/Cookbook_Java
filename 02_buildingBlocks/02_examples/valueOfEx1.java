/*
--  parseInt()
-   primitive data type of a certain String


--  valueOf()
-   The valueOf method returns the relevant Number Object
*/

class valueOfEx1 {

    public static void main(String[] args) {

        int xx =Integer.parseInt("9");          // 9
        double cc = Double.parseDouble("5");    // 5.0
        int bb = Integer.parseInt("444",16);    // 1092
  
        System.out.println(xx); // String -> int
        System.out.println(cc); // String -> double
        System.out.println(bb); // String, int -> int

        

        Integer x =Integer.valueOf(9);          // 9
        Double c = Double.valueOf(5);           // 5.0
        Float a = Float.valueOf("80");          // 80.0 
        Integer b = Integer.valueOf("444",16);  // 1092

        System.out.println(x); // int -> Integer
        System.out.println(c); // int -> Double
        System.out.println(a); // String -> Float
        System.out.println(b); // String,int -> Integer

    }
}