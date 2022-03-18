public class StringX {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1; // unmutable
        s1 += "d"; // becomes a new reference
        System.out.println(s1 +" " +s2 +" " +(s1==s2)); // abcd abc false (don't share the same reference)
    }
    
}
