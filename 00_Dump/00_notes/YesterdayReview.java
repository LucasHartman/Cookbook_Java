
/*


--  diamond operator
List (P) balloon = new ArrayLIst (Q);
-   <> can be inserted at position Q without making any other changes.


import java.util.function.*;
public class Card {
   public static void main(String[] s) {
      Predicate<String> pred = (BLANK) -> true;
   }
}
- (String s) is wrong the main arguments is already s
- (Object o) can be put into the BLANK
 
-- Time
-   LocalDate only includes the date portion and not the time portion. 
-   LocalDateTime and LocalTime, both include the time elements

--  Lambda
-   When you’re using brackets, both the return keyword 
    and semicolon are needed for the lambda to compile

-- Date
    LocalDate xmas = LocalDate.of(2016,  12,  25);
    xmas.plusDays(-1);
    System.out.println(xmas.getDayOfMonth());
-   Java 8 date and time classes are immutable. The plusDays method returns a LocalDate 
object presenting Christmas Eve (December 24th). However, this return value is ignored. 
The xmas variable still represents the original value

--  delete method
1:   public class Legos {
2:      public static void main(String[] args) {
3:         StringBuilder sb = new StringBuilder();
4:         sb.append("red");
5:         sb.deleteCharAt(0);
6:         sb.delete(1, 2);
7:         System.out.println(sb);
8:      }
9:   }
-   Line 3 creates an empty StringBuilder. Line 4 adds three characters to it. Line 5 
    removes the first character, resulting in ed. Line 6 deletes the characters starting at position 
    1 and ending right before position 2, which removes the character at index 1, which is d. 
    The only character left is e


Predicate clear = c -> c.equals("clear");
System.out.println(clear.test("pink"));
-   While it is common for a Predicate to have a generic type, it is not required. When 
the generic is omitted, it is treated like a Predicate of type Object. Since the equals() 
method exists on Object, this is fine. Option B is correct because the Predicate tests as 
false

Period period1 = Period.ofWeeks(1).ofDays(3);
Period period2 = Period.ofDays(10);
-    Be careful here. The Period class uses a static helper method to return the period. It 
does not chain method calls, so period1 only represents three days. Since three days is less 
than 10 days, period2 is larger




import java.time.*;
import java.time.format.*;
 
public class HowLong {
   public static void main(String[] args) {
      LocalDate newYears = LocalDate.of(2017, 1, 1);
      Period period = Period.ofDays(1);
      DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
      System.out.print(format.format(newYears.minus(period)));
   }
}
-    The code starts by correctly creating a date representing January 1, 2017, and a period 
representing one day. It then explicitly defines the format as month followed by day  
followed by year. Finally, the code subtracts a day, giving us the formatted version of 
December 31, 2016




String happy = " :) - (: ";
String really = happy.trim();
String question = ;
System.out.println(really.equals(question));
-   The  trim() method returns a String with all leading and trailing white space removed. 
In this question, that’s the seven-character String: ":) - (:". Options A and B are 
incorrect because they do not remove the first blank space in happy. Option D is incorrect 
because it does not remove the last character in happy


-- Period
-   The  Period class creates immutable objects and is usually used to add/subtract from a 
LocalDate or LocalDateTime object. It allows creating date, week, month, or year periods. 
Since it cannot be used for time

subString() learn more

Different methods between StringBuilder, String, ArrayList, Array, learn more

--  LocalTime
-   minusNanos and plusNanos are the smallest units available



import java.time.*;
import java.time.format.*;
 
public class HowLong {
   public static void main(String[] args) {
      LocalDate newYears = LocalDate.of(2017, 1, 1);
      Period period = Period.ofDays(1);
      DateTimeFormatter format = DateTimeFormatter.ofPattern("mm-dd-yyyy");
      System.out.print(format.format(newYears.minus(period)));
   }
}
-   When creating a formatter object, remember that MM represents month while mm repre-
sents minute. Since there are not minutes defined on a LocalDate object, the code throws 
an UnsupportedTemporalTypeException. You don’t need to know the name of the excep-
tion, but you do need to know that an exception is thrown


There are two signatures for the replace() method. One takes two char parameters. 
The other signature takes a CharSequence. Both String and StringBuilder implement 
this interface


import java.util.*;
import java.util.function.*;
 
public class PrintNegative {
   public static void main(String[] args) {
      List<String> list = new ArrayList<>();
      list.add("-5");
      list.add("0");
      list.add("5");
      print(list, e -> e < 0);
   }
   public static void print(List<String> list, Predicate<Integer> p) {
      for (String num : list)
         if (p.test(num))
            System.out.println(num);
   }
}
-   Pay attention to the data types. The print() method is looping through a list of String 
objects. However, the Predicate expects an Integer.  Since these don’t match, the if 
statement does not compile



LocalDate xmas = LocalDate.of(2016,  12,  25);
xmas.setYear(2017);
System.out.println(xmas.getYear());
-   The Java 8 date and time classes are immutable. This means they do not contain setter 
methods and the code does not compile


31/01 ---------------------------------------------------------------------------------------------------

--  Checked exceptions
-   Checked exceptions are commonly used to force a caller to deal with an expected ype of problem,
    such as the inability to write a file to the file system.
-   add checked exceptions to a method signature, To force a caller to handle or declare its exceptions
-   add checked exceptions to ta method signature, Declaring various different exceptions
    informs the caller of the potential types of problems the method can encounter. 
-   There may be no recourse in handling an exception other than to terminate the application.


-   This code does not compile because the catch and finally blocks are in the wrong order

--  Seen by Caller
-   If both the catch and finally blocks throw an exception, the one from the finally
    block is propagated to the caller, with the one from the catch block being dropped

-   ClassCastException is a subclass of RuntimeException, so it must appear first in any
    related catch blocks. If RuntimeException was to appear before ClassCastException,
    then the ClassCastException block would be considered unreachable code, since any
    thrown ClassCastException is already handled by the RuntimeException catch block.

-   An overridden method must not throw any new or broader checked exceptions than the method it inherits.





28/01 ---------------------------------------------------------------------------------------------------

--  try/catch
-   A try block must include either a catch or finally block, or both


--  local variable
    try {
         int score = 1;
         System.out.print(score++);
      } catch (Throwable t) {
         System.out.print(score++);
      } finally {
         System.out.print(score++);
      }
      System.out.print(score++);
-   score is defined only within the try block.
    The other three places it is referenced, in the catch block, in the finally block, and out-
    side the try-catch-finally block at the end, are not in scope for this variable


--  checken exception
-   ClassCastException, ArrayIndexOutOfBoundsException, and
    IllegalArgumentException are unchecked exceptions and can be thrown at any time.
    IOException is a checked exception that must be handled or declared when used

--  Catch order
-   IOException is a subclass of Exception, so it must appear first in any related catch blocks

--  
      try {
         System.out.print('A');
         throw new RuntimeException("Out of bounds!");
      } catch (ArrayIndexOutOfBoundsException aioobe) {
         System.out.print('B');
         throw t;
      } finally {
         System.out.print('C');
      }
-   The application first enters the try block and outputs A. It then throws a
    RuntimeException, but the exception is not caught by the catch block since
    RuntimeException is not a subclass of ArrayIndexOutOfBoundsException (it is a superclass).


--  
    public class Fortress {
   public void openDrawbridge() throws Exception {  exception is t
      try {
         throw new Exception("Circle");
      } catch (Exception e) {
         System.out.print("Opening!");
      } finally {
         System.out.print("Walls");  // p2
      }
   }
   public static void main(String[] moat) {
      new Fortress().openDrawbridge();  // p3
   }
-   the openDrawbridge() method is called from within the main() method on line p3. The
    openDrawbridge() method declares the checked exception, Exception, but the main()
    method from which it is called does not handle or declare the exception. In order for this
    code to compile, the main() method would have to have a try-catch statement around line
    p3 that properly handles the checked exception, or the main() would have to be updated
    to declare a compatible checked exception. For these reasons, line p3 does not compile

--  final block
-   Finally block can throw an exception, in which case not every line of the finally block would be executed
-   The finally block is called regardless of whether or not the related catch block is executed.
-   Unlike an if-then statement, which can take a single statement, a finally statement requires brackets {}


public class Printer {
   public void print() {
      try {
         throw new FileNotFoundException();
      } catch (IOException exception) {
         System.out.print("Z");
      } catch (FileNotFoundException enfe) {
         System.out.print("X");
      } finally {
         System.out.print("Y");
      }
   }
   public static void main(String... ink) {
      new Printer().print();
   }
-    the catch blocks are used in the wrong order. Since
    IOException is a superclass of FileNotFoundException, the FileNotFoundException is
    considered unreachable code.


--  Overrdien method
-   Overridden methods cannot throw new or broader checked exceptions than the one they
    inherit


-   The code does not compile because the catch block is missing a variable type and
    name, such as catch (Exception e). 

package castles;
class CastleUnderSiegeException extends Exception {}
class KnightAttackingException extends CastleUnderSiegeException {}
public class Citadel {
   public void openDrawbridge() throws RuntimeException {  // q1
      try {
         throw new KnightAttackingException();
      } catch (Exception e) {
         throw new ClassCastException();
      } finally {
         throw new CastleUnderSiegeException();  // q2
      }
   }
   public static void main(String[] moat) {
      new Citadel().openDrawbridge();  // q3
   }
}
-   The application does not compile, so Option D is incorrect. The checked
KnightAttackingException thrown in the try block is handled by the associated catch
block. The ClassCastException is an unchecked exception, so it is not required to be han-
dled or declared and line q1 compiles without issue. The finally block throws a checked
CastleUnderSiegeException, which is required to be handled or declared by the method,
but is not. There is no try-catch around line q2, and the method does not declare a compat-
ible checked exception, only an unchecked exception. For this reason, line q2 does not com-
pile, and Option B is the correct answer. Lastly, line q3 compiles without issue because the
unchecked RuntimeException is not required to be handled or declared by the call in the
main() method.


24




26/01 ---------------------------------------------------------------------------------------------------

CHAPTER 6

-- protected vs packge-private
-   protected           modifier allows access by subclasses and members within the same package
                        protected access also provides package-private access.
-   package-private     modifier allows access only to members in the same package


not true!!!!!!!!!!!
prefvent from compiling!!!!!!



--  Static Variable
-   The only variables always available to all instances of the class are those declared static
-   public variables are only available if a reference to the object is maintained among all instances.


--  boolean
-   default initialization of a boolean instance variable is false


--  public instance variable
    package storage;
    public class Box {
        public String stuff;
-   The class data, stuff, is declared public, allowing any class to modify the stuff variable
        and making the implementation inherently unsafe for encapsulation


--  Constructors
-    Java only inserts a no-argument constructor if there are no other constructors in the class
-    If a class extends a parent class that does not include a no-argument constructor,
    the default no-argument constructor cannot be automatically inserted into the child class
    by the compiler.


-- passed-by-value
-   variables are passed by value, not reference, in Java???
-   changes made to primitive values and object references  
    passed to a method are not reflected in the calling method.???
-    Changes to the data within an object are visible to the calling method since 
    the object that the copied reference points to is the same.



-- ways to call a method, same package
   MathHelper.roundValue(3.1)
   useful.MathHelper.roundValue(65.3)
-   since we are
given that two classes are in the same package, therefore the package name would not be required.


--  Encapuslation
-   Encapsulation is about protecting the data elements.

--  JavaBeans
-   JavaBean methods use the prefixes get, set, and is for boolean values,


--  import static
    package clothes;
    public class Store {
    public static String getClothes() { return "dress"; }
    }
    
    package wardrobe;
    import static clothes.Store.getClothes;     <---------
    public class Closet {
    public void borrow() {
        System.out.print("Borrowing clothes: "+getClothes());
    }
    }
-   Closet class uses the method getClothes() without a reference to the class name Store,
    therefore a static import is required
-   A static import is used to import static members of another class.


--  package-private access modifier
-   the lack of an access modifier indicates that the member is package-private


--  Instance Method
-   An instance method or constructor has access to all static variables
-    static methods and static initializers cannot
    reference instance variables since they are defined across all instances
    
    private static final String monday;
-   The declaration of monday does not compile, because the value of a static final vari-
    able must be set when it is declared or in a static initialization block.


    package park;
    public class Tree {
    public final static long numberOfTrees;
    public final double height;
    static {}
    { final int initHeight = 2;
        height = initHeight;
    }
    static {
        numberOfTrees = 100;
        height = 4;
    }
    }
-   The last static initialization block accesses height, which is an instance variable,
    not a static variable. Therefore, the code will not compile

    


24/01 ---------------------------------------------------------------------------------------------------

CHAPTER 5

--  Variable Scope
-   variable can't be declared inside the loop. 

--  for-each
-   for-each loop is allowed to be used with arrays and ArrayList objects.  
    StringBuilder is not an allowed type for this loop

--
    for (int i = 0, j = 0; i < nycTourLoops.length && j < times.length; i++; j++)
-   Multiple update expressions are separated with a comma rather than a semicolon

--
    String tie = null;
    while (tie == null);   <-----------
       tie = "shoelace";
       System.out.print(tie);
-   the loop body is empty due to the semicolon right after the condition. 
    This means the loop condition keeps runnin


--  Remember to look for basic errors before wasting time tracking the flow
-   In this case, the label of the loop is trying to use the keyword for. This is not allowed




    public class RainForest extends Forest {
    public RainForest(long treeCount) {
        this.treeCount = treeCount+1;
    }
    public static void main(String[] birds) {
        System.out.print(new RainForest(5).treeCount);
    }
    }
    class Forest {
    public long treeCount;
    public Forest(long treeCount) {
        this.treeCount = treeCount+2;
    }
    }
-   Since a constructor call is not the first line of the RainForest() constructor, the com-
    piler inserts the no-argument super() call. Since the parent class, Forest, does not define
    a no-argument super() constructor, the RainForest() constructor does not compile,

--  operator autocast
-   by one using the addition + operator.
    The addition + operator automatically promotes all byte and short values to int.

    public class Football {
        public static Long getScore(Long timeRemaining) {
            return 2*timeRemaining; // m1
        }
        public static void main(String[] refs) {
            final int startTime = 4;
            System.out.print(getScore(startTime)); // m2
    }
-   The variable startTime can be automatically converted to Integer by the compiler, but
    Integer is not a subclass of Long. Therefore, the code does not compile due the wrong vari-
    able type being passed to the getScore()



21/01 ---------------------------------------------------------------------------------------------------

CHAPTER 4

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
    float[] lion = new float[];     LEGGAL
    float[] tiger = new float[1];   ILLEGAL
-   You are not allowed to specify the size separately.
-   The size is inferred from the number of elements listed.


--  Array Sort and Search
-   The binarySearch() method requires a sorted array in order to return a correct result.
    If the array is not sorted, the results of a binary search are undefined.
-   If the array already is in alphabatical order, you don't need to sort 


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