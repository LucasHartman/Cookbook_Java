public class Main {
    int x; // instance variable
  
    // Constructor with a parameter
    public Main(int x) {
      this.x = x; // local/instance variable
    }

public class thisEx1 {

    public static void main(String[] args) {

        Main myObj = new Main(5);
    System.out.println("Value of x = " + myObj.x);

    }
}