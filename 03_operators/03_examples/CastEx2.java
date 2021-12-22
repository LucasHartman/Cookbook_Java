
class Base {
    public void test() {
        System.out.print("Base");
    }
}

class DerivedA extends Base {
    public void test() {
        System.out.print("DerivedA");
    }
}

class CastEx2 extends DerivedA {
    public void test() {
        System.out.print("CastEx2");
    }

    public static void main(String[] args) {

        Base b1 = new CastEx2();
        Base b2 = new DerivedA();
        Base b3 = new CastEx2();

        b1 = (Base) b3; // CastEx2 (Wide Casting)

        Base b4 = (DerivedA) b3; // CastEx2 (Narrowing Casting)

        b1.test(); // result: CastEx2
        b4.test(); // result: CastEx2
    }
    
}
