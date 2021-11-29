import javax.swing.JButton;

public class Operands {
    
    /*
    -- Operands
    
    - Java operators produce new values from one or more operands.
    - operands a-re the things on the right or left side of the operator
    - The result of most operations is either a boolean or numeric value.


    -- Assignment Operators (=)

    - When assigning a value to a primitive, size matter.
    Be sure you know when impicit casting (widing casting will occur, 
    when explicit casting (Narrow casting) is necessary, 
    and when truncation (trim digits) might occur.


    -- Truncation

      - To trim some digits of a float or double-type
      - Or some character of a string from the right
      - Remember that after truncation, the number will not be round to its nearest value.


    -- Compound Assignment Operators (+=, -=,*=, /=)


    -- Relational Operators (<, <=, >, >=, ==, !=)

    - Relational operators always result in a boolean (true or false).
    - This boolean value is most often used in a if condision
    -   >     Greater than
    -   >=    Greater than or equal to
    -   <     Less than
    -   <=    Less than or equal to


    -- "Equality" Operators

    - Relational operators (sometimes called "equality operators")
    - Compare two similar "thinkgs" an return a boolan
    -   ==     Equal
    -   !=     Not equal
    - Each individual comparison can involve two numbers (including char).
    - You can't compare incompatible types
    - There are fou different types of things that can be tested:
        - Numbers
        - Characters
        - Boolean primitives
        - Object reference variable (Object var;)
    - The == looks at the bit pattern.
    - If a floating-point number is compared with an integer and the values are the same,
      == operators usually returns true as expected


    --Equality for Strings and java.lang.Object.equals()

    - Every class in Java inherits a method from class Ojbect.
    - including the equals() method
    - The equals() method is used to determing if two object of the same class are "meaningfully equivalent"
    - You have the option of overriding the equals() method that you class inherited from class object
    and creating your own definaiton


    -- The equals() Method in Class Object

    - The equals() method in class Object works the same way as the == operator works.
    - If to references point to the same object, the equals() method will return true.


    -- The equals() Method in Class String

    - When the equals() method is used to compare two strings, 
      it will return true if the strins have the same value


    -- instanceof Comparison

    - The instanceof operator is used for object refernce variables only
    - You can use it to check whether an object is of a particluar type
    - By "type" we mean class or interface type

      if ( ChildClass instanceof  ParentClass) {}

    
    -- Arithmetic Operators

    -   +   addition
    -   -   subtraction
    -   *   multiplication
    -   /   division


    -- Remainder (%) Operator

      - The remainder operator divides the left operand by the right operand,
        and the result is the remainder


    -- String Concatenation Operator

      - Concatenate two strings together


    -- Increment and Decrement Operators

      -   ++    Increment (prefix and postfix)
      -   --    Decrement (prefix and postfix)
      - The operator is place either before (prefix) or after (postfix)
      
    */


    public static void main(String[] args) {
        

        // + operators
        int x = 10 + 10; // 20
        String y = "fish" + "stick"; // fishstick

        // Compound Assignment
        x  = x + 2 * 5; // withoud compound Assignment
        x +=     2 * 5; // with compound Assignmnet

        // Relational Operators
        int xx = 8;
        if ( xx < 9 ) { // true
            // do somthing
        }

        boolean b = 100 > 99; // true

        boolean c = 'c' > 'd'; // false

        // Equality for Refernce Varialbes
        JButton a = new JButton("Exit");
        JButton n = new JButton("Exit");
        JButton g = a;
        Boolean z = a == n; // false
        Boolean r = a == g; // true

        // equals() Method in Class String
        String s1 = "Bob";
        String s2 = "Bob";
        Boolean fg = s1.equals(s2); // true

        // Arithmetic Operators
        int q = 5 * 3;

        // Remainder (%) Operator
        int w = 15 % 4; // 3

        // String Concatenation Operator
        String animal = "Gray " + "elephant";













    }
}