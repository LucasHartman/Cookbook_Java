public class ContinueEx1 {

    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            if (i == 2) { // skip 2
              continue;
            }
            System.out.println(i); // 0 1 3 4
          }
          

    }
    
}
