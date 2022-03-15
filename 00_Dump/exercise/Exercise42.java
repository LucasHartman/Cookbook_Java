public class Exercise42 {
    int id;
    Exercise42(int i) { id = i;}
    public static void main(String[] args) {
        Exercise42 h1 = new Exercise42(1);
        Exercise42 h2 = h1.go(h1);
        System.out.println(h2.id); // 1
    }

    Exercise42 go(Exercise42 h) {
        Exercise42 h3 = h;
        h3.id = 2;
        h1.id = 3; // out of scope
        return h1; // out of scope
    }
}
