/*
-- Method effect on Primitive
-   Passing a primitive type to function
-   Java creates a copy of the variable (local variable) being passed in the method and then do the manipulations.
-   The changes are not reflected back if we change the object itself to refer some other location or object

-- Method effect on Object
-   Passing a Object type to function
-   The method manipulating the object has an direct effect on the original object
-   Changes are reflected back if we do not assign reference to a new location or object



*/

class User {
    String name = "Lucas";
    int id = 3;
}

public class PassByValueEx2 {

    static int val = 6;

    static void inputPrimitive(int val) { val++; } // add up argument value
    static void inputObject(User u) {u.name = "Ben"; } // change argument name

    public static void main(String[] args) {

        User ref = new User();
        
        inputPrimitive(val);
        System.out.println("val:    " +val); // 6 (method had no effect)

        inputObject(ref);
        System.out.println("name:   " +ref.name); // Ben (method changed the outcome)

    }
    
    
}
