public class deleteEx1 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Lucas");
        System.out.println(sb);
        
        sb.delete(0,0);     // Lucas
        System.out.println(sb);

        sb.delete(0,1);     // ucas
        System.out.println(sb);
        
        sb.delete(1,1);     // ucas
        System.out.println(sb);
    }
    
}
