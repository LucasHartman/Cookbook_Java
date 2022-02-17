import packA.*;

public class ClassB {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.publicMethod();
        // obj.methodAnimal();      // can't import a protected method
        obj.defaultMethod();
    }
}
