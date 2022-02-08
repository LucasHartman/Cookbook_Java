
abstract class A {

    static { System.out.println("1 super static block"); }

    { System.out.println("3 super instance block"); }
}

class C extends A {

    C() { System.out.println("5 class constructor");}

    static { System.out.println("2 sub static block"); }

    { System.out.println("4 sub instance block"); }
}

public class OrderOfExcutionEx1 extends C {
    public static void main(String[] args) {
        OrderOfExcutionEx1 obj = new OrderOfExcutionEx1();
        
        /*
        1 abstract static block
        2 class static block
        3 abstract instance block
        4 class instance block
        5 class constructor
        */
    }
}