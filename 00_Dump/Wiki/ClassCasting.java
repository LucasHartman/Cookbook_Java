interface Uncle { 
    default void moreStuff() {System.out.println("from interface");} 
}

class Parent {
    public int var = 1;
    public void doStuff() { System.out.println("Parent"); }

    public void parentMethodOnly() { System.out.println("Parent Method Only"); }

    public static void methodStatic() { System.out.println("Parent Static Method"); }
}

class Child extends Parent {
    public int var = 2;

    @Override
    public void doStuff() { System.out.println("Child"); }

    public void childMethodOnly() { System.out.println("Child Method Only"); }

    public static void methodStatic() { System.out.println("Child Static Method"); }
}


public class ClassCasting extends Child implements Uncle  {

    public void moreStuff() {System.out.println( "from local"); }

    void go() { 
        Uncle.super.moreStuff(); // call from Interface
        moreStuff(); // call from local
     }
    public static void main(String[] args) {

        // Class References
        new Parent().doStuff(); // Parent Reference
        new Child().doStuff(); // Child Reference


        // Parent class object, but referencing Child class
        Parent r4 = new Child();
        r4.doStuff(); // Child


        /*----------------------
                Casting
        ----------------------*/

        // UpCast
        Child c1 = new Child();     // Child Ref
        Parent c2 = (Parent)c1;     // Child Ref to Parent
        c2.parentMethodOnly();
        c2.doStuff();               // Child 

        // DownCast
        Parent p1 = new Parent();   // Parent Ref
        //Child p2 = (Child) p1;      // Parent Ref to Child, Throws ClassCastingException!!!
        //p2.childMethodOnly();

        Parent p3 = new Child();    // Child Ref
        Child p4 = (Child)p3;       // Child Ref to Child, legal downcast
        p4.childMethodOnly();



        /*----------------------
                Variables
        ----------------------*/

        Parent v1 = new Child();
        System.out.println(v1.var); // 1

        Child v2 = new Child();
        System.out.println(v2.var); // 2


        /*----------------------
                Static
        ----------------------*/

        Child c3 = new Child();
        c3.methodStatic(); // Child Static Method

        Parent c4 = new Child();
        c4.methodStatic(); // Parent Static Method
        


        /*----------------------
        Invoke Interface Method
        ----------------------*/

        new ClassCasting().go();

        














        /*




        // Reference
        new Parent().doStuff(); // Parent
        new Child().doStuff(); // Child

        ((Parent) new Child()).doStuff(); // Child
        //((Parent) new Child()).childMethodOnly(); // Compilation fails


        // Object Class & Reference 
        Parent r1 = new Parent();
        Parent r2 = new Child();




        Parent p3 = new Child();
        ((Child)p3).doStuff(); // Child


        Parent p = new Parent();
        // Child c = (Child)p; // inconvertible type




    */


    }
    
}
