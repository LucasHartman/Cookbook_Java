interface parent {
    static int myMethod() { return 1; }
}

public class Exercise58 implements parent {
    public static void main(String[] args) {
       new Exercise58().go();
    }

    void go() {
        System.out.println(parent.myMethod());        
    }
    
}
