package packA;

interface MyInterface {
    public void publicMethod();
    default public void defaultMethod() {  System.out.println("interface default method"); }
}

abstract class MyAbstractClass {
    abstract protected void protectedMethod();
}

public class ClassA extends MyAbstractClass implements MyInterface {
    public void publicMethod() { System.out.println("public method"); }
    protected void protectedMethod() { System.out.println("protected method"); }
    /*
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
    }
    */
}
