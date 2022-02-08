class A {
    String name = "A";
    
    String getName() {
        return name;
    }

    String greeting() {
        return "class A";
    }
}



class B extends A {
    String name = "B";

    // inherits getName()

    // method override
    String greeting() {
        return "class B";
    }
}



public class extendsEx1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println( a.greeting() +" has name " +a.getName()); // class A has name A
        System.out.println( b.greeting() +" has name " +b.getName()); // class B has name A
    }
}