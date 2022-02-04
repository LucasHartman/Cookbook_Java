import java.time.*;
import java.time.format.*;

public class LocalDateEx2 {

    public static void main(String[] args) {

        LocalDate newYears = LocalDate.of(2017, 1, 1);  // correctly creating a date
        
        Period period = Period.ofDays(1);               // period representing one day
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");   // format pattern
        
        System.out.print(format.format(newYears.minus(period)));    // print data, in format, minus period
     }
  }
}
