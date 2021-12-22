/**
 * Inner Classes
 * 
 * - The purpose of nested classes is to group classes that belong together,
 * which makes your code more readable and maintainable.
 * 
 * - To access the inner class, create an object of the outer class, and then
 * create an object of the inner class
 * 
 * - Unlike a "regular" class, an inner class can be private or protected
 * 
 */

public class NestedClass {

    int x = 10;

    protected class InnerClass {

        int y = 5;

        public int z;
        protected int u;
        private int w;

        // default (package-private)
        int v;

        // A member inner class can be marked final
        // If a member inner class is marked private, then it can be referenced only in
        // the outer class for which it is defined.
        private final int k = 69;

    }

    public static void main(String[] args) {

        // Ref Obj: Outer Class
        NestedClass myOuter = new NestedClass();
        System.out.println(myOuter.x);

        // Ref Obj: InnerClass
        NestedClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y);

    }
}
