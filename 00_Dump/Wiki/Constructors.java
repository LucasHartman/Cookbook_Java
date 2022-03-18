/*

-- Sub Class Constructors
-    Must ALWAYS call to this() or super()
-   this() or super() must match a constructor
-   If parent class has an argument-constructor, 
    the subclass must have a constructor calling that construct
*/

class Parent {
    Parent(int x) { super(); } // explicit constructor
}

class Child extends Parent {
    Child(int x, int y) { super(1); } // calling super constructor

    Child() {this(1,2); } // calling overloaded constructor
}

public class Constructors extends Child {
    public static void main(String[] args) {
        
    }
    
}
