
/*
--  Static variable (Class variable)
-   declared with the static keyword in a class, but outside a method, constructor or a block.
-   There would only be ONE COPY of each class variable per class, 
    regardless of how many objects are created from it.
-   Static variables are stored in the static memory
-   Static variables can be accessed by calling with the class name ClassName.VariableName.

-- static final variable initialization
    private static final String monday;
-   The declaration of monday does not compile, because the value of a static final vari-
    able must be set when it is declared or in a static initialization block.


*/

public class staticVariableEx1 {

    static int count = 0; // Static variables are stored in the static memory
    int i = 0;
    
    public void changeCount() {
        while (i<5) {
            i++;
            count++;
            System.out.println("i: "+i);            // 1 2 3 4 5
            System.out.println("count: "+count);    // 1 2 3 4 5 6 7 8 9 10
        }
    }

    public static void main(String[] args) {
        
        // These 2 object refrences shear the same Static Variable
        WhileEx3 check1 = new WhileEx3();
        WhileEx3 check2 = new WhileEx3();
        
        check1.changeCount();
        check2.changeCount();

        System.out.print(check1.count +" " +check2.count); // 10 10
    }
    
}