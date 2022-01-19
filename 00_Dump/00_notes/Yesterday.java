
/*
19/01 ---------------------------------------------------------------------------------------------------



18/01 ---------------------------------------------------------------------------------------------------

CHAPTER 01

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