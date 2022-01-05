
/*
--  Constructor
-   The only way a constructor can be invoked is from within another constructor. In other
    words, you can’t write code that actually calls a constructor as follows:
*/ 

public class ConstructorEx2 {

    ConstructorEx2() { 
        System.out.println("Constructor"); 
    }

    void doStuff() {
        ConstructorEx2(); // calling the constrctor - ILLEGAL!
        System.out.println("Method"); 
    }





    public static void main(String[] args) {

        // Constructor Chaining
        ConstructorEx2 obj = new ConstructorEx2();
        obj.doStuff();
    }
}