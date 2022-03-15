/*
Hidden Variables    Reference datatype defines the version of the variable that is selected  
Select Methods      Reference variable defines the version of the method that is selected

throws Exception    Overrides New, Same or Narrower

Access Modifier     Overrides goes Wider
Can't be Override   Private, Static, Final

Covariant Return    Same Class or Sub Class Example Number -> Byte, Short, Integer, Long, Float, Double
*/

class A {
    int var = 1;
    Number myMethod() throws Exception { System.out.println("A\n"); return 1;}
}

class B extends A {
    int var = 2;
    protected Number myMethod() throws RuntimeException { System.out.println("B\n"); return 2; }
}

public class Exercise30 extends B {
    int var = 3;
    public Integer myMethod() throws IndexOutOfBoundsException { 
        System.out.println("C\n"); return 3; }

    public static void main(String[] args ) throws Exception {

        A refA = new Exercise30();
        System.out.println(refA.var); // 1
        refA.myMethod(); // C

        B refB = new Exercise30(); // 2
        System.out.println(refB.var); // C
        refB.myMethod();

        Exercise30 refC = new Exercise30();
        System.out.println(refC.var); // 1
        refC.myMethod(); // C
    }    
}