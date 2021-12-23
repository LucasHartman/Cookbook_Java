
/*
--  Static Block
-   This code inside the static block is executed only once: 
    the first time the class is loaded into memory. 
-   A static block is invoked before main() method. 

*/

class Demo {
    static int val;
    static final int[] lst;
    
    static { 
    val = 99; // initialize variable
    lst = new int[2]; lst[0]=100; lst[1]=200; // initialize list
    System.out.println("static block is invoked before main() method");
    }
}



public class staticBlockEx1 {
    public static void main(String args[]){

        System.out.println(Demo.val); // 99

    }
}