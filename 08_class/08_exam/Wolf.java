
class Howler {
    public Howler(long shadow) {
        // inser
        //this((int) shadow);      // Correct
        this(3);                // Correct
    }

    private Howler(int moon) {
        super();
    }
}

class Wolf extends Howler {
    protected Wolf(String stars) {
        super(2L); 
    }

    public Wolf() {
        // insert
        //this("");     // Correct
        this(null);     // Correct
        //super(2L);
        // super(69); 
        
    }
}