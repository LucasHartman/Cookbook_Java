/*

-- Sub Class Constructors
-    Must ALWAYS call to this() or super()
-   this() or super() must match a constructor
*/

class Parent {
    Parent(int x) { super(); }
}

class Child extends Parent {
    Child(int x, int y) { super(1); } 

    Child() {this(1,2); }
}

public class Constructors extends Child {
    public static void main(String[] args) {
        
    }
    
}
