public class StringBuilderEx5 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("\nradical ");


        StringBuilder sb1 = new StringBuilder("\nradical ")
        .append("robots");
        System.out.print(sb1); // radical robots

        StringBuilder sb2 = new StringBuilder("\nradical ")
        .delete(1, 100)
        .append("obots")
        .insert(1,  "radical r");
        System.out.print(sb2); // radical robots

        StringBuilder sb3 = new StringBuilder("\nradical ")
        .insert(7, "robots");
        System.out.print(sb3); // radicalrobotsl <------------- different

        StringBuilder sb4 = new StringBuilder("\nradical ")
        .insert(sb.length(), "robots");
        System.out.print(sb4); // radical robots


    }
}