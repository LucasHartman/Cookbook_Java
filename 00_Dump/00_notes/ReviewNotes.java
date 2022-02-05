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


--------------------------------------------------------------------------
--------------------------------------------------------------------------






*/