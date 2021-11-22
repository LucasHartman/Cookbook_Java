
class Speedster{

    // inst var
    int numSpots;
}

public class Cheetah extends Speedster {
    // inst var
    // An instance variable with the same name as an inherited instance variable is hidden, not overridden. 
    int numSpots;

    // Constructoer (Setter)
    public Cheetah(int numSpots) {
        //this.numSpots = numSpots;
        super.numSpots = numSpots;
    }

    public static void main(String[] args) {

        // ref object
        Speedster s = new Cheetah(50);
        System.out.print(s.numSpots); // call int var
    }
}