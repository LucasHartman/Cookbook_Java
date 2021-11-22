public class OperatorsExam {

    static long addCandy(double fruit, float vegetables) {
        return (int)(fruit+vegetables);
    }


    public static void main(String[] args) {

        // autocasting, a.k.a Widening Casting
        byte apples = 5;
        short oranges = 10;
        int bananas = apples + oranges;     // apples and oranges are   automatically promoted to int
        long bananas2 = apples + oranges;   //                          automatically promoted to long 
        double bananas3 = apples + oranges; //                          automatically promoted to double



        // Logical operators (^)
        boolean canine=true, wolf=true;
        int teeth = 20;
        canine = (teeth != 10) ^ (wolf=false); // assign false to wofl, ^ is one is true and the other false = true
        System.out.println(canine+", "+teeth+", "+wolf); // true, 20, false



        // casting, a.k.a Narrow Casting
        System.out.print(addCandy(1.4, 2.4f)        + "-");
        System.out.print(addCandy(1.9, (float)4)    + "-");
        System.out.print(addCandy((long)(int)(short)2, (float)4) +"\n");



        // Logical operators, short-circuit, pre-decrement
        int ph=7, vis=2;
        boolean clear = vis > 1 & (vis < 9 || ph < 2); // true & (true || false)   
        // & (if one is true), || (is one is true)
        boolean safe = (vis > 2) && (ph++ > 1); //  && (if both are true)
         // the secon boolean expresion uses the short-circuit operator
        // since (vis > 2) is false, the right side is not evaluated
        boolean tasty = 7 <= --ph; // false
        // pre-decrement operator is applied first, reducing the expresion to 7 <= 6
        System.out.println(clear+"-"+ safe+ "-"+tasty);



        // Wide Casting, Post-Increment
        int pig = (short)4; // wideCast
        pig = pig++; // 4   incremets by 1, but it returns the orinal value of 4 since it is using the post-increment operator
        long goat = (int)2; // wideCast
        goat -=1.0; // 1
        System.out.println(pig +" - " +goat); // 4 - 1



        // ternary expressions
        int a = 2, b = 4, c = 2;
        System.out.println(a > 2 ? --c : b++);              // false, b++ = 4
        System.out.println(b = (a!=c ? a : b++));           // false, b++ = 4
        System.out.println(a > b ? b < c ? b : 2 : 1);      // (2 > 5 ? (5 < 2 ? 5 : 2) : 1)
        // parentheses are not required but lack of parentheses can make ternary expressions difficult to read. 
        // The second ternary expression is never evaluated since 2 > 5 is false, and the expression returns 1



        // autocast promotes, work agenst me 
        short height = 1, weight = 3;
        //short zebra = (byte) weight * (byte) height; // cast to byte, the multiplication operator automatically promotes them to int
        double ox = 1 + height * 2 + weight;
        long giraffe = 1 + 9 % height + 1;
        //System.out.println(zebra);
        System.out.println(ox);
        System.out.println(giraffe);



        // order of operation
        int sample1 = (2 * 4) % 3;      // (8) % 3   8-3-3 =     2
        int sample2 = 3 * 2 % 3;        //           6-3-3 =     0
        int sample3 = 5 * (1 % 2);      //           5 * 1 =     5
        System.out.println(sample1 +"-" +sample2 + "-" +sample3); // 2-0-5



        // 
        boolean sunny = true, raining = false, sunday = true;
        boolean goingToTheStore = sunday & raining ^ sunday;                            // 
        boolean goingToTheZoo = sunday && !raining;
        boolean stayingHome = !(goingToTheStore && goingToTheZoo);
        System.out.println(goingToTheStore + "-" +goingToTheZoo +"-" +stayingHome);




        




    }
    
}
