interface FrogBoilable {

    static int getCtoF(int cTemp) {
        return (cTemp * 9 / 5) + 32;
    }

    default String hop() { return "hopping"; }
}

public class Exercise57 implements FrogBoilable {
    public static void main(String[] args) {
        new Exercise57().go();
    }

    public void go() {
        // System.out.println(hop()); // 
        System.out.println(getCtoF(100)); // 
        //System.out.println(FrogBoilable().getCtoF(100));
        Exercise57 dbf = new Exercise57();
        System.out.println(dbf.getCtoF(100));
    }
}
