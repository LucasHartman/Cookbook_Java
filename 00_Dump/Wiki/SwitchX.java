/*
-- Permitted variable types
-   primitives:     byte, short, int, long
-   Wrapper classes Character, Byte, Short, Integer, Long, 
-   String
-   Enum

-- NOT-permitted
-   floating-point:  float, double
-   Wrapper class:   Float, Double
-   Object class
*/

public class SwitchX {
    public static void main(String[] args) {

    final byte myByte = 1;
    final long myLong = 2;
    final char myChar = 'a';
    final String myString = "fish";

    int day = 4; 
        
    //  Switch statement 
    switch (day) { 
        case myByte:
            System.out.println("Monday");
            break;
        case (int)myLong:
            System.out.println("Tuesday");
            break;
        case myChar:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("D-day");
        }
    }
    
}
