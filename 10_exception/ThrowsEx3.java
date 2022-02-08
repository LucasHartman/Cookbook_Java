public class ThrowsEx3 {
   public static void main(String[] args) throws Exception { // exception is thrown here
      
      new RuntimeExceptionEx1().openDrawbridge();
   
   }


    public void openDrawbridge() {
      try {
         throw new Exception("Circle");
      } catch (Exception e) {
         System.out.print("Opening!");
      } finally {
         System.out.print("Walls");
      }
   }
}