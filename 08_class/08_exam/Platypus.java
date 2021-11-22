
class Mammal {
    private void sneeze() {} //   not inherited and therefore is not overridden in the Platypus class
    public Mammal(int age) {
        System.out.print("Mammal");
    }

    public Mammal(String duck) {
        System.out.print("Mammal");
    }
}

}

public class Platypus extends Mammal {
    int sneeze() { return 1;}
    public Platypus() {
        super(5); // this class needs to inheret 
        System.out.println("Platypus");
    }

    public Platypus(int x) {
         // this class needs to inheret 
         super(x);
        System.out.println("Platypus");
    }

    public Platypus(String y) {
        // this class needs to inheret 
        super("fish");
       System.out.println("Platypus");
   }

    public static void mian(String[] args) {
        new Mammal(5); // new object of the Parent class
    }
}