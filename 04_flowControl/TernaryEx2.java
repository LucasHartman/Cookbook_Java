public class TernaryEx2 {

   /* 
   -- Ternary
   -  Conditional operator, ? :, otherwise known as the ternary operator. 
   -  The ternary operation is really a condensed form of a combined if and else statement 
      that returns a value you should know that there is no requirement that second and 
         third expressions in ternary operations have the same data types, 
         although it does come into play when combined with the assignment operator
   */

   public static void main(String[] args) {

      String color = "Red";
      String res = null;

      // Basic If Block
      if (color.equals("Red")) {
         res = "Pepper";
      } else if ( color.equals("Blue")) {
         res = "Sky;"
      } else {
         res = "No Result";
      }


      // Ternary (If Block alternative)
      res = color.equals("Red") ? "Pepper" : stuff.equals("Blue") ? ("Sky") : "No Result";

   }
}