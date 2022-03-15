public class Exercise55 {
    public static void main(String[] args) {
        // infinite loop
        // new Exercise55().go(); 


        // works fine, error is caught
        try { new Exercise55().go();
        } catch (Error e) { System.out.println("ouch"); }
        
        /*
        // infinite loop, is not caught 
        try { new Exercise55().go();
        } catch (Exception e) { System.out.println("ouch"); }
        */
    }

    void go() {
        go();
    }
}
