class Singer { 
    public static String sing() { return "la"; }
}

public class Exercise44 extends Singer {
    public static String sing() {
        return  "fa";
    }

    public static void main(String[] args) {
        Exercise44 t = new Exercise44();    // child type (fa)
        Singer s = new Exercise44();        // parent type (la)

        System.out.println(t.sing() + " " + s.sing()); // fa la     reference type can be used but are not needed for static classes
    }
    
}
