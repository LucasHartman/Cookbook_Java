
public class OhNo {

    public void ohNo(ArithmeticException ae) throws Exception {
        if (ae == null)
            throw new Exception();
        else
            throw ae;

    }

    public static void main(String[] args) {

        OhNo obj = new OhNo();
        obj.ohNo(null);

    }
}
