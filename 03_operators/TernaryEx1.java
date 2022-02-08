
/*
-- Ternary
-  Conditional operator, ? :, otherwise known as the Ternary operator. 
-  The ternary operation is really a condensed form of a combined if and else statement 
   that returns a value you should know that there is no requirement that second and 
-  third expressions in ternary operations have the same data types, 
   although it does come into play when combined with the assignment operator


--  Same type
    distance < 1000 ? "train" : 10;
-   Ternary operations require both right-hand expressions to be of compatible data types.
*/
  
   public class TernaryEx1 {
   public static void main(String[] args) {

        int owl = 5;
        int food = (owl < 2) ? 3 : 4;
        System.out.println(food); // 4   
        
        
        int numOfPets = 3;
        String status = (numOfPets <4 ) ? "yes" : "no";
        System.out.println(status); // yes
   }
}