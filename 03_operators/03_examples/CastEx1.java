public class CastEx1 {

       /*
    --  Implicitlye Casting | Widing Casting |  Casting Down
    -   Converting a lower data type into a higher one is called widening type casting. 
    -   It is done automatically. 
    -   The conversion between numeric data type to char or Boolean is not done automatically.

         byte -> short -> int -> long -> float -> double


    --  Narrowing Casting | Explicit Easting | Casting Up
    -   Converting a highter data type into a lower one is called narrowing type casting.
    -   It is done manually by the programmer. 
    -   If we do not perfrom casting the compiler reports a compiletime error.

         double -> float -> long -> int -> short -> byte  

    
    --  Unary operation (Typecasting)
    -   The process of converting one type of object and variable into 
        another type is refered to as Typecasting
    -   compiler automatically casts smaller data types to larger ones
    -   casting can also be applied to objects and references
   */

    public static void main(String[] args) {


        byte byte1 =    127;

        short short1 =  32,767;

        int int1 =      2,147,483,647;

        long long1 =    9,223,372,036,854,775,807L; 

        float float1 =  3.4E38f;

        double dbl1 =   1.7E308;

        
        short height = 1, weight = 3;
        short zebra = (byte) weight * (byte) height; // Error
        
        // multiplication operator automatically promotes them to int
        // int does not store in a short type value
        System.out.println(zebra);
    }
    
}
