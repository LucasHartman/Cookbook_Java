import java.time.Period;
import java.time.*;
import java.time.format.*;
import javax.print.event.PrintEvent;

/*
--  java.time.LocalTime
-   Source: https://www.javatpoint.com/java-localtime
-   LocalTime class is an immutable class 
-   It represents time with a default format of hours-minutes-second.
-   minusNanos and plusNanos are the smallest units available 
-    The Java 8 date and time classes are immutable. This means they do not contain setter 
-   Methods:
1.  LocalDateTime atDate(LocalDate date)        append local data to local time
                                                2018-12-05T09:32:42
2.  int compareTo(LocalTime other)              compare 2 times
                                                return 1 is greater
                                                return 0 if equal
                                                return -1 if less
                                                int value = time1.compareTo(time2);
3.  String format(DateTimeFormatter formatter)  Define time pattern
    source: https://howtodoinjava.com/java/date-time/java-date-formatting/
4. int get(TemporalField field)                 gets the value of the specified field
                                                form this time as an int
                                                LocalTime time = LocalTime.parse("12:30:30");
                                                System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_DAY)); // 12    
5. Local Time minusHours(long hoursToSubtract)  return copy of this LocalTime
                                                with the specified number of minutes subtracted
                                                LocalTime time = LocalTime.parse("12:30:30");
                                                System.out.println(time.minusMinutes(2)); // 12:28:30
6.  static LocalTime now()                      obtain the current time from the system clock
                                                in the default time-zone
                                                LocalTime time = LocalTime.now();
7.  static LocalTime of(int hour, in minutes, int second)
                                                obtains an instance of LocalTime from 
                                                year, month, day, hour, minute, second and nanosecond.
                                                LocalTime time = LocalTime.of(6,30,40,50000);
                                                System.out.println(time); // 06:30:40.000050
8.  LocalTime plusHours(long hoursToAdd)        return cop of this LocalTime
                                                plus the specified hours added        
9. LocalTime plusMinutes(long minutesToAdd)     return cop of this LocalTime
                                                plus the specified minutes added        

--  java.time.LocalDate
-   Source: https://www.javatpoint.com/java-localdate
-   Java LocalDate class is an immutable class that represents Date 
    with a default format of yyyy-mm-dd.

--  java.time.LocalDateTime
-   Source: https://www.javatpoint.com/java-localdatetime
-   Java LocalDateTime class is an immutable date-time object that represents a date-time,
    with the default format as yyyy-MM-dd-HH-mm-ss.zzz.

--  java.time.Period
-   Source: https://www.javatpoint.com/java-period
-   The  Period class creates immutable objects and is usually used to add/subtract from a 
    LocalDate or LocalDateTime object. It allows creating date, week, month, or year periods.

-- java.time.format
-  Source:  https://docs.oracle.com/javase/8/docs/api/java/time/format/package-summary.html
-   Provides classes to print and parse dates and times. 
-   When creating a formatter object, remember that MM represents month while mm represents minute.
*/

public class TimeEx1 {
    public static void main(String[] args) {
        LocalDate newYears = LocalDate.of(2017, 1, 1);                          // set date
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");   // set format
        
        Period period1 = Period.ofWeeks(1).ofDays(3);                           // set period (can't use chaining so only foDays set the value)
        Period period2 = Period.ofDays(10);

        System.out.print(format.format(newYears.plus(period1)) +"\n");    // 04-01-2017     (adds 03 days)
        System.out.print(format.format(newYears.plus(period2)));          // 11-01-2017     (adds 10 days)

    }
}
