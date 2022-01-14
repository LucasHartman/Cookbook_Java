
/*

14/01 ---------------------------------------------------------------------------------------------------

--  Hidden Method
-   private final String doStuff() { return "stuffff"; }
-   The doStuff() method in the sub class does not override the version in the parent
    class since the method is not visible to the parent class.

--  Override Final
-   You cant inherit and override a final methid, unless its is hidden(private)



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