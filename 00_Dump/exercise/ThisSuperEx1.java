class Parent {

    private int var;

    Parent(int var) {
        this.var = var;
        System.out.println("Parent Constructor: " +var);
        
        this.myMethod();    // invoke overridden method
        myMethod();         // invoke overridden method
    }   

    protected void myMethod() { System.out.println("Parent Method"); }

}

public class ThisSuperEx1 extends Parent {

    // Overloaded Constructor
    //ThisSuperEx1(String s) { System.out.println("Overloaded Child Constructor: " +s); }

    ThisSuperEx1() {
        super(1); // invoke parent constructor
        //this("vis");
        System.out.println("Child Constructor");

        super.myMethod(); // invoke parent method
        myMethod();       // invoke overridden method
    }

    protected void myMethod() { System.out.println("Child Method"); }

    public static void main(String[] args) {

        ThisSuperEx1 obj = new ThisSuperEx1();

    }
}
