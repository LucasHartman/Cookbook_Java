/*

Access Modifiers
                                    default     private       protected     public
---------------------------------------------------------------------------------------
Same Class                          Yes         Yes         Yes             Yes
Same package subclass (extends)     Yes         No          Yes             Yes
Same package non-subclass (import)  Yes         No          Yes             Yes
Different package subclass          No          No          Yes             Yes
Different package non-subclass      No          No          No              Yes

------------------------------
this, super
------------------------------

-- Super()
-   Super method call the Constructor from the parent class
-   The super argument(s) invoke the parent constructor
-   No argument super call the default constructor
-   If there is a parent argument constructor and no non-argument constructor
    A non-arguments super() can call any constructor and result in a error.

- The parent default constructor is automatically initiated in the child class
-   Call to super() must be the first statement.


-- super.member
-   super key call a member(variable, method) from the parent class
-   this does not work in a parent class

--  this()
-   To connect constructor's in the same class
-   invoke constructor from the same class
-   this() comes first and can be use in combination with super
-   Initialize an object through multiple constructors

-- this.members
-   Makes sure you invoke the class attribute and not the parameter,
    with the same name

------------------------------
Overload, Override
------------------------------

--  Overload
-   Same name
-   Same parameter
-   May change return type
-   May change access modifier
-   May throw any exception or just nothing
-   Polymorphism applies to overriding, not to overloading

-- Override
-   Same Name
-   Same Parameter
-   Same Return type (or sub-type)
-   May be same or widen access modifier
-   May throw a Unchecked Exception or throw nothing
-   Different class

----------------------------------
Initialization Order
----------------------------------

Static Block 1
Static Block 2
Static Block 3
Init Block 1
Constructor 1           Top to Bottom
Init Block 2
Constructor 2
Init Block 3
Constructor 3

-------------------------------------
Instance, Static
------------------------------------

-- Static
-   Static member is bound to the class
-   Static member can be used in a instance member
-   Static member can't use a instance member
-   Static member can be initialized without using a object reference. Class.members()
-   Class can be imported as static, which allow directly call static members 
-   Static member can't be override, but can be redefined (hidden method)
-   Static members can be access to a object reference variable

--  Instance
-   Instance members are bound to object reference variable
-   Instance members can be initiated multiple times
-   Instance member can invoke a static members
-   Instance member can invoke other instance members
-   Can be override

-------------------------------------
Implicit, Explicit
-------------------------------------

-- Implicit, wide-casting
-   Implicit casting goes from a small ype to a larger type
-   It done automatically
-   Implicit casting doesn't work with Wrapper class (INTEGER, DOUBLE, etc.)

    byte -> short -> int -> long -> float -> double

Explicit, narrow-casting
-   large type to smaller
-   Manually done, (int)longVal;

    double -> float -> long -> int -> short -> byte

-------------------------------------
equals(), == 
-------------------------------------

-- equals()
-   Compares two values
-   returns true or false
-   Enum can be compared using either equals() or ==

-- ==
-   Compare two object (pointer or numerics)
-   return true or false

--  instanceOf()
-   Check if an object is from the same reference type or parent type

-----------------------------------
(Non)-Short-Circuits
----------------------------------

-- Short-Circuits
-   Doesn't check the right side if condition already is meet
-   &&          AND     both side true
-   ||          OR      add least one side it true


--  Non-Short-Circuit
-   ^       XOR     Only one operand must be true
-   !       NOR     Inverts outcome   

----------------------------------
Precedence (UMA REL SA)
----------------------------------


Unary                           -   !   ++  --      negative, invert, increase, decrease  
Multiply, Division, Module      *   /   %
Add, Subtract                   +   -
Relational                      <   >   <=  >=      greater, lesser, greater equal, lesser equal
Equality                        ==  !=
Logical                         &   |   ^
Short Circuit                   &&  ||
Assignment                      =   +=  -=   

------------------------------------
Ternary
------------------------------------

-- Ternary
-   Syntax: condition ? true : false
-   Alternative to an if-statement
-   return type must be the same for both sides

------------------------------------
StringBuilder
------------------------------------

-- StringBuilder
-   Creates a mutable string

--  Method
val.append("txt");          // add String
val.insert(1,"string")      // append add index pos
val.replace(1,6)            // append between start- end- index
val.delete(1,6)             // delete between start- end- index
val.reverse()               // reverse StringBuilder
val.capacity()              // return character storage size
val.ensureCapacity()        // set minimum storage size
val.charAt()                // get character add selected index
val.length()                // size
val.subString()             // get a piece of the string form start index
val.subString()             // get a piece of the string from start- end- index

-----------------------------------
Time Methods
-----------------------------------

-- java.time.LocalDate
-   years       yyyy
-   month       MM
-   day         dd
LocalDate obj =             LocalDate.now();
DateFormatter formatObj =   DateFormatter.ofPattern("dd-MM-yyyy");
String formatDataObj =      obj.format(formatObj); 


-- java.time.LocalTime
-   hour        HH
-   minutes     mm
-   seconds     ss
-   nanoseconds ns
LocalTime obj =         LocalTime.now();
TimeFormatter formatObj TimeFormatter.ofPattern(HH-mm-ss-ns);


-- java.time.LocalDateTime
years       yyyy
month       MM
day         dd
hour        HH
minutes     mm
seconds     ss
nanoseconds ns
-   LocalTimeDate obj       = LocalTimeDate.now();
-   DateFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:ns");

--------------------------
Lambda
--------------------------

-- Lambda
-   Lambda is a tye of method that can be invoke in a variable, method
-   Syntax:    Predicate<String> name = s -> function;


-- Function
-   The Function can declare 1 input and return type
-   Syntax:     Function<T,R> name = (input, return) -> function;
-   Caller      name.apply();
-   Argument    any
-   Return      any


-- Supplier
-   The Supplier has no input, but can return any type
-   Syntax:     Supplier<T> name = ()) -> function;  
-   Caller:     name.get();
-   Argument:   non
-   Return:     Any


-- BinaryOperator
-   The BinaryOperator has 2 inputs and a return of the same type
-   Syntax:     BinaryOperator<T,T> name = (t, t) -> function;
-   Caller:     name.apply(t,t);
-   Argument:   2 any
-   return:     any


-- Predicate
-   Predicate has one input and returns a boolean
-   Syntax:     Predicate<T> name = T -> function;
-   Caller:     name.test(t)
-   Return:     boolean type


-- Consumer
-   Consumer has one input and no return value
-   Syntax:     Consumer<T> name = T -> Function
-   Caller:     any
-   Return:     non


---------------------------
(Un)Checked Exception
---------------------------

-- Checked Exception
-   Checked exceptions are checked at compile-time.
-   It should handle the exception using try-catch or
    it should declare the exception using throws keyword.
-   Or it wound compile

-   Object.Throwable.Exception.CheckedException.
-   IOException  
-   ClassNotFoundException
-   SocketException
-   SQLException

-- Unchecked Exceptions
-   An unchecked exception is the one which occurs at the time of execution.
-   These are also called as Runtime Exception.
-   Runtime exception are ignored at compile time.
-   This Exception occurs due to bad programming.
-   Runtime Exceptions can be handled with the try-Catch Block.

-   Object.throwable.Exception.RuntimeException.
-   NullPointerException


*/



public class BrainCheck {
    
}
