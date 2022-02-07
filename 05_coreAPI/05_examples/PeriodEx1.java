import java.time.Period;
import java.time.*;
import java.time.format.*;
import javax.print.event.PrintEvent;


class PeriodEx1 {
    public static void main(String[] args) {
        LocalDate newYears = LocalDate.of(2017, 1, 1);                          // set date
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");   // set format
        
        Period period1 = Period.ofWeeks(1).ofDays(3);                           // set period (can't use chaining so only foDays set the value)
        Period period2 = Period.ofDays(10);

        System.out.print(format.format(newYears.plus(period1)) +"\n");    // 04-01-2017     (adds 03 days)
        System.out.print(format.format(newYears.plus(period2)));          // 11-01-2017     (adds 10 days)

    }
}
