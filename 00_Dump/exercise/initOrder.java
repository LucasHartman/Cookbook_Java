/*
-- Exercise
-   Write a abstract class A , class B extends abstract class A and class initOrder extends class B
- Als have a constructor, static block and init block
- Find out the order of initialization

-- Order
    Static block A
    Static block B
    Static block C
    Init block A
    Constructor A
    Init block B
    Constructor B
    Init block C
    Constructor C
*/


abstract class A {
    static { System.out.println("Static block A"); }
    { System.out.println("Init block A"); }
    A() { System.out.println("Constructor A"); }
    
}

class B extends A {
    static { System.out.println("Static block B"); }
    { System.out.println("Init block B"); }
    B() { System.out.println("Constructor B"); }
    
}

public class initOrder extends B {
    static { System.out.println("Static block C"); }
    { System.out.println("Init block C"); }
    initOrder() { System.out.println("Constructor C"); }
    

    public static void main(String[] args) {
        new initOrder();
    }
    
}
