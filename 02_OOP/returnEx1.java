
/*
--  Return Types
-    Object reference return types can accept null as a return value.
-   An array is a legal return type, both to declare and return as a value.
-   For methods with primitive return types, any value that can be implicitly (widening) converted to
    the return type can be returned.

*/

public class ReturnEx1 {

    // return null
    public Button do stuff() {
        return null;
    }

    // return array
    public String[] go() {
        return new String[] {"Fred", "Barney", "Wilma"};
    }

    // return implicitly converted ot declared retun type
    public int foo() {
        char c = 'c';
        retrun c;
    }

    //retrun casted value
    public int foo() {
        float f = 33.4f;
        return (int) f; // 33
    }

    // return objet
    public Object getObject() {
        int [] nums = {1,2,3};
        return nums;                // int array is a object
    }
}