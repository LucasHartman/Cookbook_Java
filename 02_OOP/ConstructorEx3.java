
/*
--  Constructor Default
=   How do you know for sure whether a default constructor will be created? 
    Because you didn’t write any constructors in your class
*/ 

public class ConstructorEx3 {

    // This is your constructor, but is not a Default one
    ConstructorEx3(String name) { 
        System.out.println("Constructor " +name); 
    }

    public static void main(String[] args) {

        ConstructorEx3 obj = new ConstructorEx3(); // error: needs an input to run the default constructor
    }
}