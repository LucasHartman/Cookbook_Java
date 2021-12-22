public class TernaryEx2 {

   /* 
   -- Ternary

   Conditional operator, ? :, otherwise known as the ternary operator. 
   The ternary operation is really a condensed form of a combined if and else statement 
   that returns a value you should know that there is no requirement that second and 
   third expressions in ternary operations have the same data types, 
   although it does come into play when combined with the assignment operator
   
   */

   public static void main(String[] args) {

      int x = 100;
      int a = x++;
      int b = ++x;
      int c = x++;
      int d = (a<b) ? (a<c) ? a : (b<c) ? b : c; // ???

      System.out.println(d);

   }
}