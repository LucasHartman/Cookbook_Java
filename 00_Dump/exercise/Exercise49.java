class Alpha {
    static String s = " ";
    protected Alpha() { s+= "alpha "; }
}

class SubAlpha extends Alpha {
    private SubAlpha() { s += "sub"; }
}
public class Exercise49 extends Alpha {
    private Exercise49() { s+= "subsub"; }

    public static void main(String[] args) {
        new Exercise49();
        System.out.println(s); // alpha subsub
    }
}