class Foo {

    private int x;
    
    public Foo(int x) { this.x = x; }           // constructor setter
    public void setX(int x)  {this.x = x; }     // setter
    public int getX() { return x; }             // getter
}

public class javaBeanEx2 {

    static Foo fooBar ( Foo foo ) {             // statc method, type class, input class
        foo = new Foo( 100 );                   // parameter variable = new class, initialize constructor
        return foo;                             // return class
    }

    public static void main(String[] args) {

        Foo foo = new Foo ( 300 );              // Object refence, initialize constructor
        System.out.print( foo.getX() + "-");    // 300 -

        Foo fooFoo = fooBar ( foo);             // class type variable = static method(input Object Reference)
        System.out.print ( foo.getX() +"-");    // 300 -
        System.out.print ( fooFoo.getX() +"-"); // 100 -

        foo = fooBar ( fooFoo );
        System.out.print( foo.getX() +"-");     // 100 -
        System.out.print( fooFoo.getX());       // 100

    }
}