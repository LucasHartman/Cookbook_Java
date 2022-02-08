public class PropagatingEx1 {

    /*
    -- Propagating Uncaught Exceptions

    - 

    -- Callstack
    -   method stack or a call stack. Simply put, the call
        stack is the chain of methods that your program executes 
        to get to the current method
    -   main() calls method a(), which calls method b(), which in turn calls method c()
    -   The call stack consists of the following: 
        c
        b
        a
        main
    - We will represent the stacks as grwoing upward

    -- ducked exceptions (exception propagation)
    - Like the callstack expains we go up the method stack, 
        on top a exception is thrown, which goes down the stack,
        on the bottom the exception can be caught.
    -   call stack will be “dumped.” This helps you debug your application by 
        telling you what exception was thrown, from what method it was thrown

    */
    
    static String s = "-";

    public static void main(String[] args) {
        
        new PropagatingEx1().s1(); // 1. executed 1st
        System.out.println(s); 
    }

    void s1() { // 
        try { s2(); } // 2. executed 2nd   6. throws exception
        catch (Exception e) { s+= "c"; }// 7. Catch exception      8.Result: "-c"
    }
    void s2() throws Exception { 
        s3(); // 3. executed 3rd           5. throws down exception
        s+= "2"; // not executed
        s3(); 
        s+="2b"; 
    }
    void s3() throws Exception {
        throw new Exception(); // 4. throws back an exception 
    }
}
