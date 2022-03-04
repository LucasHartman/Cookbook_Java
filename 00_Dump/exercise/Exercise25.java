/*

*/

public class Bear {
    protected int sing;
    
    protected abstract int grunt();

    int sing() {
        return sing;
    }
}

public class Exercise25 extends Bear {
    
    int grunt() {               // does not compile because the override reduces the visibility of an inherited method,
                                // with the package-private modifier being more restrictive than the protected modifier.

        sing() += 10;           // does also not compile, since the left-hand side of a compound assignment operator must be used with a variable, not a method. 

        return super.grunt()+1; // does not compile because super.grunt() is inherited as an abstract method in the PolarBear class, 
                                // meaning the parent class has no implementation.
        return 10;
    }
}

