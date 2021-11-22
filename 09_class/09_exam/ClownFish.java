interface Aquatic {
    int getNumOfGills(int p);
}

public class ClownFish implements Aquatic {

    // method overload
    String getNumOfGills() {
        return "14";
    }

    // method override
    public int getNumOfGills(int input) {
        return 15;
    }

    public static void main(String[] args) {

        // obj ref Child class. method
        System.out.println(new ClownFish().getNumOfGills(-1));
    }
}