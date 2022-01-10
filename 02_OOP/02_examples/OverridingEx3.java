
/*
-- Overriding
-   inherits a method from a supertype, you have the opportunity to override the method

-   SAME name, SAME argument list SAME return type 
-   access modifier must be the same or broader in the child method
-   Thrown checked exceptions NOT new or broader

-   Private methods can't be overridden
-   Static methods  can't be overridden
-   Final methods   can't be overriden.
*/

import java.io.*;

class School {
    public int getNuberOfStudentsPerClassroom(String... students)
    throws IOException {
        return 3;
    }

    // Overloaded Method
    public int getNuberOfStudentsPerClassroom()
    throws IOException {
        return 9;
    }
}


public class OverridingEx3 extends School {

    @Override
    public int getNuberOfStudentsPerClassroom()
    throws FileNotFoundException {      
        // Legal: FileNotFoundException is a subclass of IOException, it is considered a narrower exception
        return 2;
    }

    public static void main(String[] args) throws IOException {
        School school = new OverridingEx3();

        /*
        Due to polymorphism, the overridden version of the method in OverridingEx3 is used, 
        regardless of the reference type
        */
        System.out.println( school.getNuberOfStudentsPerClassroom() ); // 2
    }

}