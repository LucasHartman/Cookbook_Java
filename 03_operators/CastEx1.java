public class CastEx1 {

       /* tags: Autocasting, autocast
       
    --  Implicitly Casting | Widen Casting |
    -   Converting lower -> higher data types
    -   Automatically
    -   The conversion between numeric data type to char or Boolean is not done automatically.

         byte -> short -> int -> long -> float -> double


    --  Narrowing Casting | Explicit Casting | 
    -   Converting higher -> lower data types
    -   Manually (by the programmer)
    -   If we do not perform casting the compiler reports a compile-time error.

         double -> float -> long -> int -> short -> byte  

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
