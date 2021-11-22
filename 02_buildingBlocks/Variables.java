/**
 * Instance Variable:
 * - It's possible to read and write instance variables directly from the caller.
 * - 
 * 
 * 
 * Instance Initializer Blocks
 * - code blocks appear outside a method. These are called instance initializers. 
 * 
 * Primitive Type
 * - All of the numeric types are signed in Java. This means that they reserve one of their bits to cover a negative range. For example, byte ranges from -128 to 127. 
 * 
 * Literals
 * - Any constant value which can be assigned to the variable is called as literal/constant. 
 * - we can specify literals in 4 ways:
 *      - Decimal literals (Base 10) : In this form the allowed digits are 0-9
 *      - Octal literals (Base 8) : In this form the allowed digits are 0-7.  The octal number should be prefix with 0.
 *      - Hexa-decimal literals (Base 16)
 *      - Binary (digitals 0-1)
 * 
 * Literals and the Underscore Character
 * - You can add underscores anywhere except:
 * -        beginning of a literal, 
 * -        end of a literal, 
 * -        right before a decimal point, 
 * -        right after a decimal point. 
 * 
 * Identifying Identifiers
 * - An identifier is the name of a variable, method, class, interface, or package
 * - the rules for identifiers for variables apply to all of the other types that you are free to name.
 * There are only four rules to remember for legal identifiers:
 * 1 Identifiers must begin with a letter, a $ symbol, or a _ symbol.
 * 2 Identifiers can include numbers but not start with them.
 * 3 Since Java 9, a single underscore _ is not allowed as an identifier.
 * 4 You cannot use the same name as a Java reserved word. A
 *   reserved word is special word that Java has held aside so that you
 *   are not allowed to use it. Remember that Java is case sensitive, so
 *   you can use versions of the keywords that only differ in case.
 *   Please don’t, though
 * 
 * Multipel Variables
 * - You can declare many variables in the same declaration 
 * - long as they are all of the same type
 * - 
 * 
 * local Variable
 * variable defined within a construcotr, method, or initializer block
 * local variable do not have a default value and must be initialized befor use
 * 
 * Instance Variable
 * - An instance variable, often called a field, 
 * - is a value defined within a specific instance of an object.
 * 
 * var
 * 1.  A var is used as a local variable in a constructor, method, or initializer block.
 * 2.  A var cannot be used in constructor parameters, method parameters, instance variables, or class variables.
 * 3.  A var is always initialized on the same line (or statement) where it is declared.
 * 4.  The value of a var can change, but the type cannot.
 * 5.  A var cannot be initialized with a null value without a type.
 * 6.  A var is not permitted in a multiple-variable declaration.
 * 7.  A var is a reserved type name but not a reserved word, meaning it can be used as an identifier except as a class, interface, or enum name.
 * 
 * Scope 
 * - scope local to the method. This means they cannot be used outside of where they are defined.
 * - the rule for instance variables is easier: they are available as soon as they are defined and last for the entire lifetime of the object itself. 
 * 1. Local variables: In scope from declaration to end of block
 * 2. Instance variables: In scope from declaration until object eligible for garbage collection
 * 3. Class variables: In scope from declaration until program ends
 *  
 * 
 * garbage collection
 * - All Java objects are stored in your program memory’s heap
 * - Garbage collection refers to the process of automatically freeing memory on the heap by deleting objects that are no longer reachable in your program. 
 * - 
 * 
 * 
 */


public class Variables {

    // Instance Variable
    int instanceVariable;

    // Primitive Type
    boolean bVar = true; 
    byte byVar = 123;       // 8-bit
    short sVar = 123;       // 16-bit       signed, which means it splits its range across the positive and negative integers.   
    int iVar = 123;         // 32-bit
    long lVar = 123L;       // 64-bit
    float fVar = 123.45f;   // 32-bit        floating-point (decimal)
    double dVar = 123.456;  // 64-bit        floating-point (decimal)
    char cVar = 'a';        // 16-bit        unsigned, which means range is strictly positive including 0.

    // Signed and Unsigned: short and char
    short bird = 'd';        // Prints 100
    char mammal = (short)83; // Prinst S

    // literals
    int decimalLiteral = 101;
    int octalLiteral = 0146; 
    int hexaLiteral = 0X123Face; 
    int binaryLiteral = 0b1111;

    // Literals and the Underscore Character
    int million = 1_000_000;
    double reallyUgly = 1__________2;

    // Identifiers
    int $var = 2;
    int _var = 3;
    int var69 = 4;

    // Multiple Variables
    String s1, s2;
    String s3 = "yes", s4 = "no";
    int i1, i2, i3 = 0;
    int p1; int p2;

    // Default Initialization
    boolean a1; // false
    byte a2;    // 0
    short a3;   //0
    int a4;     // 0
    long a5;    // 0
    float a6;   // 0.0
    double a7;  // 0.0
    char a8;    // '/u0000' (NUL)
    // Object reference     // null

    // var
    public void whatType() {
        var name = "Hello";
        var size = 7;
        var var = "var"; // legal
    }


    // Variable Scope
    public void eat(int piecesOfCheese) { // variable 1
        int bitesOfCheese = 1;  // variable 2
        // the scope of both variables is inside the method
     }

     // Nest Scope
     public void eatIfHungry(boolean hungry) {
            if (hungry) { // smaller contained block
               int bitesOfCheese = 1;
               {
                  var teenyBit = true;
                  System.out.println(bitesOfCheese);
               }
            }
         }

    

    





    public static void main(String[] args) {

        Variables obj = new Variables();
        obj.instanceVariable = 1;

        { System.out.println("Instance Initializer Blocks"); }

        System.gc(); // JVM kick off garbage collection



        

    }
    
}
