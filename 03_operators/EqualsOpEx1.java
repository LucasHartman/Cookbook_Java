public class EqualsOperator {

    /*
    == Operator

    - The == operator tests for reference variable equality, not object equality.
    
    Reference Variable

    - Reference variable is used to point object/values.
    - Example:   EqualsOperator d1;
    

    Object 

    - Objects are equal when they have the same state (usually comparing variables). 
    - Objects are identical when they share the class identity.
    - equals() method compares two objects.
    */

    String name;

    EqualsOperator(String s) { name = s; }

    public static void main(String[] args) {
        
        EqualsOperator d1 = new EqualsOperator("Boi");
        EqualsOperator d2 = new EqualsOperator("Tyri");
        System.out.println( (d1 == d2) + " "); // d1==d2   false

        EqualsOperator d3 = new EqualsOperator("Boi");
        d2 = d1;
        System.out.println( (d1 == d2) + " "); // d1==d1  true
        System.out.println( (d1 == d3) + " "); // d1==d3  false
    }
    
}
