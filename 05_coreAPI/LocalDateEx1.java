import java.time.LocalDate;

public class LocalDateEx1 {

    public static void main(String[] args) {
        
        LocalDate xmas = LocalDate.of(2016,  12,  25);  // immutable
        xmas.plusDays(-1);                              // no effect or set it to a new LocalData vairable
        System.out.println(xmas.getDayOfMonth()); // 25

        LocalDate xmas2 = xmas.plusDays(-1);                              
        System.out.println(xmas2.getDayOfMonth()); // 24
    }
    
}
