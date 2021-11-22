public class opTernary {
   public static void main(String[] args) {
        /** Conditional operator, ? :, otherwise known as the ternary operator. 
        The ternary operation is really a condensed form of a combined if and else statement 
        that returns a value you should know that there is no requirement that second and 
        third expressions in ternary operations have the same data types, 
        although it does come into play when combined with the assignment operator
        */

        int owl = 5;
        int food = owl < 2 ? 3 : 4;
        System.out.println(food); // 4    

   }
}