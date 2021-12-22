/**
 * Inheritance
 * 
 * In Java, it is possible to inherit attributes and methods from one class to another. 
 * We group the "inheritance concept" into two categories:
    subclass (child) - the class that inherits from another class
    superclass (parent) - the class being inherited from

 * - Inheriting a class gives you access to all of the public and protected
 * members of the class. 
 * 
 * - It also gives you access to package-private 
 *   members of the class if the classes are in the same package.
 * 
 * - 
 * 
 *  multilevel single-inheritance pattern
 * - every class has exactly one direct parent class, with all classes
 *   eventually inheriting from java.lang.Object
 * 
 * 
 * 
 * 
 */



/* Superclass (parent)
- the class being inherited from
- If you don't want other classes to inherit from this class, use the final
*/
class ParentClass {

    // protected variable
    //acces within the same package or outside the package through inheritence only
    protected String parentVariable = "Hey";

    // public method
    public void parentMethod() {
        System.out.println("I'm on vacation in the childClass, how fun!");
    }


}


/* Subclass (child)
- The class that inherits from another class
-  all public and protected members are automatically available as part of the child class.
- child has exactly one parent.
- 
*/
public class Inheritance extends ParentClass {

    String childVariable = "I live in the ChildClass, never seen the ParentClass";

    public static void main(String[] args) {

        // Create subclass object
        Inheritance parent = new Inheritance();

        // call parent method
        parent.parentMethod();

        // displayer parent variable
        System.out.println("this is the value of a variable from the parentclass: "+parent.parentVariable);
        
        // displayer chld variable
        System.out.println("this is the value of a variable from the childclass: "+parent.parentVariable);
        
    }

}

