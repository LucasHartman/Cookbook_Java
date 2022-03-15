/*
-- Generics
-   Source: https://www.geeksforgeeks.org/generics-in-java/
-   Generics means parameterized types.
-   The idea is to allow type (Integer, String, … etc., 
    and user-defined types) to be a parameter to methods, classes, 
    and interfaces. 
-   Generics add that type of safety feature.
-   classes like HashSet, ArrayList, HashMap, etc., use generics very well. 

-- Generic Method
-   Generic Method takes a parameter and returns some value after performing a task
-   generic method has type parameters that are cited by actual type.

-- Generic Class (parameterized classes)
-   Generic class is implemented exactly like a non-generic class
    The only difference is that it contains a type parameter section.
-   There can be more than one type of parameter.

        class Test<T> {
            // An object of type T is declared
            T obj;
            Test(T obj) { this.obj = obj; } // constructor
            public T getObject() { return this.obj; }
        }

-- diamond operator
        List<String> c = new ArrayList<>();
        List<String> e = new ArrayList<String>();
-   The diamond operator is only allowed to be used when instantiating rather than
    declaring. In other words, it can’t go on the left side of the equal sign.
-   generics are not used on the right side of the assignment operator.

*/

public class Generics {

    // ArrayList & Generics
    List<String> c1 = new ArrayList<>(); // diamond operator
    List<String> c2 = new ArrayList<String>();

    
}
