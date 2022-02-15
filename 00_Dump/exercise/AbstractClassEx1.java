/*
-- Exercise
-   Create an Abstract Class with all possible properties

-- Properties of an abstract class:
-   An abstract can have an abstract and a non-abstract method.
-   It must be declared with an abstract keyword.
-   It can have a constructor, static method.
-   It can have a final method that prevents child class of abstract class not to change the body of the method
-   The abstract method contains no-body or in simple words, you can say that you can’t define an abstract method inside an abstract class. We can define an abstract method inside the derived class of its abstract class.
-   The object of the abstract class can’t be instantiated it means you can’t create an abstract class object directly but you can create its object by reference to its child class.

Procedure:

    If you define your own constructor with arguments inside an abstract class but forget to call your own constructor inside its derived class constructor then JVM will call the constructor by default.
    So if you define your single or multi-argument constructor inside the abstract class then make sure to call the constructor inside the drive class constructor with the super keyword.

Implementation: Here in this program, we are going to multiply two numbers by using the following above approach as mentioned.

Step 1: We create an abstract class named ‘Content’ and define a user define a constructor with one argument, variable with name ‘a’, and an abstract method named as ‘multiply’

Step 2: We create a class that must be derived from this abstract class ‘Content’ named ‘GFG’. Inside GFG class we are going to define a constructor and inside the method call the parent class constructor by using the super keyword and define the abstract method of its parent class in it.

Step 3: Now in the main class of our function that is ‘GeeksforGeeks’ here, where we will create an object of abstract class ‘Content’ by reference to its derived class object. Then we call the method of the abstract class by its object.

Step 4: Inside the method, we multiply both the value stored in the different variable names where one of the variables is the variable of an abstract class. We can access the variable of the abstract class by its derived class object.

-- Nots:
-   add abstract keyword to a abstract method
-   initialize a static variable not in a constructor, but a static block
-   You don't use the this keyword in a static block
*/

abstract class AbstractClass {

    int instanceVar;
    static int staticVar;

    static { staticVar = 1; }

    AbstractClass(int x) {
        this.instanceVar = x;  
    }
    
    abstract void abstractMethod(int x);

    void nonAbstractMethod(int x) { System.out.println(x); }
    static void staticMethod() { System.out.println("I'm a static method"); }
    final void finalMethod() { System.out.println("A method that can't be overridden"); }
}

public class AbstractClassEx1 extends AbstractClass {

    AbstractClassEx1() {
        super(1);
    }



    public void abstractMethod(int x) {
        System.out.println("This abstract method is now a concrete method, why, because I see so");
    }

    
    public static void main(String[] args) {
     
        AbstractClass obj = new AbstractClassEx1();

        System.out.println(obj.instanceVar);
        System.out.println(staticVar);
        obj.abstractMethod(1);
        obj.nonAbstractMethod(1);
        staticMethod();
        obj.finalMethod();

    }

}
