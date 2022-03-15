public class Exercise53 {
    public static void main(String[] args) {
        String s = "JAVA"; // JAVA
        s = s+ "rocks"; // JAVArocks
        s = s.substring(4,8); // rock
        s.toUpperCase(); // no effect, not associated with the variable
        System.out.println(s); // rock
    }
}
