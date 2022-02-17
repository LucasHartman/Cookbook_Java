import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;

/*
-- java.time.LocalDate
-   Represents a date   yyyy-MM-dd
-   years               yyyy
-   month               MM
-   day                 dd
-   LocalDate obj =                 LocalDate.now();            // 2022-02-17
-   DateFormatter formatObj =       DateFormatter.ofPattern("dd-MM-yyyy");
-   String formatDateObj =          obj.format(formatObj);      // 17-02-2022


-- java.time.LocalTime
-   Represents a time   HH-mm-ss-ns
-   hour                HH
-   minute              mm
-   second              ss
-   nanosecond          ns
-   LocalTime obj =                 LocalTime.now();            // 10:44:59.831399
-   TimeFormatter formatObj =       TimeFormatter.ofPattern("HH:mm:ss");
-   String formatTimeObj =          obj.format(formatObj);      // 10:55:36


-- java.time.LocalDateTime
-   date and time       yyyy-MM-dd-HH-mm-ss-ns
-   years               yyyy
-   month               MM
-   day                 dd   
-   hour                HH
-   minute              mm
-   second              ss
-   nanosecond          ns
-   LocalDateTime obj =             LocalDateTime.now();        // 2022-02-17T10:44:59.831643 
-   DateTimeFormatter formatObj =   DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
-   String formatDateTimeObj =      obj.format(formatObj);      // 17-02-2022 10:55:36

*/

public class TimeEx1 {

    /*------------------------------------------------------------------
                    Date, Time, Date/Time & Formatting
    -------------------------------------------------------------------*/

    static LocalDate dateNow            = LocalDate.now();
    static LocalDate dateInput          = LocalDate.of(1990,03,22);
    static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    static String dateNowFormat         = dateNow.format(dateFormat);

    static LocalTime timeNow            = LocalTime.now();
    static LocalTime timeInput          = LocalTime.of(23,59,5);
    static DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
    static String timeNowFormat         = timeNow.format(timeFormat);   

    static LocalDateTime dateTimeNow    = LocalDateTime.now();
    static LocalDateTime dateTimeInput  = LocalDateTime.of(1990, 03, 22, 23, 59, 5);
    static DateTimeFormatter dateTimeFormat= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    static String dateTimeNowFormat     = dateTimeNow.format(dateTimeFormat);
    

    /*------------------------------------------------------------------
                            Add/Subtract/between Period
    -------------------------------------------------------------------*/

    // add year
    static Period periodYear             = Period.ofYears(1);
    static LocalDate dateAddYear         = dateNow.plus(periodYear);
    static String finalDateAddYear       = dateAddYear.format(dateFormat); 

    // add month
    static Period periodMonth            = Period.ofMonths(1);
    static LocalDate dateAddMonth        = dateNow.plus(periodMonth);
    static String finalDateAddMonth      = dateAddMonth.format(dateFormat); 

    // add week
    static Period periodWeek            = Period.ofWeeks(1);
    static LocalDate dateAddWeek        = dateNow.plus(periodWeek);
    static String finalDateAddWeek      = dateAddWeek.format(dateFormat); 

    // subtract day
    static Period periodDays            = Period.ofDays(1);
    static LocalDate dateMinusDay       = dateNow.minus(periodDays);
    static String finalDateMinusDay     = dateMinusDay.format(dateFormat); 


    // between dates
    static Period betweenDates          = Period.between(dateNow, dateInput);
    static String betweenDatesDay       = Integer.toString(betweenDates.getDays());
    static String betweenDatesMonths    = Integer.toString(betweenDates.getMonths());
    static String betweenDatesYears     = Integer.toString(betweenDates.getYears());


    public static void main(String[] args) {

        System.out.println(
            "\nCurrent Date: " +dateNowFormat 
        +   "\nCurrent Time: " +timeNowFormat
        +   "\nDate & Time:  " +dateTimeNowFormat);

        System.out.println(
                "\nCurrent Date + Year:  "   +finalDateAddYear         
            +   "\nCurrent Date + Month: "   +finalDateAddMonth      
            +   "\nCurrent Date + Week:  "   +finalDateAddWeek
            +   "\nCurrent Date - day:   "   +finalDateMinusDay
        );

        System.out.println(
                "\nbetween dates in Days   " +betweenDatesDay
            +   "\nbetween dates in Weeks: " +betweenDatesMonths
            +   "\nbetween dates in Years: " +betweenDatesYears
        );
    }
}
