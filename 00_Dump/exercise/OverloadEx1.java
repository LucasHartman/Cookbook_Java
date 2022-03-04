public class OverloadEx1 {

    public int myMethod(int x) {
        return x + x;
    }

    protected String myMethod(String x) {
        return x + x;
    }

    private char myMethod(char x) throws IndexOutOfBoundsException {
        return x;
    }

    public static void main(String[] args) {
        
        OverloadEx1 obj = new OverloadEx1();
        obj.myMethod(1);
        obj.myMethod("String");
        obj.myMethod('a');
    }
    
}
