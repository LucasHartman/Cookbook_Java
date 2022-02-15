
/*
-- Overload
-   REUSE name
-   MUST change argument
-   MAY change return type
-   MAY change access modifier
-   MAY throw any exception thrown / not thrown

-- Override
-   Reuse name
-   MUST have same argument
-   MUST have same return type (or sub-type)
-   MAY narrow access modifier, but not widen
-   IF super-class method does not throw an exception,
    subclass overriding method can only throws the unchecked exception,
    throwing checked exception will lead to compile-time error.
-   IF super-class method throws an exception,
    subclass overriding method can only throw same or subclass exception
-   ALSO there is no issue if subclass overridden method is not throwing any exception.

-   default methods inside the interface can be overridden
-   static  methods can't be overridden
-   Private method can't be overridden
-   Final   methods can't be overridden
-   instance variables can't be overridden, they are there own value
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