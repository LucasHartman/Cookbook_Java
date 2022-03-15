public class Exercise45 {
    Exercise45(int x, Exercise45 n) {
        id = x; // class instance = input x
        p = this; // this class
        if(n != null) p = n; // n is not null p becomes input n
    }

    int id;         // initialized inside constructor
    Exercise45 p;   // initialized inside constructor
    public static void main(String[] args) {
        Exercise45 n1 = new Exercise45(1, null); // initialize constructor: 1, this
        n1.go(n1);
    }

    void go(Exercise45 n1) {
        Exercise45 n2 = new Exercise45(2, n1); // 2 this
        Exercise45 n3 = new Exercise45(3, n2); // 3 this
        System.out.println(n3.p.p.id); // 1     n3 n2.p n1.p = 1
    }

    
}
