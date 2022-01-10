
/*
--  Abstract Class
-   An abstract class can contain both abstract and concrete methods
*/

abstract class A {

    abstract void abMethod();

    void conMethod() { 
        System.out.println("Concreate Method"); 
    }
}


public class AbstractClassEx1 extends A { 

    void abMethod() { 
        System.out.println("Abstract to Concreate Method"); 
    }


}