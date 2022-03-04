public class RemoveCodeEx1 {
    public static void main(String[] args) {
        
    String race = "";

    outer: do {                         // no need for label
        inner: do {                     // no need for label
            race += "x";
        } 
        while (race.length() <= 4);
    } while (race.length() < 4);        // this do/while has no function

    System.out.println(race);           // xxxxx
    }
}
