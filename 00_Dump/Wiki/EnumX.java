public class EnumX {

    enum Days { M, T, W, TH, F, SA, SU};

    public static void main(String[] args) {

        for(Days d : Days.values()) {
            System.out.println("day: " +d);
        }

        System.out.println(Days.TH == Days.M); // false
        System.out.println(Days.TH.equals(Days.M)); // false
    }
    
}
