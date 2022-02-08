public class TryCatchEx6 {
    public static void main(String[] form) {
        String street = "350 5th Ave - New York";
        String city = "Posted:350 5th Ave - New York";
        System.out.print(new TryCatchEx6().getAddress(street,city));
     }


    public String getAddress(String street, String city) {
       try { return street.toString() + " : " + city.toString();
       } finally { System.out.print("Fosted: "); // this comes first
       }
    }

 }