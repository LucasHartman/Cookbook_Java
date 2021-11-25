public class SwitchEx1 {

    /*
    Switch Expressions, a construct that combines switch statements 
    with lambda expressions and allows switch statements to return a value
        
    Switch statement Supports:
    - primitives (int, byte, shot, char
    - wrapper classes Integer, Byte, Short, and Character) 

    */

    public static void main(String[] args) {
        
        int day = 4; 
        
        //  Switch statement 
        switch (day) { 
        /* Switch statement Supports:
        - primitives (int, byte, shot, char
        - wrapper classes Integer, Byte, Short, and Character)  */

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
        }

    }
    
}
