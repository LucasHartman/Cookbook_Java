
/*
--  Variable 
-   Java allows methods to be overridden, but not variables.
-   marking them final does not prevent them from being reimplemented in a subclass.
-   polymorphism does not apply in the same way it would to methods as it does to variables.

--  Method Override
-   overridden method cannot reduce the visibility of the inherited method. (public -> protected -> private)
-   overridden method cannot declare a broader checked exception than the inherited method. (FileNotFoundException -> IOException)



*/

class Math {
    public final double secret = 2;
}



class ComplexMath extends Math {
    public final double secret = 4; // reimplemented
}



public class InheritVariableEx2 extends ComplexMath {
    public final double secret = 8; // reimplemented



    public static void main(String[] numbers) {

        Math math = new InheritVariableEx2();
        System.out.print(math.secret); // 2

        ComplexMath math2 = new InheritVariableEx2();
        System.out.print(math2.secret);  // 4


        InheritVariableEx2 math3 = new InheritVariableEx2();
        System.out.print(math3.secret);  // 8
    }
}