/*
--  Implicit Casting (Widening)
-   Converting lower -> higher data types
-   Automatically
-   The conversion between numeric data type to char or Boolean is not done automatically.
-   The compiler will broaden the data type on a numeric value until it finds a compatible signature. 


        byte -> short -> int -> long -> float -> double


--  Explicit Casting (Narrowing)
-   Converting higher -> lower data types
-   Manually (by the programmer)
-   If we do not perform casting the compiler reports a compile-time error.

        double -> float -> long -> int -> short -> byte  
*/

public class Casting {
    public static void main(String[] args) {
        
         // UpCasting, WideCasting (AutoCasting)
         shortVal = byteVal;
         intVal = shortVal;
         longVal = intVal;
         floatVal = longVal;
         doubleVal = floatVal;
 
         // DownCasting, NarrowCasting
         byteVal = (byte)shortVal;
         shortVal = (short)intVal;
         intVal = (int)longVal;
         longVal = (long)floatVal;
         floatVal = (float)doubleVal;
 
         // Operator auto promote
         intVal = shortVal+byteVal;
         intVal = (int)longVal + (int)floatVal; // Wider Data types can't be automatically converted
         intVal = ShortVal + ByteVal; // Wrapper Classes are converted to primitive and operator converts them to int
         intVal = (int)(long)LongVal + (int)(float)FloatVal; // Wrapper casted to primitive & primitive  DownCasted to int
    }
    
}
