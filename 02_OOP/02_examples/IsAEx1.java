
/*
--  IS-A
-   IS-A is based on inheritance (or interface implementation)
-   IS-A is a way of saying, “This thing IS A type of that thing.”
-   Example: Child is a type of that parent
-   You express the IS-A relationship in Java through the keywords 
    -   extends     (for class inheritance) and
    -   implements  (for interface implementation).


Learn more: Design Patterns
Source:     https://www.javatpoint.com/design-patterns-in-java
*/

interface MyInterface1 {

    void myAbstract1();
}


// Myinterface2 IS-A MyInterface2
interface MyInterface2 extends MyInterface1 {

    void myAbstrac2();
}


// IsAEx1 IS-A MyInterface1
// IsAEx1 IS-A MyInterface2
public class IsAEx1 implements MyInterface1 {

    public static void main(String[] args) {

        IsAEx1 obj = new IsAEx1();
        obj.myAbstract1();
        obj.myAbstract2();
    }

    public void myAbstract1() { System.out.println("ola"); }

    public void myAbstract2() { System.out.println("ahoy"); }

}