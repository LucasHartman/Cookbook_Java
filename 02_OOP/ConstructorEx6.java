
/*
-- Constructors
-    Java only inserts a no-argument constructor if there are no other constructors in the class
-    If a class extends a parent class that does not include a no-argument constructor,
    the default no-argument constructor cannot be automatically inserted into the child class
    by the compiler.
*/

class Forest {
    public long treeCount;

    public Forest() {} // add a no-argument constructor to compile

    public Forest(long treeCount) {
        this.treeCount = treeCount+2;
    }
}

public class ConstructorEx6 extends Forest {
    
    public ConstructorEx6(long treeCount) {
        this.treeCount = treeCount+1;       // this.child_class_instance_variable
    }


    public static void main(String[] birds) {
        System.out.print(new ConstructorEx6(5).treeCount); // 6
    }
}
