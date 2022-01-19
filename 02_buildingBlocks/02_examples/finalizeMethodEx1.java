/*
--  finalize() Method
-   Finalize() is the method of Object class.
-   This method is called just before an object is garbage collected.
-   finalize() method overrides to dispose system resources,
    perform clean-up activities and minimize memory leaks
-   
*/

public class finalizeMethodEx1 {

    JavafinalizeExample1 obj = new JavafinalizeExample1();  

    System.out.println(obj.hashCode());   
    
    obj = null;   
    // calling garbage collector    
    
    System.gc();   
    System.out.println("end of garbage collection");   
    }  

    @Override  
    protected void finalize() {   
        System.out.println("finalize method called");   
    }   
}