/*

- Method without an Exception               CAN     be overridden with a      NEW     UnChecked Exception   (IndexOutOfBoundException)
- Method without an Exception               CAN'T   be overridden with a      NEW     Checked Exception     (ClassNotFoundException) !!!

- Method with an Checked Exception          CAN     be overridden             WITHOUT Checked Exception     (ClassNotFoundException)
- Method with an Checked Exception          CAN     be overridden with the    SAME    Checked Exception     (ClassNotFoundException)
- Method with an Checked Exception          CAN     be overridden with a      NARROW  Checked Exception     (ClassNotFoundException)
- Method with an Checked Exception          CAN'T   be overridden with a      WIDER   Checked Exception     (ClassNotFoundException)
- Method with an CHECKED Exception          CAN'T   be overridden with the    NEW     UNCHECKED Exception   (IndexOutOfBoundException) !!!

- Method with an UnChecked Exception        CAN     be overridden             WITHOUT Unchecked Exception   (IndexOutOfBoundException)
- Method with an UnChecked Exception        CAN     be overridden with the    SAME    Unchecked Exception   (IndexOutOfBoundException)
- Method with an UnChecked Exception        CAN     be overridden with a      NARROW  Unchecked Exception   (IndexOutOfBoundException)
- Method with an UnChecked Exception        CAN'T   be overridden with a      WIDER   Unchecked Exception   (IndexOutOfBoundException)
- Method with an UNCHECK Exception          CAN'T   be overridden with the    NEW     CHECKED Exception     (ClassNotFoundException) !!!

// OverLoad ---------------------------------------------------------------------------------------------------------------------------

- Method without an Exception               CAN     be overloaded with a      NEW     UnChecked Exception   (IndexOutOfBoundException)
- Method without an Exception               CAN     be overloaded with a      NEW     Checked Exception     (ClassNotFoundException)

- Method with an Checked Exception          CAN     be overloaded             WITHOUT Checked Exception     (ClassNotFoundException)
- Method with an Unchecked Exception        CAN     be overloaded with the    SAME    unchecked Exception   (IndexOutOfBoundException)
- Method with an Unchecked Exception        CAN     be overloaded with the    WIDER   unchecked Exception   (IndexOutOfBoundException)
- Method with an Unchecked Exception        CAN     be overloaded with the    NARROW  unchecked Exception   (IndexOutOfBoundException)
- Method with an UNCHECK Exception          CAN     be overloaded with the    NEW     CHECKED Exception     (ClassNotFoundException) !!!

- Method with an UnChecked Exception        CAN     be overloaded             WITHOUT Unchecked Exception   (IndexOutOfBoundException)
- Method with an checked Exception          CAN     be overloaded with the    WIDER   checked Exception     (ClassNotFoundException)
- Method with an checked Exception          CAN     be overloaded with the    NARROW  checked Exception     (ClassNotFoundException)
- Method with an CHECKED Exception          CAN     be overloaded with the    NEW     UNCHECKED Exception   (IndexOutOfBoundException) !!!


*/

class Parent {

    void methodA() {
        System.out.println("no Exception");
    }


    void methodB() throws IndexOutOfBoundsException {
        try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught UnChecked Exception");
        }
    }


    void methodC() throws Exception {
        try {
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException e) {
            System.out.println("Caught Checked Exception");
        }
    }



}
    
public class OverrideExceptionEx1 extends Parent {
    

    @Override
    void methodA() throws IndexOutOfBoundsException {
        System.out.println("");
    }


    @Override
    void methodB() throws IndexOutOfBoundsException {
        try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught UnChecked Exception, in the Overridden method");
        }
    }


    @Override
    void methodC() throws ClassNotFoundException {
        try {
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException e) {
            System.out.println("Caught Checked Exception,   in the Overridden method");
        }
    }

    // OverLoad -----------------------------------------------------------------------

    int methodA (int x) throws IndexOutOfBoundsException {
        System.out.println("Overloaded");
        return x;
    }

    String methodA (String x) throws ClassNotFoundException {
        System.out.println("Overloaded");
        return x;
    }



    int methodB(int x) throws IndexOutOfBoundsException {
        try {
            throw new ClassNotFoundException();
        } catch (Exception e) {
            System.out.println("Caught Checked Exception");
        }
        return x;
    }




    public static void main(String[] args) throws ClassNotFoundException, Exception {
        
        new OverrideExceptionEx1().methodA();
        new OverrideExceptionEx1().methodB();
        new OverrideExceptionEx1().methodC(); // throws Checked Exception

        new OverrideExceptionEx1().methodA(1);
        new OverrideExceptionEx1().methodA("String");

        new OverrideExceptionEx1().methodB(2);
    }



}
