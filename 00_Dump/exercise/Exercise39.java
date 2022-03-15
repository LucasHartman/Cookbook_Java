class Dog {
    public void bark() { System.out.print("woof "); }
}

class Hound extends Dog {
    public void sniff() { System.out.println("sniff "); }
    public void bark() { System.out.println("howl "); }
}

public class Exercise39 {
    public static void main(String[] args) {
        new Exercise39().go();
    }

    void go() {
        new Hound().bark(); // howl
        ((Dog) new Hound()).bark(); // howl (changing the data type wound change the fact the method overridden)
        ((Dog) new Hound()).sniff(); // cannot find symbol location class Dog!!!!!!!!!!!!
    }
}
