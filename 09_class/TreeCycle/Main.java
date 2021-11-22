/* In this example we input a value in the main class

and send the value to the top of the tree 

and bring it back through all the classes

back to the start.

The goals cycle the value through a chain of classes.

*/

class Parent {

    protected static String variable;

    Parent(String variable) { // 3. get refference argument
        this.variable = addB(variable); // 4. run 1ste method over refference argument
    }

    String addB(String x) {
        return x + "B-";
    }

}

class Child extends Parent {

    Child(String variable) {
        super(variable); // 2. call parent constructor //
    }

    static String addC(String x) {
        return x + "C-";
    }

    String getter() {
        return addC(variable); // 5. run 2nd method over reffernce argument
    }

}

public class Main {

    public static void main(String[] args) {

        String value = new Child("A-").getter(); // 1. reference child and input value // 6. get final result
        System.out.println("the final value: " + value); // A-B-C-

    }
}
