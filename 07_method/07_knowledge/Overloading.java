/**
 * 
 * Overloaded methods...
 * 
 * Must have different arguemtns list
 * 
 * May have different access modifiers
 * 
 * May throw different exceptions
 * 
 * Methods from a supertype can be overloaded in a subtype
 * 
 * Polymorphism applies to overriding, not to overloading
 * 
 * Object type (not the reference variable’s type) determines which overridden
 * method is used at runtime
 * 
 * Reference type determines which overloaded method will be used at compile
 * time.
 * 
 * objectType name = new ReferenceVariable();
 * 
 * 
 * 
 */

public class Overloading {

    // int
    public void fly(int numMiles) {
    }

    // short
    public void fly(short numFeet) {
    }

    // boolean + return
    public boolean fly() {
        return false;
    }

    // int & short
    void fly(int numMiles, short numFeet) {
    }

    // short, int and exceptoin handeling
    public void fly(short numFeet, int numMiles) throws Exception {
    }

    // int[]
    public void fly(int[] lengths) {
    }

}
