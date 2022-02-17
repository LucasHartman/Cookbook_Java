/*
-- NumberFormatException
-   Source: https://www.javatpoint.com/numberformatexception-in-java
-   Is thrown when we try to convert a string into numeric value
*/

public class UE_NumberFormatEx1 {

    void example_NumberFormat() {
        /* In this method we try to parse a String value into a int variable */
        try {
            int a = Integer.parseInt(null);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: " +e);
        }
    }

    public static void main(String[] args) {
        UE_NumberFormatEx1 obj = new UE_NumberFormatEx1();
        obj.example_NumberFormat();
    }
}