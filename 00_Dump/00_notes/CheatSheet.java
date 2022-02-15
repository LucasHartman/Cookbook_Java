/*
----------------------------------------------------------------------------------------------------- 
Access Modifiers
----------------------------------------------------------------------------------------------------- 

-- protected
-   The protected and default access control levels are almost identical, 
    but with one critical difference.
-   protected member can be accessed (through inheritance) by a subclass 
    even if the subclass is in a different package. 

    
-- Package (Default)
-   Default protection is what you get when you DON'T type an access modifier 
    in the member declaration.
-   A default member may be accessed only if the class accessing the member belongs to the same package
-   The default and protected access control types have almost identical behavior, 
    except for one difference


--  Access Methods
-    getters and setters, other terms accessors and mutator's
-   The point is, you can change your mind later 
    and add more code to your methods without breaking your API.


----------------------------------------------------------------------------------------------------- 
this, super
-----------------------------------------------------------------------------------------------------

--  super()
-   It is used to invoke Parent class constructor from Child
-   It must be used only inside Child’s constructor.
-   Call to super() must be the first statement.
-   Used to initialize parent class object in the process of child object creation.


--  this()
-   It is used to invoke current class constructor
-   It must be used only inside another constructor of same class.
-   Call to this() must be the first statement.
-   To connect constructors in a single class.
-   Used to initialize an object via multiple constructors.


-- this
-   this(10 ,20);       Invoke constructor inside a constructor.
-   return this;        return the current class instance in a method
-   myMethod(this)      input class instance method or constructor
-   this.myMethod();    Invoke method inside a method
----------------------------------------------------------------------------------------------------- 
Override, Overload
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
-   MAY narrow access modifier, but not widen
-   IF super-class method does not throw an exception,
    subclass overriding method can only throws the unchecked exception,
    throwing checked exception will lead to compile-time error.
-   IF super-class method throws an exception,
    subclass overriding method can only throw same or subclass exception
-   ALSO there is no issue if subclass overridden method is not throwing any exception.

-   default methods inside the interface can be overridden
-   static  methods can't be overridden
-   Private method can't be overridden
-   Final   methods can't be overridden
-   instance variables can't be overridden, they are there own value


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
-   Static method CAN'T access an instance  method or variable
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

    --  Implicitly Casting | Widen Casting |
    -   Converting lower -> higher data types
    -   Automatically
    -   The conversion between numeric data type to char or Boolean is not done automatically.

         byte -> short -> int -> long -> float -> double


    --  Narrowing Casting | Explicit Casting | 
    -   Converting higher -> lower data types
    -   Manually (by the programmer)
    -   If we do not perform casting the compiler reports a compile-time error.

         double -> float -> long -> int -> short -> byte  


-----------------------------------------------------------------------------------------------------
equals(), ==, instanceof()
-----------------------------------------------------------------------------------------------------

--  == operator
-   ==              operator compares   object   (Object == Object)
-   Reference comparison
-   Checks if both references points to same location or not.


--  equals()
-   equals()        method compares     value    (String.eqaults(String)
-   equals() method should be used for content comparison
-   Evaluates the content to check the equality.
-   An enum can be compared using either equals() or ==.


-- instanceof comparison 
-    The instanceof operator is used for object reference variables only
-   Same type or same Parent type
-   implements and extends instance the parent class


-----------------------------------------------------------------------------------------------------
(Non)-Short-Circuit
-----------------------------------------------------------------------------------------------------

    Non-Short-Circuit (& |) 
    - they evaluate both side of the expression, ALWAYS!
    even if the first operant (left side) is false, the second operant will still be evalued.
    &       AND       both must be true
    |       OR        at least one must be true
    ^       XOR       Only one operand must be true.
    !       NOR       inverts the outcome


    Short-Circuited (&& ||) 
    - Meaning they don't evaluate the right hand side if it that doesn't necessary
    Example:  
    if left hand side is false no need to evaluate right hand side one. 
    -  short-circuiting operators can be slightly slower because they cause branching in the program execution


-----------------------------------------------------------------------------------------------------
Precedence
-----------------------------------------------------------------------------------------------------

_________________________________________________________________________________________________________________________________
1. Unary Operators                         -      !      ++,    --          negative    invert      increment
2. Multiplication, division, modulus        *      /      %                 multiple    division     remainder
3. Addition, subtraction                   +      -                         add         subtract
4. Relation operators                      <      >      <=    >=           greater     lesser      lesser-equal     greater-equal
5. Equality operators                      ==     !=                        equal       not-equal
6. Logical operators (non-circuit)         &      |                         AND         OR
7. Short-circuit                           &&     ||                        AND         OR
8. Assignment operators                    =      +=      -=                equal       plusEqual   minusEqual


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

-----------------------------------------------------------------------------------------------------
Time Methods
-----------------------------------------------------------------------------------------------------

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

                                                    
-- Predicate
-   The Predicate interface has an abstract method test
-   Gives a Boolean value as a result
-   Abstract Method Name:       test 
-   Argument:                   any type
-   Return:                     boolean type 
-   public interface Predicate  { public boolean test(T  t); }


-- BinaryOperator
-   The BinaryOperator interface has an abstract method
    apply which takes two argument and return a result of same type. 
- Abstract Method Name:             apply
- Argument;                         2 any types
- return:                           same as argument
- public interface BinaryOperator   { public T apply(T x, T y); } 


-- Function 
-   The Function interface has an abstract method apply which takes argument of 
    type T and returns a result of type R. 
-   Abstract Method Name:    apply
-   Argument;                any
-   return:                  any


-- Supplier 
-   The Supplier functional interface has an abstract method "get"
-   Supplier is a functional interface; it takes no arguments and returns a result. 
-   Abstract Method Name:    get
-   Argument;                none
-   return:                  any 
-   public interface Supplier<T> { T get(); }
 
-- Consumer 
 -  The Consumer functional interface has an abstract method "accept"
-   Consumer is a functional interface; it takes one arguments and returns nothing.
-   Often uses for print a message 
-   Abstract Method Name:    accept
-   Argument;                any
-   return:                  none 
-   public interface Consumer { void accept(T t) }

-----------------------------------------------------------------------------------------------------
(Un)Checked Exception
-----------------------------------------------------------------------------------------------------

-- Checked Exceptions
-   Checked exceptions are checked at compile-time.
-   it should handle the exception using try-catch block or 
    it should declare the exception using throws keyword.
-   otherwise the program will not compile

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


-----------------------------------------------------------------------------------------------------

-----------------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------------

-----------------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------------

-----------------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------------

-----------------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------------

-----------------------------------------------------------------------------------------------------

*/

public class CheatSheet {
    
}