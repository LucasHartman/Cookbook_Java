public class ContinueEx4 {

    public static void main(String[] args) {

        char ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x','y', 'z' };

        letters: for (char ch='a'; ch<='z'; ch++) {
            numbers: for (int n=0; n<=10; n++) {
            System.out.println(ch);
            continue letters;
            }
        }
    }
}
