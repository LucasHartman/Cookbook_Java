abstract class Birde {
    private final void fly() {
        System.out.println("Wow-"); // 1ste (Parent Constructor)
    }
}

public class Pelican extends Bird {

    public Pelican() {
        System.out.print("Oh-"); // 2nd (Child Constructer)
    }

    protected void fly() {
        System.out.println("Pelican"); // 3rd // Called Method
    }

    public static void main(String[] args) {

        var chirp = new Pelican();
        chirp.fly(); // wow-Oh-Pelican
    }
}