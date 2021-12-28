/*
-- Convariant --
Method Override, you can't change the return type,
but you could NARROW it down throught 'Primitive casting' or 'Reference Casting'

*/

class Parent {

    public Number addUp(float a, float b) {
        Number result = a + b;
        return result; // output floot

    }
}

public class Covariant extends Parent {

    @Override
    public Integer addUp(float a, float b) {
        return (int) (a + b); // output int
    }

    public static void main(String[] args) {

        Covariant sub = new Covariant();
        System.out.println(sub.addUp(25.5f, 89.225f)); // 114

    }
}
