
/*
--  Constructoer Super()
*/

class Cinema {
    public String name;

    // parent constructor
    public Cinema(String name) {this.name = name;}
}

public class ConstructorEx5 extends Cinema {

    // child constructor
    public ConstructorEx5(String movie) {

        super(movie); // initialize the parent constructor with Sting agrument
        // If there was no super(movie), the compile would automaticlye make a super()
        // but because the parent class has no "no-arg concstrucot", it would result into a compile error.
    }

    public static void main(String[] showing) {
        System.out.print(new ConstructorEx5("Another Trilogy").name);
    }
}