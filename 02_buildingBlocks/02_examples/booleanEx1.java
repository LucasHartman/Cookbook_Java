public class booleanEx1 {

    // Commands:
    // java booleanEx1 TRUE Null

    public static void main(String[] args) {

        boolean a = new Boolean(Boolean.valueOf(args[0])); // true
        boolean b = new Boolean(Boolean(args[1]); // false

        System.out.println(a +" " +b); // true false (boolean can't be null)
    }