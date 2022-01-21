
/*

21/02 ---------------------------------------------------------------------------------------------------

--  Object Array
    int[] lowercase = new int[0];
    Integer[] uppercase = new Integer[0];
-   While int is a primitive, all arrays are objects.


--  Sort type String
    tring[] nums = new String[] { "1", "9", "10" };
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums)); // 1, 10, 9
-   we use alphabetical order when sorting. The character 1 sorts before the character 9,


--  array initializer
    float[] lion = new float[]/     LEGGAL
    float[] tiger = new float[1];   ILLEGAL
-   You are not allowed to specify the size separately.
-   The size is inferred from the number of elements listed.


--  Array Sort and Search
-   The binarySearch() method requires a sorted array in order to return a correct result.
    If the array is not sorted, the results of a binary search are undefined.
-   If the array alrady is in alphabatical order, you don't need to sort 


--  2 3D arrays
    boolean[][][] bools, moreBools;

-- String[] output
    String[] strings = new String[2];
    System.out.println(strings);
-   [Ljava.lang.String;@74a14482

-- var args 
-  is not an array
- cant uses method like .length


-- 
    String[] os = new String[] { "Mac", "Linux", "Windows" };
    Arrays.sort(os);
    System.out.println(Arrays.binarySearch(os, "RedHat")); // -3
-   The target string of "RedHat" is not found in the sorted array. 
-   If it was found, it would be between the second and third element. 
-   The rule is to take the negative index of where it would be inserted and subtract 1


--
    boolean[][] bools[], moreBools;
-    the array braces are split up. 
-   This means that bools is a 3D array reference. 
-   The braces both before and after the variable name count. 
-   For moreBools, it is only a 2D array reference because 
-   there are only two pairs of braces next to the type.

--  no input
    public static void main(String... args) {
        Arrays.sort(args);
        System.out.println(Arrays.toString(args)); // []
        }
-   Since no arguments are passed from the command line, this creates an empty array.
-   Sorting an empty array is valid and results in an empty array.


20/01 ---------------------------------------------------------------------------------------------------

CHAPTER 3

--  equals()
-   equivalent value    ("String" "String")


--  ==
-   equivalent object   (new)


--  else statement
-   You can't have two else statement, dummy


 -- logical operators (short-circuit) 
 -  only takes boolean ( true && true )


--  if sta-then
    if(pterodactyl % 3 >= 1)
        triceratops++;
        triceratops--;
-   triceratops--; is not part of the if statement
-   if-then statement may execute a single statement or a block of code {}

    if(flair >= 15 && flair < 37) {
        System.out.print("Not enough");
    } if(flair==37) {                       // Second if-then
        System.out.print("Just right");
    } else {
        System.out.print("Too many");
    }
-   notice that the second if-then statement is not connected to
    the first if-then statement, as there is no else joining them.


--  order expression
    3+2*(2+3)       () first
    3+2*5           * first
    3+10 = 13


--  implicit typecasting, wide (automatically )
-   conversion involves a smaller data type to the larger type size


--  divide
-   The subtraction - operator is used to find the difference between two numbers


--  Ternary operations
    distance<1000 ? "train" : 10;
-   Ternary operations require both right-hand expressions to be of compatible data types.


--  == vs equals
    String bob = new String("bob");         new Object
    String notBob = bob;                    reference SAME OBJECT in the heap
    System.out.print((bob==notBob)+" "+(bob.equals(notBob)));   // true true
-   ==          Same Object
-   equals()    Same Value


--  order of operation
    12 + 6 * 3 % (1 + 1)   
-   12 + 6 * 3 % 2       parentheses first
-   12 + 18 % 2          * and  % have the same operator precedence
-   12 + 0
-   12


--  The XOR ^ operator 
-   evaluates to true if x and y differ and false if they are the same.






18/01 ---------------------------------------------------------------------------------------------------

CHAPTER 02

--  variable declaration
    double num1, int num2 = 0;
-    Java does not allow declaring different types as part
    of the same declaration.

--  non-primitive
-   Instance variables have a default value based on the type. For any non-primitive, 
    including String, that type is a reference to null.

--  new keyword
-   The new keyword is used to call the constructor for a class and 
    instantiate an instance of the class. 

--  order of elemtns in a class
-   The instance variables, constructor, 
    and method names can appear in any order within a class declaration

-- local variable
    public static void main(String[] args) {
    defaultValue;                               // Error local variable is not initialized
    System.out.println(defaultValue);
    }
-   Local variables do not have a default initialization value.

--  finalize()
-   The finalize() method may not be called, such as if your program crashes. However,
    it is guaranteed to be called no more than once.

-- Wrapper classes
    1_000_000_.00
-   Illegal uderscore before the decimal point
-   Java will automatically convert from primitive to wrapper class types and vice versa. 

--  Instance Method
    int i = new Integer(4);
    System.out.print(i.byteValue());
-   does not allow calling an instance method on a primitive. 

--  Garbage Collection
-   While you can suggest to the JVM that it might want to run a garbage collection cycle,
    the JVM is free to ignore your suggestion

--  parseInt() vs valueOf()
    int first       = Integer.parseInt("5");
    Integer second  = Interger.valueOf("5");
-   The parseInt() methods String return a primitive
-   The valueOf() methods Primitive or String return a wrapper class object.

17/01 ---------------------------------------------------------------------------------------------------

CHAPTER 01

--  Main()
-   Note that the modifier final is optional and may be added to an entry point method
-   The main() method is static and does not have access to any class instance variables. 

--  Package
    4: private Date rob = new Date();
    5: private java.util.Date sharon = new java.util.Date();
-   Line 4 will not compile because the Date class used is ambiguous
-   The java command uses a period (.) to separate packages

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

--  scope
-   Variable declared in a if-statement can't be referecne outside
-    While using an instance reference to access a static variable
    is not recommended, it does not prevent the variable from being read. 
-   Class variable, are always in scope for the entire program



14/01 ---------------------------------------------------------------------------------------------------

--  Hidden Method
-   private final String doStuff() { return "stuffff"; }
-   The doStuff() method in the sub class does not override the version in the parent
    class since the method is not visible to the parent class.

--  Override Final
-   You can't inherit and override a final method, unless its is hidden(private)



13/01 ---------------------------------------------------------------------------------------------------

--  final class
-   Sub class does not compile because it extends the Parent class, which is
    marked final and therefore, cannot be extended

--  Virual Method
-   Only non-static, non-final, and non-private methods are considered 
    virtual and capable of being overridden in a subclass.

--  Variable 
-   Java allows methods to be overridden, but not variables.
-   marking them final does not prevent them from being reimplemented in a subclass.
-   polymorphism does not apply in the same way it would to methods as it does to variables.

-- Method Override
-   Overridden methods must have covariant return types, 
    which may not be exactly the same as the type in the parent class.
-   The rule for overriding a method with exceptions is that the subclass 
    cannot throw any new or broader checked exceptions.

--  no-arg constructor
-   If a parent class does not include a no-argument constructor, a child class can still
    explicitly declare one; it just has to call an appropriate parent constructor with super()

--  Object type, Rerence type
-   The object type relates to the attributes of the object that exist in memory, while the
    reference type dictates how the object is able to be used by the caller.

--  default interface method
-   adding default interface methods to Java was for backward compatibility. 
    These methods allow developers to update older classes with a newer
    version of an interface without breaking functionality in the existing classes


11/01 ----------------------------------------------------------------------------------------------------

--  Final variable
-   blank final variable or uninitialized final variable.
-   It can be initialized in the constructor only.
-   The blank final variable can be static also which will be initialized in the static block only.

--  Order Of Excution
    1 abstract static block
    2 class static block
    3 abstract instance block
    4 class instance block
    5 class constructor

--  Hidden
-    A class that defines an instance variable with the same name as a variable
    in the parent class is referred to as hidden
-   static method with the same signature as a static method in a parent class is
    referred to as hiding a method

--  Static Override
-   A static method cannot override a non-static method and vice versa.

--  Abstract method
-   Only interfaces and abstract classes can include abstract methods.

--  Object Casting
-   A class can trivially be assigned to a "Superclass Reference Variable" but requires an explicit
    cast to be assigned to a "subclass reference variable"
*/