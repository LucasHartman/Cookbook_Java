interface MyInterface {
    default int doStuff() {
        System.out.println(42);
        return 42;
    }
}

class Mother {
    public int  doStuff() {
        System.out.println("hello");
        return 99;
    }
}

public class Exercise62 extends Mother {
    public static void main(String[] args) {
        doStuff();
        new Exercise62().go();
    }


    void go() {
        //MyInterface.super.doStuff(); // use super to ignore the override
        // super.doStuff(); error
        doStuff(); // runs override method
        
    }

    @Override
    public int doStuff() {
        System.out.println(43);
        return 43;
    }
    
}
