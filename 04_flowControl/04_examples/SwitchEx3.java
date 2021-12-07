enum DayOfWeek {
    MONDAy,
    THURSDAY,
    WENSDAy,
    THURSDAy,
    FRIDay,
    SATERDAY,
    SUNDAY
  }
  
  public class SwitchEx3 {

    private DayOfWeek getWeekDay(int day, final int thursday) {
        int otherDay = day;
        int Sunday = 0; // must be final to use in a case

        switch(otherDay) {
            default:
            case 1: continue; // Errors: continue cannot be used inside a switch
            case thursday: return DayOfWeek.THURSDAY; 
            // case value must be desided at compile time (compiletime constant) not at runtime
            case 2: break;
            case Sunday: return DayOfWeek.SUNDAY; // Sunday is not compile-time constant
            case DayOfWeek.MONDAY: return DayOfWeek.MONDAY; // DayOfWeek.MONDAY is not Int value
        }
        return DayOfWeek.FRIDAY;
    }

    public static void main(String[] args) {

        getWeekDay(1, 2);
        
    }
    
}
