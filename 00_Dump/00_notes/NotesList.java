/*
--------------------------------------------------------------------------
--------------------------------------------------------------------------

--  List Reference Examples
    List frisbees = new  List ();       // wrong
    List frisbees = new  Object ();     // wrong
    List frisbees = new  ArrayList ();  // Right
-   List is an interface and not a class.
-   While Object is a concrete class, 
    it does not implement the List interface so it cannot be assigned to frisbees. 
-   Since List is an interface, objects cannot be created of the type list.
    We need a class implements th e

--  Reference Variable
-   Source: https://www.geeksforgeeks.org/reference-variable-in-java/
-   Syntax: Demo D1 = new Demo();
-   When we create an object (instance) of class the space is reserved in head memory.
-   how to access that space?
-   We create a Pointing element or simple called Reference variable,
    which simply points out the Object(the created space in a Heap Memory).

--  Heap memory
-   Source: https://www.javatpoint.com/java-heap
-   In Java, heap is a chunk of memory which is shared among all threads.
-   In a heap, all class instances and the array is allocated.
-   It is created when JVM starts-up.
-   An automatic storage management system reclaims head.

--  Object class
-   Source: https://www.javatpoint.com/object-class
-   The Object class is the parent class of all the classes in java by default.
-   The Object class is beneficial if you want to refer any object whose type you don't know.
-   Notice that parent class reference variable can refer the child class object, 
    know as upcasting.

--  List Interface
-   Source:    https://www.geeksforgeeks.org/list-interface-java-examples/
-   The List interface provides a way to store the ordered collection
-   List is a child interface of Collection
    ArrayList (Class) ---implements---> List (Interface) ---Extends---> Collection
-   It is an ordered collection of object in which duplicate values can be stored.
-   Since List preserves the insertion order, 
    it allow positional access and insertion of elements.

--  Generic Method
-   Source: https://www.javatpoint.com/generics-in-java
-   Generics mean parameterized types.
-   Type-safety:    We can hold only a single type of objects in generics. 
-   Without Generics, we can store any type of objects.
        List list = new ArrayList();
        list.add(10);       // integer
        list.add("10");     // String
-   With Generics, it is required to specify the type of object we need to store:
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add("10"); // compile-time error

--  Diamond Operator
-   Source:    https://www.baeldung.com/java-diamond-operator
-   Generics:   Which allowed us to parameterize the type arguments for classes.
-   Specify the parameterized type in the constructor:
    List<String> cars = new ArrayList<String>();
-   Most suitable constructor declaration:
    List<String> cars = new ArrayList<>();

--  Collections API
-   Source: https://www.geeksforgeeks.org/collections-in-java-2/
-   The API has a basic set of interfaces like Collection, Set, List, 
    or Map, all the classes (ArrayList, LinkedList, Vector, etc) 
    that implement these interfaces have some common set of methods.
-   

--  Set Interface
-   Extends the Collection Interface
-   Methods:
1 	        add( )          Adds an object to the collection.
2 	        clear( )        Removes all objects from the collection.
3 	        contains( )     Returns true if a specified object is an element within the collection.
4 	        isEmpty( )      Returns true if the collection has no elements.
5 	        iterator( )     Returns an Iterator object for the collection, which may be used to retrieve an object.
6 	        remove( )       Removes a specified object from the collection.
7 	        size( )         Returns the number of elements in the collection.

-- List Interface
-   Extends the Collection Interface
-   Methods
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
6 	        ListIterator listIterator( )
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


--  java.lang.StringBuilder
-   Source: https://www.javatpoint.com/StringBuilder-class
-   Methods:
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

--  StringBuilder capacity() method
-   Source: https://www.geeksforgeeks.org/stringbuilder-capacity-in-java-with-examples/
-   The capacity refers to the total amount of characters storage size in string builder.
-   The default capacity of a String builder equals 16  
-   if you append something like Geek (inside the capacity) the capacity remains 
-   if it goes over like a String of 28 character, the capacity equals 28

--  String
-   Source: https://www.w3schools.com/java/java_ref_string.asp
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


--------------------------------------------------------------------------
METHOD CHAINING
--------------------------------------------------------------------------

-- Method Chaining
-   Source: https://www.geeksforgeeks.org/method-chaining-in-java-with-examples/
-   Syntax: obj.method1().method2().method3(); 
-   Method Chaining is the practice of calling different methods in a single line
-   Each method in chaining returns an object.
-   If we have on object and we call methods on that object one after another

--  this() VS return this VS this parameter VS this.myMethod()
Source: https://www.geeksforgeeks.org/this-reference-in-java/
this(10 ,20);       Invoke constructor inside a constructor.
return this;        return the current class instance in a method
myMethod(this)      input class instance method or constructor
this.myMethod();    Invoke method inside a method


--------------------------------------------------------------------------
LAMBDA
--------------------------------------------------------------------------

--  Lambda
-   Source: https://www.w3schools.com/java/java_lambda.asp
-   Syntax: 
            parameter -> expression
            (parameter1, parameter2) -> expression
            (parameter1, parameter2) -> {code block}
-   Lambda expressions are similar to methods,
    but they do not need a name and they can be implemented right in the body of a method
-   Lambdas use deferred execution:
    you can pass around so that it can be executed later, 
    just once or multiple times."
-   If the lambda expression needs to return a value, 
    the code block should have a return statement.
-   When creating a lambda with only one parameter, there are a few variants. 

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

--------------------------------------------------------------------------
TIME
--------------------------------------------------------------------------

--  java.time.LocalTime
-   Source: https://www.javatpoint.com/java-localtime
-   LocalTime class is an immutable class 
-   It represents time with a default format of hours-minutes-second.
-   minusNanos and plusNanos are the smallest units available 
-    The Java 8 date and time classes are immutable. This means they do not contain setter 
-   Methods:
1.  LocalDateTime atDate(LocalDate date)        append local data to local time
                                                2018-12-05T09:32:42
2.  int compareTo(LocalTime other)              compare 2 times
                                                return 1 is greater
                                                return 0 if equal
                                                return -1 if less
                                                int value = time1.compareTo(time2);
3.  String format(DateTimeFormatter formatter)  Define time pattern
    source: https://howtodoinjava.com/java/date-time/java-date-formatting/
4. int get(TemporalField field)                 gets the value of the specified field
                                                form this time as an int
                                                LocalTime time = LocalTime.parse("12:30:30");
                                                System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_DAY)); // 12    
5. Local Time minusHours(long hoursToSubtract)  return copy of this LocalTime
                                                with the specified number of minutes subtracted
                                                LocalTime time = LocalTime.parse("12:30:30");
                                                System.out.println(time.minusMinutes(2)); // 12:28:30
6.  static LocalTime now()                      obtain the current time from the system clock
                                                in the default time-zone
                                                LocalTime time = LocalTime.now();
7.  static LocalTime of(int hour, in minutes, int second)
                                                obtains an instance of LocalTime from 
                                                year, month, day, hour, minute, second and nanosecond.
                                                LocalTime time = LocalTime.of(6,30,40,50000);
                                                System.out.println(time); // 06:30:40.000050
8.  LocalTime plusHours(long hoursToAdd)        return cop of this LocalTime
                                                plus the specified hours added        
9. LocalTime plusMinutes(long minutesToAdd)     return cop of this LocalTime
                                                plus the specified minutes added        

--  java.time.LocalDate
-   Source: https://www.javatpoint.com/java-localdate
-   Java LocalDate class is an immutable class that represents Date 
    with a default format of yyyy-mm-dd.

--  java.time.LocalDateTime
-   Source: https://www.javatpoint.com/java-localdatetime
-   Java LocalDateTime class is an immutable date-time object that represents a date-time,
    with the default format as yyyy-MM-dd-HH-mm-ss.zzz.

--  java.time.Period
-   Source: https://www.javatpoint.com/java-period
-   The  Period class creates immutable objects and is usually used to add/subtract from a 
    LocalDate or LocalDateTime object. It allows creating date, week, month, or year periods.

-- java.time.format
-  Source:  https://docs.oracle.com/javase/8/docs/api/java/time/format/package-summary.html
-   Provides classes to print and parse dates and times. 
-   When creating a formatter object, remember that MM represents month while mm represents minute.


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