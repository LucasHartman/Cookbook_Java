public class ExceptionCollection {
    Integer num;

    void exampleIndexOutOfBounds() {
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

    void exampleArrayIndexOutOfBounds() {
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


    void exampleStringIndexOutOfBounds() {
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


    void exampleNullPointer() {
        /* Try to catch a Null Pointer Exception.
        currently not working */
        try {    
            System.out.println(num);
        } catch (NullPointerException e) {
            System.out.println("\nNull Pointer Exception: " +e);
        }
    }


    public static void main(String[] args) {
        ExceptionCollection obj = new ExceptionCollection();
        obj.exampleIndexOutOfBounds();
        obj.exampleArrayIndexOutOfBounds();
        obj.exampleStringIndexOutOfBounds();
        obj.exampleNullPointer();
    }
    
}
