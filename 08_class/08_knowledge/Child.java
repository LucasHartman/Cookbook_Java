class Person {
    
    //inst var
    static String name;

    // setter
    void setName(String q) { name = q; } }



public class Child extends Person {

    // hidden var
    static String name;

    // Setter Overrides
    void setName(String w) { name =w;}


    public static void main(String[] p) {

        // ref object sub class
        final Child m = new Child(); // creates a Child instance, which is implicitly cast to a Person reference type

        // call type varialbe
        final Person t = m; // implicitly cast to a Person reference type


        m.name = "Elysia";
        t.name = "Sopha"; // output
        m.setName("Webby");
        t.setName("Olivia"); // output
        System.out.println(m.name + " "+ t.name); // Olivia Sophia
    } }
