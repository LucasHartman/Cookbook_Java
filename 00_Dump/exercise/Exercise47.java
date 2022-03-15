class Box {
    int size;
    Box(int s) { size=s; }
}

public class Exercise47 {
    public static void main(String[] args) {
        Box b1 = new Box(5);
        Box[] ba = go(b1, new Box(6)); // create Box list
        ba[0] = b1; // b2 = b1
        for(Box b : ba) System.out.print(b.size + " "); // 4 4
    }

    static Box[] go(Box b1, Box b2) {
        // turn arguments into a list
        b1.size = 4; // change size of argument b1
        Box[] ma = { b2,b1 };
        return ma;
    }
    
}
