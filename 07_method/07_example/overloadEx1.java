/*
--  Overloaded methods
-   Must have different arguments
-   May have different access modifiers (public, protected, etc.)
-   May throw different exceptions
-   Methods from a supertype can be overloaded in a subtype
-   Polymorphism applies to overriding, not to overloading
-   Object type (not the reference variable’s type) determines which overridden method is used at runtime
-   Reference type determines which overloaded method will be used at compile time.  
*/

class Alpha {

    // arg(vararg)
    public void bar(int...x) {}
    
    // arg(int)
    public void bar(int x) {}
}

public class overloadEx1 extends Alpha {

    // OVERRIDDEN method in sublcass (Same name, same parpatermets & return type)
    public void bar(int x) {}

    // arg(String)
    public int bar(String x) { return 1; }

    // arg(int, int)
    public void bar( int x, int y) {}

}
