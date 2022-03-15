import java.time.*;
import java.time.format.*;

public class Exercise59 {
    public static void main(String[] args) {
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd, yyyy"); // MMM show World instead of number
        LocalDate d = LocalDate.of(2018, Month.JANUARY, 15);
        LocalDate d2 = d.plusDays(1);
        System.out.println(f1.format(d) +" "); // January 15, 2018
        System.out.println(d2.format(f1)); // January 16, 2018
    }
    
}
