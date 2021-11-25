public class Casting {

   /*

   -- Unary operation (Typecasting)

      - The process of converting one type of object and variable into 
      another type is refered to as Typecasting
      - compiler automatically casts smaller data types to larger ones
      - casting can also be applied to objects and references

   -- Implicitlye type casting or widing casting

      The conversion involves a smaller data type to the larger type size.
      Example: 
      
         byte -> short, char, int, long, float and double

   -- Explicit type casting or Narrowing type casting

      Converting a highter data type into a lower one is called narrowing type casting.
      It is done manually by the programmer. If we do not perfrom casting
      The compiler reports a compiltime error.

         double -> float -> long -> int -> char -> short -> byte  

         Example:       long l = (long)d;

   */

   public static void main(String[] args) {
      

      // Widening Casting (automatically) - 
      // converting a smaller type to a larger type size
      byte byteVar = 1;
      short shortVar    = byteVar; // Automatic casting: byte to short
      int intVar        = shortVar;
      long longVar      = intVar;
      float floatVar    = longVar;
      double doubleVar  = floatVar;


      // Narrowing casting 
      // must be done manually by placing the type in parentheses in front of the value:
      double doubleNar = 1.0;
      float floatNar    = (float) doubleNar;
      long longNar      = (long) floatNar;
      int intNar        = (int) longNar;
      short shortNar    = (short) intNar;
      byte byteNar      = (byte) shortNar;


      // Odd examples
      String type    = (String) "Bird";       // cast String to String
      short tail     = (short)(4 + 10);       // cast an formula

      long wolf = 5;
      long coyote = (wolf=3);             // assign new value in vairable
      System.out.println(wolf); // 3
      System.out.println(coyote); // 3


      // More then one way
      long ear = 10;
      
      int  h1 = 2 * (int) ear;         // cast to int
      int  h2 = 2 * (short) ear;       // cast to short
      int  h3 = (int)(2 * ear);        // cast forumula
      long h4 = 2 * ear;               // replace int to long


      // Compile Error
      double fruit = 1.3;
      float vegetables = 1.4f;
      //int sum = (int)fuirt + vegetables; // vegetables is not casted to int

   }
}