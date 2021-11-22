

public class methodExam {

    // Void method with return statement
    public void methodA() {
        System.out.print("this code is legal, its a void method with a return statement, but does not return a value");
        return;
    }

    // 5. method calls return 2
    public int howMany(boolean b1, boolean...b2) {
        return b2.length;
    }

    public static void main(String[] args) {

        methodExam obj = new methodExam();

        obj.methodA();


        // 5. legel input
        int howwMany1 = obj.howMany(true, true, true);
        int howwMany2 = obj.howMany(true, new boolean[2]);


        // You can use accesss modifirs to allow access to all methods and not any instance variables.
        // Projected access allows everything that package-private access allows and additionally allows subclasses access.
        // Encapsulation allows using methods to get and set instance variables so other calssea are not directly using them,
        // Encapsulation, uses private instance variables

        // instance initializer:       Bike7 b1=new Bike7();  
        // static initializer:         static { LENGTH=10 }

        // legal static import:         import static java.util.Collections.*;

        //  Instance variables must include the private access modifier,
        // Both static methods and static variables are shared by all instances of the class. 

        // referenced from outside the class, they are called using the classname—for example, 
        // StaticClass.method()

        // Instance members are allowed to call static members, but static members are not allowed to call instance members. 



        
    


    }
    
}
