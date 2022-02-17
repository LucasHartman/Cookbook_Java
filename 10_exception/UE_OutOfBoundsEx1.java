public class UE_OutOfBoundsEx1 {

    void example_IndexOutOfBounds() {
        /* This method contains a array with 4 elements.
        They "a" variable try's to get the fifth element,
        which throws a Unchecked Exceptions "Index Out of Bounds".
        The code catches the exception.
        */
        int[] myArray = {0,1,2,3};
        try {
            int a = myArray[4];
        } catch ( IndexOutOfBoundsException e) {
            System.out.println("\nIndex Out Of Bound Exception: " +e);
        }
    }

    void example_ArrayIndexOutOfBounds() {
        /* This method contains a array with 4 elements.
        They "a" variable try's to get the fifth element,
        which throws a Unchecked Exceptions "Index Out of Bounds".
        The code catches the exception.
        */
        int[] myArray = {0,1,2,3};
        try {
            int a = myArray[4];
        } catch ( ArrayIndexOutOfBoundsException e) {
            System.out.println("\nArray Index Out Of Bound Exception: " +e);
        }
    }


    void example_StringIndexOutOfBounds() {
        /* This method contains a String with 4 elements.
        They "a" variable try's to get the fifth element,
        which throws a Unchecked Exceptions "String Index Out of Bounds".
        The code catches the exception.
        */
        String myString = "hello";
        try {
            char a = myString.charAt(5);
        } catch ( StringIndexOutOfBoundsException e) {
            System.out.println("\nString Index Out Of Bound Exception: " +e);
        }
    }

    public static void main(String[] args) {
        UE_OutOfBoundsEx1 obj = new UE_OutOfBoundsEx1();
        obj.example_IndexOutOfBounds();
        obj.example_ArrayIndexOutOfBounds();
        obj.exampleS_tringIndexOutOfBounds();
    }
    
}
