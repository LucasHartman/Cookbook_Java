
class Ship {
    protected int weight = 3;
    public int height = 5;

    public int getWeight() { return weight; }
    public int getHeight() { return height; }
}



public class InheritVariable extends Ship {

    // These values don't override the superclass instance variable
    // because this variable are instance
    public int weight = 2;
    public int height = 4;

    public void printDetails() {
        System.out.print(super.getWeight()+","+super.height);
    }



    public static final void main(String[] fuel) {
        new InheritVariable().printDetails(); // 3.5
    }
}