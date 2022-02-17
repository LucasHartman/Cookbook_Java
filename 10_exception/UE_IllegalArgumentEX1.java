/*
-- IllegalArgumentException
-   Is thrown in order to indicate that a method has been passed on illegal argument.
-   It thus not need to be declare in the method's or constructor's throws clause.
    Because it a RuntimeException (unchecked Exception), only checked exception need to be declared.

*/

public class UE_IllegalArgumentEX1 {

    void example_ArgumentOutOfRange(int x) {
        /* When Arguments out of range. For example, 
        the percentage should lie between 1 to 100. 
        If the user entered 101 then an IllegalArgumentException 
        will be thrown.*/
        if (x>=0 & x<=100) {
            System.out.println("within range");
        } else {
            try{
                throw new IllegalArgumentException(); 
            } catch (IllegalArgumentException e) {
                System.out.println("Illegal Argument: " +e);
            }
        }
    }

    public static void main(String[] args) {
        UE_IllegalArgumentEX1 obj = new UE_IllegalArgumentEX1();
        obj.example_ArgumentOutOfRange(101);
    }
    
}
