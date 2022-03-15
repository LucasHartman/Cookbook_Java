class Parent {
    public int var = 1;
    public void doStuff() { System.out.println("Parent"); }
}

class Child extends Parent {
    public int var = 2;
    @Override
    public void doStuff() { System.out.println("Child"); }
}


public class ClassCasting extends Child  {
    public static void main(String[] args) {

        // Reference
        new Parent().doStuff(); // Parent
        new Child().doStuff(); // Child
        new ClassCasting().doStuff(); // ClassCasting


        // Object Class & Reference 
        Parent r1 = new Parent();
        Parent r2 = new Child();

        // Parent class object
        // but referencing Child class
        Parent r4 = new Child();
        r4.doStuff(); // Child

        // DownCasting
        Child r5 = (Child)r4;
        r5.doStuff(); // Child

        // UpCasting
        Child c1 = new Child();
        Parent p1 = c1;
        Parent p2 = (Parent)c1;
        p1.doStuff(); // Child
        p2.doStuff(); // Child


        Parent p3 = new Child();
        ((Child)p3).doStuff(); // Child


        Parent p = new Parent();
        // Child c = (Child)p; // inconvertible type


        // get Variable, through the Object Type
        Parent v1 = new Child();
        System.out.println(v1.var); // 1

        Child v2 = new Child();
        System.out.println(v2.var); // 2

 


        




    }
    
}
