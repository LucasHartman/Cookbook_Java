import packA.*;

public class ClassC extends ClassA {
    public void publicMethod() { System.out.println("override method"); }

    public static void main(String[] args) {
        ClassC obj = new ClassC();
        obj.publicMethod();             // child method
        obj.protectedMethod();          // can only be accessed through inheritance (extends)

        ClassA obj2 = new ClassA();
        obj2.publicMethod(); // parent method

        ClassA obj3 = new ClassC();
        obj3.publicMethod(); // child method
    }
}
