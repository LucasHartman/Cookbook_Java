public class SwitchEx1 {

    /*
    -- Switch Expression

    - a construct that combines switch statements 
    - with lambda expressions and allows switch statements to return a value
        
    -- Switch statement Supports

    - primitives (int, byte, shot, char
    - wrapper classes Integer, Byte, Short, and Character) 
    - enum and String

    -- Casting

    - only variables and values that can be automatically promoted (in other words, implicitly cast) to an int are acceptable. 
    - You won’t be able to compile if you use anything else, including the remaining numeric types of long, float, and double.

    -- compile-time constant

    - A case constant must evaluate to the same type that the switch expression can use
    - The case constant must be a compile-time constant! 
      case argument has to be resolved at compile time,
    - you can use only a constant or final variable that is immediately initialized
    -  is not enough to be final; it must be a compile-time constant.
    
    -- all-through

    -  If break is omitted, the program just keeps executing the remaining case blocks until either a break is found 

    -- default

    - The defalut case doesn have to come at the end of the switch
    - Default works just like any other case for fall-through
    
    -- Supports
    -   primites:       int, by, short, and char
    -   wrapper class:  Integer, Byte, Short, and Character
    -   enum
    -   String
    -   var (if the type can be resolved)

    -- Not Supported
    -   primites:       long, float, double
    -   wrapper class:  Long, Float, Double
    
    */

    public static void main(String[] args) {
        
        int day = 4; 
        
        //  Switch statement 
        switch (day) { 
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
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
            System.out.println("Dday");
        }


        // Example: compile-time constant
        final int a = 1;
        final int b;

        switch (x) {
            case a:     // ok
            case b:     // compiler error
        }

        // Example: case same value
        int temp = 90;
        switch(temp) {
            case 80:
            case 80:    // won't compile
            case 90:
            default:
        }

        // Example: boxing
        switch( new String("A") ) {
            case "A": System.out.println("boxing is OK");
        }

    }
    
}
