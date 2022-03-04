/*
Variables are allowed to start with an underscore and are allowed to contain a $. There-
fore, all the variable declarations compile, making Options A, B, and C incorrect. However,
the println() refers to the uninitialized local boolean. Since , the code does not compile, and Option D is correct.
*/

public class Exercise4 {
    public static void main(String... args) {
        String name = "Desiree";
        int _number = 694;
        boolean profit$$$;
        System.out.println(name + " won. "
        + _number + " profit? " + profit$$$);
        }
    
}
