/*
--------------------------------------------------------------------------
--------------------------------------------------------------------------
--------------------------------------------------------------------------
METHOD CHAINING
--------------------------------------------------------------------------
--------------------------------------------------------------------------
LAMBDA
--------------------------------------------------------------------------
--------------------------------------------------------------------------
TIME
--------------------------------------------------------------------------
--------------------------------------------------------------------------
EXCEPTIONS
--------------------------------------------------------------------------

-- Checked Exceptions
-   Checked exceptions are checked at compile-time.
-   it should handle the exception using try-catch block or 
    it should declare the exception using throws keyword.
-   otherwise the program will not compile


    -- Declare the exception - throws keyword
    -   Syntax: myMethod() throws IOException {}
    -   Avoid the compilation error is: 
        Declare the exception in the method using throws keyword.
    -   Throws is a keyword in Java which is used in the signature of method to 
        indicate that this method might throw one of the listed type exceptions.
    -   We can use throws keyword to delegate(NL:afvaardigen) the responsibility 
        of exception handling to the caller
    -   Then caller method is responsible to handle that exception. 
 

    -- Handle - try-catch blocks
    -   try block is used to enclose the code that might throw an exception.
    -   catch block is used to handle the Exception

    -   Object.Throwable.Exception.Checked Exception...
    -   IO              Exception
    -   ClassnotFound   Exception
    -   Socket          Exception
    -   SQL             Exception


-- Unchecked Exceptions
-   An unchecked exception is the one which occurs at the time of execution.
-   These are also called as Runtime Exceptions.
-   Runtime exceptions are ignored at the time of compilation. 
-   This Exception occurs due to bad programming.
-   Unchecked exception are not required to be handled or declared
-   Error are almost impossible to handle
-   Runtime Exceptions can be handled with the try-Catch Block

    -   Object.Throwable.Exception.Runtime Exception...
    -   Null Pointer            Exception
    -   IndexoutofBound         Exception
    -   ArrayIndexOutOfBounds   Exception
    -   IllegalArgument         Exception
    -   Numberformat            Exception
    -   ClassCast               Exception
    -   Object.Throwable.Error...
    -   StackOverflow           Error
    -   OutOfMemory             Error


-- try/catch/final


-- try keyword
-   A try block must include either a catch or finally block, or both
-   A local variable defined in the try block, is not in scope of the catch and final block


-- catch keyword
-   Catch and final blocks must be in the right order, catch first, final second
-   Catch must have a variable type and name, like this: (Exception e)
-   IOException is a subclass of Exception, so it must appear first in any related catch blocks
-   You can catch exceptions with a super type like RuntimeException, but not with a subtype
-- final keyword
-   The finally block is called regardless of whether or not the related catch block is executed.   
-   Finally block can throw an exception, in which case not every line of the finally block would be executed
-   Unlike an if-then statement, which can take a single statement, a finally statement requires brackets {}


--  throws keyword
-   An overridden method must not throw any new or broader checked exceptions than the method it inherits.


-- throw
-   Syntex: throw new ClassCastException();


-- Throw and Handle at execution
    public class Fortress {
      public void openDrawbridge() throws Exception {
         try {
            throw new Exception("Circle");
         } catch (Exception e) {
            System.out.print("Opening!");
         } finally {
            System.out.print("Walls");  // p2
         }
      }
   public static void main(String[] moat) {
      new Fortress().openDrawbridge();  // Exception is thrown but not handled or declared
   }

--------------------------------------------------------------------------
ENCAPSULATION
--------------------------------------------------------------------------

-- Encapsulation
-   Encapsulation is about protecting the data elements.
-   you can access classes in the same package without using import keyword.
-   Example:
    package example;
    public class B{
    public static void main(String[] args){
        A myA = new A();
        }
    }

-- Protected
-   Can be applied to data members, method, and constructor
-   Modifier can't be applied to the top-level classes and interface.
-   Access all members
        1. The current package
        2. Child classes outside the package


-- Private
-   Can be applied to data members, method, and constructor
-   Modifier can't be applied to the top-level classes and interface.
-   Access all members
        1. only from within the class


-- Package (Default)
-   A class, method or variable declare without any access modifier,
    is considered package(default).
-   Access all members:
        1. The current package

--------------------------------------------------------------------------
STATIC
--------------------------------------------------------------------------

-- Static
-   Source: https://www.javatpoint.com/static-keyword-in-java
-   Static is used for memory management mainly
-   We can apply static keyword with
    variables, methods, blocks and nested classes.
-   Static variable gets memory onl once in 
    the class area at the time of class loading.
-   Example:
    class Student {
        String name;                    // instance 
        static String college= "MIT"    // static 
    }

-- Static Method
-   A static method belongs to the class rather than the object of class.
-   A static method can be invoked without the need for creating an instance of the class
    ClassName.staticMethod()
-   A static method can access static data member and can change the value of it.
-   A static method can't non static data member or call non-static method
-   this and super cannot be used in static context.
-   Example:
    static void change() {
        college = "BOSTON"; // change static variable
        name = "Jeff"       // error non-static variable
    }

--  Static vs Instance Method or Block
-   An Instance method, constructor, instance initialization block to all static variables
-   Static methods and static initialization block cannot reference
    instance variables since they are defined across all instances
-   Example:
    public class A {
        public final static long staticVar;
        public final double instVar;
        {   staticVar   = 2; // legal
            instVar     = 8; // legal
        }   
        static {
            staticVar   = 1; // legal
            instVar     = 4; // illegal
        }
    }
        

-- Static Import
-   Source: https://www.geeksforgeeks.org/static-import-java/
-   We can access the static members of a class directly 
    without class name or any object.
-   Example:
    Math.sqrt() 
    sqrt()      // static import

--------------------------------------------------------------------------
Initialization
--------------------------------------------------------------------------

-- Initialization
-   Source: https://www.baeldung.com/java-initialization
-   Declaration:    is the process of defining the variable
    along with its type and name.
-   Example:
    int id;
-   Initialization: assigning a value
-   Example:
    int id = 1;
-   Primitive Type: hold their values in the memory
-   Reference Type: don' t hold the value but refer to it.

-- Instance and class variable
-   don' t us the initialize. As soon as we declare these variable, 
    they are given a default value:
    boolean                 false
    byte,short,int,long     0
    float,double            0.0
    Reference Type          null
    
-- Local Variable
-   Must be initialize before use, they don't have default value


--------------------------------------------------------------------------
Pass By Value & JavaBeans
--------------------------------------------------------------------------


-- Pass By Value
-   Source: https://blog.penjee.com/passing-by-value-vs-by-reference-java-graphical/
-   The term “passing a variable” is used when a function is called 
    with a variable you defined previously:
    int myAge = 14;
    calculateBirthYear(myAge);
    // declare
    int calculateBirthYear(int age) { return age+1; }


-- Pass by Reference
-   Pass by reference means a number (called an address) 
    is passed on which defines where the value is stored.


-- JavaBeans
-   Source: https://www.tutorialspoint.com/jsp/jsp_java_beans.htm
-   specially constructed Java class written in the Java
-   1. It provides a default, no-argument constructor.
-   2. It may have a number of "getter" and "setter" methods for the properties.
-   3. Implements java.io.Serializable
-   Example:
    public class Employee implements java.io.Serializable{  
        private int id;  
        public Employee(){}  
        public void setId(int id){this.id=id;}  
        public int getId(){return id;}  
    }  


--------------------------------------------------------------------------
--------------------------------------------------------------------------

-- Constructors
-    Java only inserts a no-argument constructor if there are no other constructors in the class
-    If a class extends a parent class that does not include a no-argument constructor,
    the default no-argument constructor cannot be automatically inserted into the child class
    by the compiler.

--  No-arg constructor
-   If a parent class does not include a no-argument constructor, a child class can still
    explicitly declare one; it just has to call an appropriate parent constructor with super()


-- static final variable initialization
    private static final String monday;
-   The declaration of monday does not compile, because the value of a static final vari-
    able must be set when it is declared or in a static initialization block.


--  Final variable
-   blank final variable or uninitialized final variable.
-   It can be initialized in the constructor only.
-   The blank final variable can be static also which will be initialized in the static block only.


--  Override Final
-   You can't inherit and override a final method, unless its is hidden(private)


--  Main()
-  The main method can be final
-  Final method can't be overridden
-  We can access final methods in the subclass but we can not override final methods.


-- Variable Scope
-   variable can't be declared inside the loop. 

-- for-each
-   for-each loop is allowed to be used with arrays and ArrayList objects.  
    StringBuilder is not an allowed type for this loop

-- for syntax
    for (int i = 0, j = 0; i < nycTourLoops.length && j < times.length; i++; j++)
-   Multiple update expressions are separated with a comma rather than a semicolon

-- while loop
    String tie = null;
    while (tie == null);   <-----------
       tie = "shoelace";
       System.out.print(tie);
-   the loop body is empty due to the semicolon right after the condition. 
    This means the loop condition keeps running

-- Check for Errors
-   Remember to look for basic errors before wasting time tracking the flow
-   In this case, the label of the loop is trying to use the keyword for. This is not allowed

-- + * operator auto cast
-   The addition + operator automatically promotes all byte and short values to int.
-   The muliplication automatically promotes values to a int

-- Wrapper Classes
-   Source: https://www.w3schools.com/java/java_wrapper_classes.asp
-   Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
-   Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used

-   Wrapper classes can't be casted
-   Example
-   cast primitive:     int auto-cast to a long
    cast wrapper class: Interger object can't auto-cast to a Long Object, because Integer Class is not a subclass of he Long class

- Convert primitive to a wrapper class is automated
-   Example
    Interger var = 5;

- Convert wrapper class to a primitive use methods
-   Example
    Interger myInt = 5;
    myInt.intValue())


--------------------------------------------------------------------------
ARRAY
--------------------------------------------------------------------------

--  Array is an Object
    int[] lowercase = new int[0];
    Integer[] uppercase = new Integer[0];
-   While int is a primitive, all arrays are objects.


--  Sort Array 
    String[] nums = new String[] { "1", "9", "10" };
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums)); // 1, 10, 9
-   we use alphabetical order when sorting. 
    The character 1 sorts before the character 9,


--  Sort Empty Array
    public static void main(String... args) {
        Arrays.sort(args);
        System.out.println(Arrays.toString(args)); // []
        }
-   Since no arguments are passed from the command line, this creates an empty array.
-   Sorting an empty array is valid and results in an empty array.


--  Array Sort & binarySearch
-   The binarySearch() method requires a sorted array in order to return a correct result.
    If the array is not sorted, the results of a binary search are undefined.
-   If the array already is in alphabetical order, you don't need to sort 


-- binarySearch Not Found
    String[] os = new String[] { "Mac", "Linux", "Windows" };
    Arrays.sort(os);
    System.out.println(Arrays.binarySearch(os, "RedHat")); // -3
-   The target string of "RedHat" is not found in the sorted array. 
-   If it was found, it would be between the second and third element. 
-   The rule is to take the negative index of where it would be inserted and subtract 1


-- String[] output
    String[] strings = new String[2];
    System.out.println(strings);                    // [Ljava.lang.String;@74a14482
-   System.out.println(arrays.toString(strings));


-- var args 
-  is not an array
- can't uses array methods like .length


-- Declare boolean Arrays
    boolean[][] bools[], moreBools;
-    the array braces are split up. 
-   This means that bools is a 3D array reference. 
-   The braces both before and after the variable name count. 
-   For moreBools, it is only a 2D array reference because 
-   there are only two pairs of braces next to the type.


--------------------------------------------------------------------------
--------------------------------------------------------------------------

--  equals() vs ==
-   Source: https://www.geeksforgeeks.org/difference-between-and-equals-method-in-java/
-   equals()        method compares     value    (String.eqaults(String)
-   ==              operator compares   object   (Object == Object)
-   Example
    String bob = new String("bob");         new Object
    String notBob = bob;                    reference SAME OBJECT in the heap
    System.out.print((bob==notBob)+" "+(bob.equals(notBob)));   // true true


--  if statement without brackets
    if(true)
        triceratops++;
        triceratops--;
-   triceratops--; is not part of the if statement
-   if-then statement may execute a single statement or use {}


-- nested if-then
    if(flair >= 15 && flair < 37) {         // first if-then
        System.out.print("Not enough");
    } if(flair==37) {                       // Second if-then
        System.out.print("Just right");
    } else {
        System.out.print("Too many");
    }
-   notice that the second if-then statement is not connected to
    the first if-then statement, as there is no else joining them.


--  else statement
-   You can't have two else statement, you dummy


-- Logical Operators (short-circuiting)
-    Source: https://www.geeksforgeeks.org/java-logical-operators-with-examples/
-   perform logical “AND”, “OR” and “NOT” operation
-   similar to AND gate and OR gate in digital electronics. 
-   keep in mind is the SECOND CONDITION IS NOT EVALUATED if the first one is false
-   it has a short-circuiting effect.
-   AND (&&)    if both are true
                if (true && true) {}
-   OR (||)     if one is true
                if (false || true) {}
-   NOT (!)     Unary Operator, returns opposite value
                if (!false) // is true


-- Operator Precedence Table
-   Source: https://cseweb.ucsd.edu/~ricko/CSE11/Java_Operator_Precedence_Table.pdf
--------------------------------------
()           method invocation
[]          array subscript
.           member access/selection
--------------------------------------
++          unary postfix increment
--          unary postfix decrement
--------------------------------------
++          unary prefix increment
--          unary prefix decrement
+           unary plus
-           unary minus
!           unary logical negation
~           unary bitwise complement
( type )    unary cast
new         object creation
--------------------------------------
*           multiplication
/           division
%           modulus (remainder)
--------------------------------------
+           addition or string concatenation
-           subtraction
--------------------------------------
<<          left shift
>>          arithmetic/signed right shift (sign bit duplicated)
>>>         logical/unsigned right shift (zero shifted in)
--------------------------------------
<           less than
<=          less than or equal to
>           greater than
>=          greater than or equal to
instanceof  type comparison
--------------------------------------
==          is equal to (equality)
!=          is not equal to (inequality)
--------------------------------------
&           bitwise AND
            boolean logical AND (no short-circuiting)
^           bitwise exclusive OR        
            boolean logical exclusive OR
|           bitwise inclusive OR
            boolean logical inclusive OR (no short-circuiting)
--------------------------------------
&&          logical/conditional AND (short-circuiting) left-to-right
||          logical/conditional OR (short-circuiting) left-to-right
--------------------------------------
?:          conditional/ternary (if-then-else) right-to-left
--------------------------------------
=           assignment
+=          addition assignment
-=          subtraction assignment
*=          multiplication assignment
/=          division assignment
%=          modulus/remainder assignment
&=          bitwise AND assignment
^=          bitwise exclusive OR assignment
|=          bitwise inclusive OR assignment
<<=         bitwise left shift assignment
>>=         bitwise arithmetic/signed right shift assignment
>>>=        bitwise logical/unsigned right shift assignment


--  The XOR ^ operator 
-   evaluates to:
    - true if x and y differ
    - false if they are the same


--  Implicitly Casting | Wide Casting |
-   Converting lower -> higher data types
-   Automatically
-   The conversion between numeric data type to char or Boolean is not done automatically.

        byte -> short -> int -> long -> float -> double


--  Narrowing Casting | Explicit Casting | 
-   Converting higher -> lower data types
-   Manually (by the programmer)
-   If we do not perform casting the compiler reports a compilation error.

        double -> float -> long -> int -> short -> byte 


--  divide
-   The subtraction - operator is used to find the difference between two numbers


--  Ternary operations
    distance < 1000 ? "train" : 10;
-   Ternary operations require both right-hand expressions to be of compatible data types.


--------------------------------------------------------------------------
--------------------------------------------------------------------------

--  final class
-   Sub class does not compile because it extends the Parent class, which is
    marked final and therefore, cannot be extended


--  VirTual Method
-   Only non-static, non-final, and non-private methods are considered 
    virtual and capable of being overridden in a subclass.


--  Object type, Reference type
-   Object type relates to the attributes of the object that exist in memory, 
-   Reference type dictates how the object is able to be used by the caller.


--  Default interface method
-   They allow us to add new methods to an interface that are 
    automatically available in the implementations.
-   Default methods are implicitly(NL:onvolwaardig) public
-   There's no need to specify the public modifier.
-   We declare them with a default keyword


--  variable declaration
    double num1, int num2=0;    // illegal
    double num1; int num2=0;    // legal
-   Java does not allow declaring different types as part of the same declaration.


--  new keyword
-   The new keyword is used to call the constructor for a class and 
    instantiate an instance of the class. 


--  order of elements in a class
-   The instance variables, constructor, 
    and method names can appear in any order within a class declaration


-- local variable
-   Local variables do not have a default initialization value.
-   Example:
    public static void main(String[] args) {
        defaultValue;                               // Error local variable is not initialized
        System.out.println(defaultValue);
    }


-- finalize() Method
-   Finalize() is the method of Object class. 
-   This method is called just before an object is garbage collected
-   The main purpose of a finalizer is, however, to release resources 
    used by objects before they're removed from the memory.
-   A finalizer can work as the primary mechanism for clean-up operations, 
    or as a safety net when other methods fail.


--  Garbage Collection
-   While you can suggest to the JVM that it might want to run a garbage collection cycle,
    the JVM is free to ignore your suggestion


-- Wrapper classes
    1_000_000_.00
-   Illegal underscore before the decimal point
-   Java will automatically convert from primitive to wrapper class types and vice versa. 


--  Instance Method
    int i = new Integer(4);               // int type (no a Integer)
    System.out.print(i.byteValue());      // converts the given number(wrapper class) into a primitive byte 
-   does not allow calling an instance method on a primitive. 


--  parseInt() vs valueOf()
    int val1        = Integer.parseInt("5");
    Integer val2    = Interger.valueOf("5");
-   The parseInt() methods  input String,               return a primitive
-   The valueOf() methods   input Primitive or String,  return a wrapper class object.


--  OOP
-   object-oriented project tends to group data and the actions 
    related to that data into a single object.
-   Object-oriented programming is the technique of structuring data into objects, which may
    contain data and a set of actions that operate on the data


--  Byte Code vs Machine Code
-   Byte code:      Java bytecode file is a binary encoded set of instructions designed to be run on any
                    computer with a compatible JVM
-   Machine code:   Machine code is a set of instructions that is directly machine-understandable 
                    and it is processed by the Central Processing Unit (CPU). 


--  Order Of Execution
    1 abstract static block
    2 class static block
    3 abstract instance block
    4 class instance block
    5 class constructor


--  Static Override
-   A static method cannot override a non-static method and vice versa.


--  Hidden
-  A Child Class that defines an instance variable with the same name 
   as a variable in the Parent class is referred to as hidden.
-  A Child Class that defines a static method with the same signature as 
   as a static method in a Parent Class is referred to as hiding a method


--  Hidden Method
-   private final String doStuff() { return "stuffff"; }
-   The doStuff() method in the Subclass, does not override the version in the parentClass, 
    since the method is not visible to the parent class.

    
--  Abstract method
-   Only interfaces and abstract classes can include abstract methods.


*/