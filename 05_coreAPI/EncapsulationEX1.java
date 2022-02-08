import java.util.*;

public class EncapsulationEX1 {

    private String name;                // encapsulation (private, to this class only)
    private ArrayList<Integer> list;    // declase ArrayList, encapsulation 
    
    // Constructor
    EncapsulationEX1() { 
        list = new ArrayList<Integer>(); // initialize ArrayList
    }
    
    String getName()        { return name; }
    void addToList(int x)   { list.add(x); }
    ArrayList getList()     { return list; }    // break encapsulation
    // your getter must return a reference to a copy of the object, 
    // not just the reference to the original object.


    public static void main(String args[]) {}
}