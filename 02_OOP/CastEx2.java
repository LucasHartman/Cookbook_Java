/*
--  Typecast Objects
-   The casting of object references depends on the relationship of the classes involved in the same hierarchy

--  downcast
--  root class -> child class
-   cast a reference along the class hierarchy in a direction from the root class towards the children or subclasses

--  upcast
-   child class -> root class
-   cast a reference along the class hierarchy in a direction from the sub classes towards the root

-- implicit cast 
*/


class Alpha {
    public void foo( String...args) {
        System.out.println("Alpha : foo");
    }

    public void bar( String a) {
        System.out.println("Alpha : bar");
    }
}



class CastEx2 extends Alpha {

    // Overloaded class
    public void foo( String a) {
        System.out.println("Beta : foo");
    }

    // Overriden class
    public void bar( String a) {
        System.out.println("Beta : bar");
    }

    public static void main(String[] args) {

        Alpha a = new CastEx2();    // Implicit Cast
        a.foo("test");              // Alpha : foo  foo(String...args is first option)
        a.bar("test");              // Beta : bar

        CastEx2 b = (CastEx2)a;     // Explicit (refering to the CastEx2 object)
        b.foo("test");              // Beta : foo
        b.bar("test");              // Beta "bar"

        ((CastEx2)a).foo("test");   // Beta: foo
    }
}