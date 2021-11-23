/*
--Typecasting

- The process of converting one type of object and variable into 
  another type is refered to as Typecasting

-- Implicitlye type casting or widing casting

The conversion involves a samller data type to the larger type size.
Example: byte -> short, char, int, long, float and double

-- Explicit type casting or Narrowing type casting

Converting a highter data type into a lower one is called narrowing type casting.
It is done manually by the programmer. If we do not perfrom casting
The compiler reports a compiltime error.

double -> float -> long -> int -> char -> short -> byte  

Example:       long l = (long)d;
*/

public class castingValue {
   /** Casting is a unary operation where one data type is explicitly interpreted as another data type.
        it is convenient that the compiler automatically casts smaller data types to larger ones
        casting can also be applied to objects and references */
   public static void main(String[] args) {
      

      // Widening Casting (automatically) - 
      // converting a smaller type to a larger type size
      byte byteVar   = 1;
      short shortVar = byteVar; // Automatic casting: byte to short
      int intVar = shortVar;
      long longVar = intVar;
      float floatVar = longVar;
      double doubleVar = floatVar;

      System.out.println(byteVar);
      System.out.println(shortVar);
      System.out.println(intVar);
      System.out.println(longVar);
      System.out.println(floatVar);
      System.out.println(doubleVar);

      System.out.println();

      // Narrowing casting 
      // must be done manually by placing the type in parentheses in front of the value:
      double doubleNar = 1.0;
      float floatNar =  (float) doubleNar;
      long longNar =    (long) floatNar;
      int intNar =      (int) longNar;
      short shortNar =  (short) intNar;
      byte byteNar =    (byte) shortNar;

      System.out.println(doubleNar);
      System.out.println(floatNar);
      System.out.println(longNar);
      System.out.println(intNar);
      System.out.println(shortNar);
      System.out.println(byteNar);

      System.out.println();


      // Odd examples
      String type = (String) "Bird";      // cast String to String
      short tail = (short)(4 + 10);       // cast an formula

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