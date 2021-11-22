import java.util.ArrayList;
import java.util.List;

/**
 * Overriding
 * 
 * - Overriding is a feature that allows a subsclass to provide a specific
 * implementation of a method this is already provided by one of its
 * parentclass..
 * 
 * - method in a subclass has the same NAME, same PARAMETERS (Signature) and
 * RETURN TYPE
 * 
 * - The access modifier for an overriding method can allow more, but not less,
 * access than the overridden method.
 * 
 * - Private methods can not be overridden
 * 
 * - Static methods can not be overridden, check Hidding Method for more on that
 * 
 * Must not throw new or broader checked exceptions
 * 
 * May throw fewer or narrower checkd excpetions, or any unchecked expceptions
 * 
 * final methods cannot be overriden.
 */

class Superclass {

    // Protected Method
    protected String myMethod(int x) {
        System.out.println("life is good in the superclass");
        return null;
    }

    protected List<String> hairy(int p) {
        return null;
    }
}

public class Overriding extends Superclass {

    // Overriden Method
    // Same nane, paramters, return, but more access
    @Override
    public String myMethod(int x) {
        System.out.println("overriden methods can allow more, but not less access");
        return null;
    }

    // Override Method
    // This is legal, because ArrayList is a subtype of List
    @Override
    public ArrayList<String> hairy(int p) {
        return null;
    }

    public static void main(String[] args) {

        Superclass obj1 = new Superclass();
        obj1.myMethod(1);

        Superclass obj2 = new Overriding();
        obj2.myMethod(2);
    }

}
