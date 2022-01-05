
/*
--  Constructor
-   You CANNOT make a new object without invoking a constructor.
-   alo the constructor of each of its superclasses!
-   But just because a class must have a constructor doesn’t mean the programmer has to type it. 
-   Constructors are the code that runs whenever you use the keyword new.
-   constructors are that they have no return type, and their names must exactly match the class name. 

--  Constructor Rules
-   Constructors can use any access modifier, including private (only in class).
-   Same name as class
-   no return type
-   legal (but stupid), method with the same name as the constructor
-   if you don't type a constructor into your class code, a default construcotr will be automatically generated
-   The default constructor is a no-arg constructor
-    Every constructor has, as its first statement, either a call to an overloaded constructor
    (this()) or a call to the superclass constructor (super())
-    If you do type in a constructor (as opposed to relying on the compiler-generated default
    constructor), and you do not type in the call to super() or a call to this(), the compiler will
    insert a no-arg call to super() for you as the very first statement in the constructor??????????
-   A call to super() can either be a no-arg call or can include arguments passed to the super constructor.
-   A no-arg constructor is not necessarily the default (that is, compiler-supplied)
    constructor, although the default constructor is always a no-arg constructor. The default
    constructor is the one the compiler provides! Although the default constructor is always a no-
    arg constructor, you’re free to put in your own no-arg constructor.??????
-   You cannot make a call to an instance method or access an instance variable until after
    the super constructor runs.??????
-   Only static variables and methods can be accessed as part of the call to super() or
    this(). (Example: super(Animal.NAME) is OK, because NAME is declared as a static
    variable.)???????
-   Abstract classes have constructors, and those constructors are always called when a
    concrete subclass is instantiated.??????
-   Interfaces do not have constructors. Interfaces are not part of an object’s inheritance tree.
-   The only way a constructor can be invoked is from within another constructor. In other
    words, you can’t write code that actually calls a constructor.
-   Constructoer can be inherited. They aren't methods. The can't be overridden
*/ 

class A {

    A() { System.out.println("A"); }
}

class B extends A {

    B() { System.out.println("B"); }
}

class C extends B {

    C() { System.out.println("C"); }
}

class ConstructorEx1 extends C {

    ConstructorEx1() { System.out.println("ConstructorEx1"); }

    public static void main(String[] args) {

        // Constructor Chaining
        ConstructorEx1 obj = new ConstructorEx1(); // A B C ConstructorEx1
    }
}