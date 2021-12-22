/**
 *  polymorphism 
 * - means having many forms
 * 
 * 
 * Compile time Polymorphism
 * - known as static polymorphism
 * - achieved by function overloading
 * - Method Overloading: When there are multiple functions with same name but different parameters
 * - Functions can be overloaded by change in number of arguments or/and change in type of arguments.
 * 
 * Runtime Polymorphism
 * - It is also known as Dynamic Method Dispatch
 * - It is a process in which a function call to the overridden method is resolved at Runtime.
 * - This type of polymorphism is achieved by Method Overriding.
 * 
 * 
 * 
 * LOOKUP;
 *  -  If the type of a method argument is an interface, 
 *     then a reference variable that implements the interface may be passed to the method
 * 
 * - By defining a final instance method in the superclass, 
 *   you guarantee that the specific method will be called in the parent class at runtime.
 * 
 * - It cannot be determined until runtime which overridden method will be executed in a parent class.
 * 
 * - Marking a method final prevents it from being overridden or hidden
 * 
 * - The reference type of the variable determines which hidden method will be called at runtime
 * 
 */

class Parentclass {

    // Method 
    static int Multiply(int a, int b) { return a * b;}
    // Method Overloaded (Compile time Polymorphism)
    static double Multiply(double a, double b) { return a * b;}

    // Method
    void Print() { System.out.println("parent class"); }
}



public class Polymorphism extends Parentclass {

    // Runtime Polymorphism
    @Override
    void Print() { System.out.println("child class"); }

    public static void main(String[] args) {
    
        // static assignment (Compile time Polymorphism)
        System.out.println(Parentclass.Multiply(2, 4));
        System.out.println(Parentclass.Multiply(5.5, 6.3));


        // Runtime Polymorphism
        // reference child class
        Parentclass obj = new Polymorphism();
        obj.Print();



        



    }
    
}
