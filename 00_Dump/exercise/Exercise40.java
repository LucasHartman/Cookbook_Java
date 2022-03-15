public class Exercise40 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1;
        s1 += "d"; // String can't be mutated
        System.out.println(s1 + " " + s2 + " " + (s1==s2)); // abc abc true

        StringBuilder sb1 = new StringBuilder("abc"); // abc
        StringBuilder sb2 = sb1; // abc
        sb1.append("d"); // abcd
        System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2)); // abcd abcd true (sb1 is still referencing sb1, so they are the same)
    }    
}
