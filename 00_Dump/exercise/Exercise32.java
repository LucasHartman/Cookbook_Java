public class Exercise32 {

    private static int price = 5;
    
    public boolean sell() {
       if(price<10) {
          price++;
          return true;
       } else if(price>=10) {
          return false;
       }
    }
    
    public static void main(String[] cash) {
       new Exercise32().sell();
       new Exercise32().sell();
       new Exercise32().sell();
       System.out.print(price);
    }
 }