class BirdSeed {

    // Declare instance variable
    private int numberBags;
    boolean call;

    // Constructor
    public BirdSeed() {
        // Line 1
        this(2); // call Other constructor 
        call = false; // initialize
        // Line 3
    }

    // OverLoaded Constructor (Setter)
    public BirdSeed(int NumberBags) {
        this.numberBags = NumberBags; // initialize
    }

    public static void main(String[] args) {
        
        // Object Reference
        BirdSeed seed = new BirdSeed();
        System.out.print(seed.numberBags); // 2 call instance field
    }

}