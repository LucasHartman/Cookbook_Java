abstract class Ball {
    protected final int size;
    public Ball(int size) {
       this.size = size;
    }
 }

interface Equipment {}


public class Exercise29 extends Ball implements Equipment {
   public Exercise29() {
      super(5);
   }
   
   public Ball get() { return this; }
   
   public static void main(String[] passes) {
      Equipment equipment = (Equipment)(Ball)new Exercise29().get();
      System.out.print(((Exercise29)equipment).size); // 5
   }
}