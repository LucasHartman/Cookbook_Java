public class Exercise35 {

    public static void main(String[] args) {
        
        int intVal = 1;
        long longVal = 1;

        // int -> Integer (autocast)
        Integer IntVal = intVal;

        // int -> Long (incompatible type)
        //Long LongVal = intVal;

        // int -> Long (incompatible type)
        Short ShortVal = intVal;

        // short -> Short
        Short ShortVal = (short)intVal;
    }
    
}
