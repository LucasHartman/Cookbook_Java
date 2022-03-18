/*

428
433
437
443
448
452
459
465
472




----------------------------------------------------------------------------------------------------- 
Access Modifiers
----------------------------------------------------------------------------------------------------- 

                                    default         private         protected           public
______________________________________________________________________________________________
Same Class                          Yes             Yes             Yes                 Yes
Same Package subclass               Yes             No              Yes                 Yes
Same package non-subclass           Yes             No              Yes                 Yes
Different package subclass          No              No              Yes                 Yes
Different package non-subclass      No              No              No                  Yes

-- protected
-   The protected and default access control levels are almost identical, 
    but with one critical difference.
-   protected member can be accessed (through inheritance) by a subclass 
    even if the subclass is in a different package. 

- protected member can't   be used in an interface (also true for default methods)
- protected member can     be used in an abstract class
- protected member from another package can't be imported (non child class)
- A inherited public method from the interface can't be reduces to protected 


-- Package (Default)
-   Default protection is what you get when you DON'T type an access modifier in the member declaration.
-   A default member may be accessed only if the class accessing the member belongs to the same package
-   The default and protected access control types have almost identical behavior, except for one difference


--  Access Methods
-    getters and setters, other terms accessors and mutator's
-   The point is, you can change your mind later 
    and add more code to your methods without breaking your API.


----------------------------------------------------------------------------------------------------- 
this, super
-----------------------------------------------------------------------------------------------------

--  super()
-   The parent default constructor is automatically initiated in the child class
    NOTE: if the parent doesn't have no-arg constructor, the automatically initialized super() won't work, resulting into an error.
-   Parent constructor with an argument can be invoked in the child class constructor, using super("arg");
-   It must be used only inside Child’s constructor.
-   Call to super() must be the first statement.
    NOTE: you can't have this() and super() add the same time.

-- super.member
-   MyInterface.super.doStuff()         get parent member
-   this does not work in the parent class

--  this()
-   It is used to invoke current class constructor
-   It must be used only inside another constructor of same class.
-   Call to this() must be the first statement.
-   To connect constructors in a single class.
-   Used to initialize an object via multiple constructors.

-- this.member
-   The this keyword refers to the current object in a method or constructor.
-   this keyword is to eliminate the confusion between class attribute and parameters with the same name.

-- this
-   this(10 ,20);       Invoke constructor inside a constructor.
-   return this;        return the current class instance in a method
-   myMethod(this)      input class instance method or constructor
-   this.myMethod();    Invoke method inside a method


----------------------------------------------------------------------------------------------------- 
Overload, Override 
----------------------------------------------------------------------------------------------------- 

-- Overload
-   REUSE name
-   MUST change argument
-   MAY change return type
-   MAY change access modifier
-   MAY throw any exception thrown / not thrown
-   Polymorphism applies to overriding, not to overloading


-- Override
-   Reuse name
-   MUST have same argument
-   MUST have same return type (or sub-type)
-   overridden method (i.e. declared in subclass) must not be more restrictive.
-   IF super-class method does not throw an exception,
    subclass overriding method can only throws the unchecked exception,
    throwing checked exception will lead to compile-time error.
-   IF super-class method throws an exception,
    subclass overriding method can only throw same or subclass exception
-   ALSO there is no issue if subclass overridden method is not throwing any exception.

-   Override Method can only do a New , Same, Or Narrow Unchecked Exception

-   default methods inside the interface can be overridden
-   static  methods can't be overridden
-   Private method can't be overridden
-   Final   methods can't be overridden
-   instance variables can't be overridden, they are there own value


// Override ---------------------------------------------------------------------------------------------------------------------------

-   If the superclass method does NOT declare an exception, 
    subclass overridden method CANNOT declare the CHECKED exception but it CAN declare UNCHECKED exception.

    Parent  { method(){} }
    Child   { method() throws Exception{} } // Cannot Compile
    Child   { method() throws RuntimeException {} } // Legal

-   If the superclass method declares an exception, subclass overridden method can declare SAME, 
    subclass (NARROWER) exception or NO exception but cannot declare parent (BROADER) exception.

    Parent  { method() {} throws Exception {} }
    Child   { method() {} throws Exception {} }     // Legal
    Child   { method() {} trhows Throwable {} }     // Cannot Compile
    Child   { method() {} throws ExceptionIO {} }   // Legal


    Parent  { method() {} trhows RuntimeException {} }
    Child   { method() {} throws Exception {} }         // Cannot Compile

    Parent  { method() {} trhows Exception {} }
    Child   { method() {} throws RuntimeException {} }  // Legal


// OverLoad ---------------------------------------------------------------------------------------------------------------------------

- Method without an Exception               CAN     be overloaded with a      NEW     UnChecked Exception   (IndexOutOfBoundException)
- Method without an Exception               CAN     be overloaded with a      NEW     Checked Exception     (ClassNotFoundException)

- Method with an Checked Exception          CAN     be overloaded             WITHOUT Checked Exception     (ClassNotFoundException)
- Method with an Unchecked Exception        CAN     be overloaded with the    SAME    unchecked Exception   (IndexOutOfBoundException)
- Method with an Unchecked Exception        CAN     be overloaded with the    BROADER unchecked Exception   (IndexOutOfBoundException)
- Method with an Unchecked Exception        CAN     be overloaded with the    NARROW  unchecked Exception   (IndexOutOfBoundException)
- Method with an UNCHECK Exception          CAN     be overloaded with the    NEW     CHECKED Exception     (ClassNotFoundException) !!!

- Method with an UnChecked Exception        CAN     be overloaded             WITHOUT Unchecked Exception   (IndexOutOfBoundException)
- Method with an checked Exception          CAN     be overloaded with the    BROADER checked Exception     (ClassNotFoundException)
- Method with an checked Exception          CAN     be overloaded with the    NARROW  checked Exception     (ClassNotFoundException)
- Method with an CHECKED Exception          CAN     be overloaded with the    NEW     UNCHECKED Exception   (IndexOutOfBoundException) !!!



-----------------------------------------------------------------------------------------------------
Initialization Order
-----------------------------------------------------------------------------------------------------

Static block A
Static block B
Static block C
Init block A
Constructor A
Init block B
Constructor B
Init block C
Constructor C


-----------------------------------------------------------------------------------------------------
Instance, Static
-----------------------------------------------------------------------------------------------------

-- Static Members
-   Belongs to the class
-   Gets memory once
-   Access a static member: className.staticMethod()
-   Access a static import: staticMethod()
-   Access a static member though an object reference variable is possible
-   Static methods can access the static variables and static methods directly.
-   Static method CAN'T access an instance method or variable
-   Static method CAN'T be overridden, but can be redefined in a subclass (Hidden Method)


-- Instance Members
-   Belong to the object of the class
-   Gets memory each a new construction
-   Access instance members, through an object reference variable
-   Access a static member though an object reference variable is possible
-   Instance method can access the instance methods and instance variables directly.
-   Instance method can access static variables and static methods directly
-   They can be overridden since they are resolved using dynamic binding at run time.


-----------------------------------------------------------------------------------------------------
Implicit, Explicit
-----------------------------------------------------------------------------------------------------

    --  Implicit Casting (Widening)
    -   Converting lower -> higher data types
    -   Automatically
    -   The conversion between numeric data type to char or Boolean is not done automatically.
    -   The compiler will broaden the data type on a numeric value until it finds a compatible signature. 


         byte -> short -> int -> long -> float -> double


    --  Explicit Casting (Narrowing)
    -   Converting higher -> lower data types
    -   Manually (by the programmer)
    -   If we do not perform casting the compiler reports a compile-time error.

         double -> float -> long -> int -> short -> byte  

         long l = 5;
         int i  = (int) l;

    -   Casting an object to a reference variable does not modify the object in memory.
    -   An object can be assigned to a superclass reference variable without an explicit cast.

-- Class Casting !!!!!!!!!!!!
-   A reference to a class can be implicitly assigned to a superclass reference without an explicit class
-   A reference to an interface requires an
    explicit cast to be assigned to a reference of any class, even one that implements the interface.
-   A reference can both cast an Interface and Abstract class

        InterfaceObj refName = (InterfaceObj)(AbstractObj)new ChildClass().getMethod();

-   A class may assign to a superclass reference variable automatically
-   A class must requires an explicit cast when assigned to an subclass reference variable

-----------------------------------------------------------------------------------------------------
equals(), ==, instanceof()
-----------------------------------------------------------------------------------------------------

--  == operator
-   Checks if the object in memory, whether its an primitive value or a memory address. 
-   case 1:     both sides are primitive (stored in the stack memory), 
                returns true if they both are equal
-   case 2:     1 side is primitive, the other reference variable (heap memory are reference pointer in the stack memory. 
                So all that is in the stack memory is the memory address)
                For example: left is primitive 1 and the right side is an array, this will return a false.
-   case 3:     Both side are reference variable, pointer to the same memory address equals true   
-   Checks if both references points to same location or not.

        System.out.println(new StringBuilder("zelda") == new StringBuilder("zelda")); // false
        System.out.println(3 == 3);                             // true
        System.out.println("bart" == "bart");                   // true    
        System.out.println(new int[0] == new int[0]);           // false  no objects just values
        System.out.println(LocalTime.now() == LocalTime.now()); // false  no objects just values


--  equals()
-   equals()        method compares         String       (String.eqaults(String)
-   equals() method should be used for content comparison
-   Evaluates the content to check the equality.
-   An enum can be compared using either equals() or ==.


-- instanceof comparison 
-    The instanceof operator is used for object reference variables only
-   Same type or same Parent type
-   implements and extends the parent class



String lol = "lol";
// String should be compared with a method rather than ==, 
// especially when not comparing two values from the string pool.
4:  System.out.println(lol.toUpperCase() == lol);                       // false    "LOL" has no object to compare to
5:  System.out.println(lol.toUpperCase() == lol.toUpperCase());         // false    "LOL" and "LOL" has no object

6:  System.out.println(lol.toUpperCase().equals(lol));                  // false    not the same value
7:  System.out.println(lol.toUpperCase().equals(lol.toUpperCase()));    // true     same value
8:  System.out.println(lol.toUpperCase().equalsIgnoreCase(lol));        // true     same value (when ignored)
9: System.out.println(lol.toUpperCase()                                    
10: .equalsIgnoreCase(lol.toUpperCase()));                               // true    same value




-----------------------------------------------------------------------------------------------------
(Non)-Short-Circuit
-----------------------------------------------------------------------------------------------------

    -- Non-Short-Circuit (& |) 
    -   They evaluate both side of the expression, ALWAYS!
        even if the first operant (left side) is false, the second operant will still be evalued.
    
        &       AND       Both must be true
        |       OR        At least one must be true
        ^       XOR       Only one operand must be true.
        !       NOR       Inverts the outcome


    -- Short-Circuited (&& ||) 
    -   Meaning they don't evaluate the right hand side if it that doesn't necessary
    -   Example: if left hand side is false no need to evaluate right hand side one. 
    -   Short-circuiting operators can be slightly slower because they cause branching in the program execution


-----------------------------------------------------------------------------------------------------
Precedence
-----------------------------------------------------------------------------------------------------

_________________________________________________________________________________________________________________________________
1. Unary Operators                         -      !      ++    --          negative    invert      increment
2. Multiplication, division, modulus       *      /      %                 multiple    division     remainder
3. Addition, subtraction                   +      -                        add         subtract
4. Relation operators                      <      >      <=    >=          greater     lesser      lesser-equal     greater-equal
5. Equality operators                      ==     !=                       equal       not-equal
6. Logical operators (non-circuit)         &      |    ^                   AND         OR   XOR
7. Short-circuit                           &&     ||                       AND         OR
8. Assignment operators                    =      +=     -=                equal       plusEqual   minusEqual


-----------------------------------------------------------------------------------------------------
Ternary
-----------------------------------------------------------------------------------------------------

-- Ternary
-  Conditional operator, ? :, otherwise known as the Ternary operator. 
-  The ternary operation is really a condensed form of a combined if and else statement 
   that returns a value you should know that there is no requirement that second and 
-  third expressions in ternary operations have the same data types, 
   although it does come into play when combined with the assignment operator


--  Same type
    distance < 1000 ? "train" : 10;
-   Ternary operations require both right-hand expressions to be of compatible data types.


-----------------------------------------------------------------------------------------------------
StringBuilder Methods
-----------------------------------------------------------------------------------------------------

1           append(String s)                                    append the specified string
2           insert(int offset, String)                          insert the specified string
3           replace(int start Index, int endIndex, String str)  replace string
4           delete(int startIndex, int endIndex)                delete string from specified start and index
5           reverse()                                           reverse character order
6           capacity()                                          return character storage size
7.          ensureCapacity()                                    ensures minimum capacity
8.          charAt(int index)                                   returns the character a the given index
9.          length()                                            total number of characters
10.         substring(int beginIndex)                           return String for specified index
11.         substring(int beginIndex, endIndex)                 return String from begin to end index 


-----------------------------------------------------------------------------------------------------
String Methods
-----------------------------------------------------------------------------------------------------

charAt() 	            Returns the character at the specified index (position) 	char
codePointAt() 	        Returns the Unicode of the character at the specified index 	int
codePointBefore() 	    Returns the Unicode of the character before the specified index 	int
codePointCount() 	    Returns the number of Unicode values found in a string. 	int
compareTo() 	        Compares two strings lexicographically 	int
compareToIgnoreCase() 	Compares two strings lexicographically, ignoring case differences 	int
concat() 	            Appends a string to the end of another string 	String
contains() 	            Checks whether a string contains a sequence of characters 	boolean
contentEquals() 	    Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer 	boolean
copyValueOf() 	        Returns a String that represents the characters of the character array 	String
endsWith() 	            Checks whether a string ends with the specified character(s) 	boolean
equals() 	            Compares two strings. Returns true if the strings are equal, and false if not 	boolean
equalsIgnoreCase() 	    Compares two strings, ignoring case considerations 	boolean
format() 	            Returns a formatted string using the specified locale, format string, and arguments 	String
getBytes() 	            Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array 	byte[]
getChars() 	            Copies characters from a string to an array of chars 	void
hashCode() 	            Returns the hash code of a string 	int
indexOf() 	            Returns the position of the first found occurrence of specified characters in a string 	int
intern() 	            Returns the canonical representation for the string object 	String
isEmpty() 	            Checks whether a string is empty or not 	boolean
lastIndexOf() 	        Returns the position of the last found occurrence of specified characters in a string 	int
length() 	            Returns the length of a specified string 	int
matches() 	            Searches a string for a match against a regular expression, and returns the matches 	boolean
offsetByCodePoints() 	Returns the index within this String that is offset from the given index by codePointOffset code points 	int
regionMatches() 	    Tests if two string regions are equal 	boolean
replace() 	            Searches a string for a specified value, and returns a new string where the specified values are replaced 	String
replaceFirst() 	        Replaces the first occurrence of a substring that matches the given regular expression with the given replacement 	String
replaceAll() 	        Replaces each substring of this string that matches the given regular expression with the given replacement 	String
split() 	            Splits a string into an array of substrings 	String[]
startsWith() 	        Checks whether a string starts with specified characters 	boolean
subSequence() 	        Returns a new character sequence that is a subsequence of this sequence 	CharSequence
substring() 	        Returns a new string which is the substring of a specified string 	String
toCharArray() 	        Converts this string to a new character array 	char[]
toLowerCase() 	        Converts a string to lower case letters 	String
toString() 	            Returns the value of a String object 	String
toUpperCase() 	        Converts a string to upper case letters 	String
trim() 	                Removes whitespace from both ends of a string 	String
valueOf() 	            Returns the string representation of the specified value

-----------------------------------------------------------------------------------------------------
ArrayList Methods
-----------------------------------------------------------------------------------------------------

1 	        void add(int index, Object obj)

            Inserts obj into the invoking list at the index passed in the index. 
            Any pre-existing elements at or beyond the point of insertion are shifted up. 
            Thus, no elements are overwritten.

2 	        boolean addAll(int index, Collection c)

            Inserts all elements of c into the invoking list at the index passed in the index. 
            Any pre-existing elements at or beyond the point of insertion are shifted up. Thus, 
            no elements are overwritten. 
            Returns true if the invoking list changes and returns false otherwise.

3 	        Object get(int index)

            Returns the object stored at the specified index within the invoking collection.

4 	        int indexOf(Object obj)

            Returns the index of the first instance of obj in the invoking list. 

            If obj is not an element of the list, .1 is returned.

5 	        int lastIndexOf(Object obj)

            Returns the index of the last instance of obj in the invoking list. 
            If obj is not an element of the list, .1 is returned.

6 	        ListIterator  ( )
            Returns an iterator to the start of the invoking list.

7 	        ListIterator listIterator(int index)

            Returns an iterator to the invoking list that begins at the specified index.

8 	        Object remove(int index)

            Removes the element at position index from the invoking list and 
            returns the deleted element. The resulting list is compacted. 
            That is, the indexes of subsequent elements are decremented by one.

9 	        Object set(int index, Object obj)

            Assigns obj to the location specified by index within the invoking list.

10 	        List subList(int start, int end)

            Returns a list that includes elements from start to end.1 in the invoking list. 
            Elements in the returned list are also referenced by the invoking object.

-----------------------------------------------------------------------------------------------------
Time Methods
-----------------------------------------------------------------------------------------------------


-- java.time.LocalDate
-   Represents a date   yyyy-MM-dd
-   years               yyyy
-   month               MM
-   day                 dd
-   LocalDate obj =                 LocalDate.now();            // 2022-02-17
-   DateFormatter formatObj =       DateFormatter.ofPattern("dd-MM-yyyy");
-   String formatDateObj =          obj.format(formatObj);      // 17-02-2022


-- java.time.LocalTime
-   Represents a time   HH-mm-ss-ns
-   hour                HH
-   minute              mm
-   second              ss
-   nanosecond          ns
-   LocalTime obj =                 LocalTime.now();            // 10:44:59.831399
-   TimeFormatter formatObj =       TimeFormatter.ofPattern("HH:mm:ss");
-   String formatTimeObj =          obj.format(formatObj);      // 10:55:36


-- java.time.LocalDateTime
-   date and time       yyyy-MM-dd-HH-mm-ss-ns
-   years               yyyy
-   month               MM
-   day                 dd   
-   hour                HH
-   minute              mm
-   second              ss
-   nanosecond          ns
-   LocalDateTime obj =             LocalDateTime.now();        // 2022-02-17T10:44:59.831643 
-   DateTimeFormatter formatObj =   DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
-   String formatDateTimeObj =      obj.format(formatObj);      // 17-02-2022 10:55:36


-----------------------------------------------------------------------------------------------------
Lambda
-----------------------------------------------------------------------------------------------------


Predicate<String> pred1 = s -> false;               The pred1 approach shows the shortest way, 
                                                    where the type is omitted and the parentheses are omitted. 
Predicate<String> pred2 = (s) -> false;             The pred2 approach is similar except it includes the parentheses. 
                                                    Both are legal. 
Predicate<String> pred4 = (String s) -> false;      The  pred4 approach is the long way with both 
                                                    the parentheses and type specified.
Predicate<String> pred3 = String s -> false;        The only one that doesn’t compile is pred3. 
                                                    The parentheses are required if including the type.
Predicate pred4 = c -> c.equals("clear");           While it is common for a Predicate to have a generic type, 
                                                    it is not required.

-- Function
-   Syntax:             Function<T,R> name = (input, result) -> Function;
-   Caller:             name.apply()
-   Argument            any
-   Return:             any

-- Supplier
-   The Supplier function has no input, but can return any type.
-   Syntax              Supplier<T> name = () -> Function;
-   Caller:             name.get()
-   Argument:           none
-   Return:             any

-- BinaryOperator
-   Syntax              BinaryOperator<T,T> name = (t,t) -> function;
-   Caller:             name.apply(t,t)
-   Argument:           2 any type
-   Return:             same as argument 

-- Predicate
-   Syntax:             Predicate<T> name = (t) -> function;
-   Caller:             name.test(t)
-   Argument:           any type
-   Return:             boolean type 

-- Consumer
-   Syntax:             Consumer<T> name = (t) -> Function;
-   Caller:             name.accept(t)
-   Argument:           any
-   Return:             none


-----------------------------------------------------------------------------------------------------
(Un)Checked Exception
-----------------------------------------------------------------------------------------------------


                        Object
                        |
                        |
    ------------------ Throwable --------------------
    |                                               |
    |                                               |
    --  Exceptions (Checked)                        -- Error
    |
    |
    --  Checked Exceptions 
        (IO or Compile-Time)
    |
    |
    --  Unchecked Exceptions 
        (Runtime or NullPointer)



-- Checked Exceptions
-   Checked exceptions are checked at compile-time.
-   it should handle the exception using try-catch block or 
    it should declare the exception using throws keyword.
-   otherwise the program will not compile
-   If method declaration includes the Exception class, which is a checked exception. 
    But an unchecked exception is thrown, even so
    the checked exception must be handled or declared in the main() method in which it is called.

    -   Object.Throwable.Exception.Checked Exception...
    -   IO              Exception
    -   ClassnotFound   Exception
    -   Socket          Exception
    -   SQL             Exception
    -   Exception

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
    -   IllegalArgument         Exception       is thrown in order to indicate that a method has been passed an illegal argument.
    -   Numberformat            Exception
    -   ClassCast               Exception
    -   Object.Throwable.Error...
    -   StackOverflow           Error
    -   OutOfMemory             Error

-- Error
-   An Error generally indicates an unrecoverable problem.
-   While it is possible to catch an Error, it is strongly recommended that an application never do so,
-   Error extends from Throwable, not Exception, and is unchecked.

-- try/catch
-   A try statement requires a catch or a finally block
-   It can also have an catch an finally block
-   If an exception is found in the try block, the code inside the try block is not executed.
-   A variable defined  in a try block is a local variable and is not in scope of the catch,finally and outside the try/catch/finally
-   catch order goes from narrow to wider exception

-- finally
-   finally block can throw an exception
-   not every line in a finally block could be executed 
-   finally statement required brackets {}
-   If the catch throws an Unchecked Exception (throws new NUllPointerException)
    and the finally too (throw new RuntimeException(); ).
    Than the caller sees the RuntimeException in the stack trace.

-- throws
-   Is used in the method declarations
-   throws a broad exception like RuntimeException, 
    can't be caught with a narrowed exception, 
    like ArrayIndexOutOfBoundsException
-   If a throws

-----------------------------------------------------------------------------------------------------
indexOf() method
-----------------------------------------------------------------------------------------------------

        String myString = "Hello";
        
        // find first occurrence of the specified character
        System.out.println(myString.indexOf('H')); // 0
        System.out.println(myString.indexOf('o')); // 4

        // if the character does not occur
        System.out.println(myString.indexOf('a')); // -1
        System.out.println(myString.indexOf('k')); // -1

        // start searching from selected index position
        System.out.println(myString.indexOf('l', 1)); // 2
        System.out.println(myString.indexOf('l', 3)); // 3

-----------------------------------------------------------------------------------------------------
JavaBeans
-----------------------------------------------------------------------------------------------------

-- JavaBean
-   Source: https://www.tutorialspoint.com/javabean-class-in-java
-   JavaBean is a specially constructed Java class, coded according to the JavaBeans API specification
-   1. It provides a default, no-argument constructor.
-   2. It should be serializable and that which can implement the Serializable interface
-   3. It may have a number of "getter" and "setter" methods for the properties (class variables).

-- java.io.Serializable (Interface)
-   Source:   https://www.geeksforgeeks.org/serializable-interface-in-java/
-   Does not have any methods and fields.
-   Class implement it if they want their instances to be Serialized or Deserialized.
-   Serialization is a mechanism of converting the state of an object into a byte steam.
-   Serialization is done using ObjectOutputStream
-   This mechanism is used to persist the object. 

-- byte steam
-   https://www.tutorialspoint.com/byte-streams-in-java
-   byte steam read/write data of 8 bits.
-   These can store characters, videos, audios, images. etc.

-- Java.io.ObjectOutputSteam Class
-   Source:   https://www.geeksforgeeks.org/java-io-objectoutputstream-class-java-set-1/
-   writes primitive data types and graphs of Java objects to an OutpustSTeam.
-   The objects can be read (reconstituted) using an ObjectInputSteam.

-- Valid/unValid signatures
A. public byte getNose(String nose)       -   // incorrect,   getter shout not take a value
B. public void setHead(int head)            // correct
C. public String getShoulders()             // correct
D. public long isMouth()                    // incorrect,   prefix "is" should only be with boolean values
E. public void gimmeEars()                  // incorrect,   just a method
F. public boolean isToes()                  // correct

-----------------------------------------------------------------------------------------------------
Import
-----------------------------------------------------------------------------------------------------
Given a class that uses the following import statements, 
which class would be automatically accessible without using its full package name? 

import forest.Bird;     // only forest.Bird available 
import jungle.tree.*;
import savana.*;

A. forest.Bird              //  correct  
B. savana.sand.Wave         //  incorrect   access to classes within the savana package
C. jungle.tree.Huicungo     //  correct
D. java.lang.Object         //  correct     implicitly included in all Java classes.
E. forest.Sloth             //  incorrect
F. forest.ape.bonobo        //  incorrect

-----------------------------------------------------------------------------------------------------
immutable objects
-----------------------------------------------------------------------------------------------------

-- Mutable
-   object can change state
-   ArrayList
-   StringBuilder

-- Immutable 
-   Can NOT change state
-   String
-   LocalDateTime

-----------------------------------------------------------------------------------------------------
Arrays
-----------------------------------------------------------------------------------------------------

-- Arrays
-   Source: https://www.geeksforgeeks.org/arrays-in-java/
-   Array is a group of like-typed variables
-   dynamically allocated:  
-   array is an object
-   array variable are declared with []
-   array have index beginning from 0
-   array can be a static field, local variable, or method parameter
-   Size must be specified by int or short value and not long
-   Superclass of an array type is Object
-   Array can contain primitives and object

-- Declare
-   int intArray[];
-   int[] intArray;

-- Instantiating
-   If an array is not initialized, it will throw a NullPointException
-   intArray = new int[20];
-   int[][][] intArray = new int[10][5][2];

-- Array Literal
-   In a situation where the size of the array and variables 
    of the array are already known, array literals can be used. 
-   int[] intArray = new int[] {1,2,3,4,5};


-----------------------------------------------------------------------------------------------------
Generics
-----------------------------------------------------------------------------------------------------

-- Generics
-   Source: https://www.geeksforgeeks.org/generics-in-java/
-   Generics means parameterized types.
-   The idea is to allow type (Integer, String, … etc., 
    and user-defined types) to be a parameter to methods, classes, 
    and interfaces. 
-   Generics add that type of safety feature.
-   classes like HashSet, ArrayList, HashMap, etc., use generics very well. 

-- Generic Method
-   Generic Method takes a parameter and returns some value after performing a task
-   generic method has type parameters that are cited by actual type.

-- Generic Class (parameterized classes)
-   Generic class is implemented exactly like a non-generic class
    The only difference is that it contains a type parameter section.
-   There can be more than one type of parameter.

        class Test<T> {
            // An object of type T is declared
            T obj;
            Test(T obj) { this.obj = obj; } // constructor
            public T getObject() { return this.obj; }
        }

-- diamond operator
        List<String> c = new ArrayList<>();
        List<String> e = new ArrayList<String>();
-   The diamond operator is only allowed to be used when instantiating rather than
    declaring. In other words, it can’t go on the left side of the equal sign.
-   generics are not used on the right side of the assignment operator.

-----------------------------------------------------------------------------------------------------
Garbage collection (GC)
-----------------------------------------------------------------------------------------------------

-- Garbage collection (GC)
-   Source: https://www.geeksforgeeks.org/garbage-collection-java/
-   Automatic memory management.
-   Object of created on the heap, a potion of memory dedicated to the program.
-   Eventually, some object wound be needed.
-   The garbage collector, destroying unreachable objects.

-- in-use object
-   An in-use object, or a referenced object,
    means that some part of your program still maintains a 
    pointer to that object.

-- Make an object eligible for Garbage Collector
1.  Nullifying the reference variable
2.  Re-assigning the reference variable
3.  An object created inside the method
4.  Island of Isolation

-- Ways for requesting JVM to run Garbage Collector
-   Once we make an object eligible for garbage collection, 
    it may not destroy immediately by the garbage collector. 
    Whenever JVM runs the Garbage Collector program, then only the object will be destroyed. 
    But when JVM runs Garbage Collector, we can not expect.
    We can also request JVM to run Garbage Collector. 
    There are two ways to do it : 
-   Using System.gc() method: System class contain static method gc() for requesting JVM to run Garbage Collector.
-   Using Runtime.getRuntime().gc() method: 
    Runtime class allows the application to interface with the JVM in which the application is running. 
    Hence by using its gc() method, we can request JVM to run Garbage Collector.
-   There is no guarantee that any of the above two methods will run Garbage Collector.
-   The call System.gc() is effectively equivalent to the call : Runtime.getRuntime().gc()

-----------------------------------------------------------------------------------------------------
 Covariant return type
-----------------------------------------------------------------------------------------------------

-- covariant return type
-   it was not possible to override any method by changing the return type.
-   But it is possible to override method by changing the return type, 
    if the type is Non-Primitive.
-   example:

    class A {
        A get(){return this;}
    }

    class B extends A {
        @Override
        B get(){return this;} // B is a different return type (covariant return type)
    }


-----------------------------------------------------------------------------------------------------
Interface
-----------------------------------------------------------------------------------------------------

-- Interface
-   A class cannot inherit two interfaces that declare the same default method,
    unless the class overrides them.
-   An object can be assigned to an inherited interface reference variable without an explicit cast.
-   Interface variables are implicitly public, static, and final. Variables cannot be
    declared as abstract in interfaces

--------------------------
Abstract Class
-------------------------

-- Abstract Class
-   An abstract class can contain both abstract and concrete methods, while an interface
    can only contain abstract methods.
-   The AbstractClass class is abstract; therefore, it cannot be instantiated
    Only concrete classes can be instantiated

    ChildClass shape = new AbstractClass();     // does not compile

-   A concrete class can extend an abstract class, and an
    abstract class can extend a concrete class. 
-   The protected, package-private, and public access
    modifiers can each be applied to abstract methods.
-   there is no requirement that an abstract class cannot contain a runnable main() method. 

-----------------------------------------------------------------------------------------------------
Variable
-----------------------------------------------------------------------------------------------------

-- Variable
-   Names can contain letters, digits, underscores, and $ signs                         _letters123$$$
-   Names must begin with a letter                                                      letter
-   Names should start with a lowercase letter and it cannot contain whitespace         letter_whitespace
-   Names can also begin with $ and _                                                   $legal
-   Names are case sensitive ("myVar" and "myvar" are different variables)
-   Reserved words (like Java keywords, such as int or boolean) cannot be used as names

-- Local Variable
-   local variables are not automatically initialized
-   Local variable has no effect, on a same name static instance variable. 

-- Instance Variable
-   Are automatically initialized

-----------------------------------------------------------------------------------------------------
Constructor
-----------------------------------------------------------------------------------------------------

-- Constructor
-   If there is no call to a parent constructor or constructor in the same class, 
    the compiler inserts a no-argument super() call as the first line of the constructor.
    If the parent does not have a no-argument constructor, the no-argument constructor child constructer does not compile. 
-   super() and this() cannot be called in the same constructor. 
-   If a parent class does not include a no-argument constructor, a child class can still
    explicitly declare one; it just has to call an appropriate parent constructor with super()

-----------------------------------------------------------------------------------------------------
Inheritance
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

-- Inheritance
-   Inheritance allows objects to inherit commonly used attributes and methods.
-   Inheritance allows a method to be overridden in a subclass, possibly changing the
    expected behavior of other methods in a superclass

-   If a method is final, I can't be overridden in the child class, it will not compile.
-   If a method is private, I can't be overrides in the child class, it will not compile.

-   You can't change the return type when overriding, except (Covariant) for object return type to another object return type
-   access modifier for method override must be the same or broader. package-private is narrower than protected

        private -> package-private (Default) -> protected -> public

-   A checked exception thrown by a method in the child class must be the same or  
    narrower than the exception thrown by the method in the parent class.
-   The return types must be covariant
-   The access modifier of the method in the child class must be the same or broader than 
    the method in the superclass.
-   The object type relates to the attributes of the object that exist in memory, while the
    reference type dictates how the object is able to be used by the caller

-- Hidden
-   A class that defines an instance variable with the same name as a variable in the parent class is referred as HIDDEN a variable
-    A class that defines a static method with the same signature as static method in a parent class is refered to as Hidden a method


-- Virtual Method
-   only non-static, non-final, and non-private methods are 
    considered virtual and capable of being overridden in a subclass.

-- Polymorphism !!!!!!!!!!!!!!!!!!!!!!!!
-   polymorphism does not apply in the same way it would to methods as it does to variables.
-   the reference type determines the version of the variable that is selected:  

        ParentClass refName = new SubClass();
        refName.variable // get variable from the ParentClass

    
-----------------------------------------------------------------------------------------------------
Switch
-----------------------------------------------------------------------------------------------------

-- Switch
-   A switch statement supports the primitive types byte, short, char, and int 
-   and their associated wrapper classes Character, Byte, Short, and Integer. 
-   It also supports the String class and enumerated types. 
-   Floating-point types like float and double are not supported, nor is the Object class.

-   the value of a case statement must be a literal (primitive types) expression 
-   or a final constant variable, 
-   and have a compatible data type

-----------------------------------------------------------------------------------------------------
underscore in a numeric literal
-----------------------------------------------------------------------------------------------------

underscore in a numeric literal, it must be between two digits  1_2_3
not on the beginning or end                                     _123_



-----------------------------------------------------------------------------------------------------
parseInt()
-----------------------------------------------------------------------------------------------------

-- ParseInt() Method
-   returns an int primitive                            int three = Integer.parseInt("3")
-   Thanks to autoboxing, we can also assign it to      Integer four = Integer.parseInt("4");
    an Integer wrapper class object reference. 
-   The char and short types are smaller than int       short five = Integer.parseInt("5");
    so they cannot store the result. 

-----------------------------------------------------------------------------------------------------
binarySearch
-----------------------------------------------------------------------------------------------------

-- binarySearch
-   input list and search key, returns the index position
-   elements have to be sorted in ascending order.
-   it can be sorted using the method Arrays.sort(arr).
-   Compared to linear search, binary search is considered to be faster. 
-   if an element is searched and not found, the index’s negative value 
    will be returned if that element was present.


-----------------------------------------------------------------------------------------------------
Loops
-----------------------------------------------------------------------------------------------------

-- Loop
-   Every for-each loop can be rewritten as a do-while loop
-   Every fo-each loop can be rewritten as a traditional for loop
-   Every for-each loop can be rewritten as a while loop
-   Variable declared inside a loop can't be used outside the loop
-   ( ; ; i++, j++) {}  Multiple update expressions are separated with a comma rather than a semicolon 
-   while (true);       the loop body is empty due to the semicolon right after the condition.        

-- for- each
-   for ( obj object: array)
-   A for-each loop is allowed to be used with arrays and ArrayList objects.
    StringBuilder is not an allowed type for this loop

-- Continue
-   Breaks of a cycle
-   Continue outLoop;   Breaks of the inner loop and continue the outerLoop
-   Continue innerLoop; Used within an inner loop doesn't effect the flow

-----------------------------------------------------------------------------------------------------
Spelling
-----------------------------------------------------------------------------------------------------

-   == not =    within the condition brackets of a while loop or if-statement (code does not compile)
-   -> not =>   Check lambda syntax
-   no {}       If a loop has no braces, only the first line is looped
-   no static   main() missing static keyword
-   mul-catch   Narrowest exception come first
-   try/catch   Variable name can only be used one's, 
-   String      not string
-----------------------------------------------------------------------------------------------------

-- oop
-   object-oriented project tends to group data and the actions
    related to that data into a single object.
-   .java file, It may define at most one public class.
-   instance variable are   NON static
    Class variable are          static
-   The main() method is static and
    does not have access to any class instance variables. 
-   The javac command compiles into bytecode, which must be run in a 
    Java virtual machine (JVM)
-   variable is declared within the if-then statement block. out of scope
-   Local variable in the main(), with the same name as an instance variable don't share the same value

-----------------------------------------------------------------------------------------------------
Import
-----------------------------------------------------------------------------------------------------

-- import
-   It is pretty beneficial as the programmer do not require to write the entire class definition. 
-   Improves the readability of the program. 
-   

-----------------------------------------------------------------------------------------------------

-- Constructor variable
-   Parameter is a local value
-   A variable inside an constructor with an data type is a local variable
-   A variable inside an constructor without an data type, refers to the instance variable

-----------------------------------------------------------------------------------------------------

-- Encapsulation
-   The protected modifier allows access by subclasses and members within the same pack-
    age, while the package-private modifier allows access only to members in the same package.
    Therefore, the protected access modifier allows access to everything the package-private
    access modifier, plus subclasses.
-   A method with it return inside the if-statement, can't have any code after the return statement.
-   if {true} returns x;        else if (false) { return y;}            still needs an else {return z;}
-   trying to output a void return type in the print() method throws an exception at runtime

-   Java uses pass-by-value to copy primitives and references of objects into a method. That
    means changes to the primitive value or reference in the method are not carried to the call-
    ing method. That said, the data within an object can change, just not the original reference itself

    -   The only variables always available to all instances of the class are those declared static
-   default initialization of a boolean instance variable is false
-   If a class extends another class that has only one constructor that takes a value, then 
    the child class must explicitly declare at least one constructor.
-   A parameter can be final, which means it can't change it value, right after it was declared
-   public static final int name        is the correct order
-   pass-by-value, so changes made to primitive values and object references
    passed to a method are not reflected in the calling method.
-   You can't have a declare a setter method if the variable it final. AFter a final variable is initialized it can be changed
-   import static           right order
-   The value of a static variable must be set when the variable is declared or in a static 
    initialization block.
-   A static variable is always available in all instances of the class
-   static initialization can't block accesses a instance variable
-   (byte)2+1       The addition + operator automatically promotes all byte and short values to int.
-----------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------


*/

public class CheatSheet {

    public static void main(String[] args) {
        
    }
    
}