class Arachnid {
    static StringBuilder sb = new StringBuilder();
    { sb.append("c"); }

    static
    {sb.append("u"); } // 1 static components are initialized first

    {sb.append("r"); }
}

public class Scorpion extends Arachnid {
    static
    {sb.append("q"); } // 2 static components are initialized first

    {sb.append("m"); }

    public static void main(String[] args) {
        System.out.println(Scorpion.sb + " "); // static uq
        System.out.println(Scorpion.sb + " "); // static uq

        new Arachnid(); // instance of Arachnid is initialized 
        new Scorpion(); //  The instance initializers in the superclass Arachnid run first
        System.out.println(Scorpion.sb); 
        // first static                                 uq
        // than the rest of the super class             cr
        // thant subclass which inherits superclass     crm 
    }
}