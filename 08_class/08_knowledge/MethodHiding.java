/**
 * Method Hiding
 * 
 * When super class and sub class contains same method including parameters and 
 * if they are static.
 * 
 * The method in the super class will be hidden by the one that is in the sub class. 
 * This mechanism is known as method hiding.
 * 
 * Hidden methods must have the dame signature
 * Signature; combination of the method name and the parameter list. 
 */


class Pclass {

    // parent variable
    static int variable = 0;

    // parent method
    public static void demoMethod() {
        System.out.println("method of super class");
    }
    
}


public class MethodHiding extends Pclass {

    // child variable
    static int variable = 69;

    // Declaring same static method in the subclass will replace the static method in the parent class
    public static void demoMethod() { 
        System.out.println("method of sub class");
    }

    public static void main(String[] args) {

        System.out.println(MethodHiding.variable); // 69

        MethodHiding.demoMethod(); // method of sub class
    }

}
