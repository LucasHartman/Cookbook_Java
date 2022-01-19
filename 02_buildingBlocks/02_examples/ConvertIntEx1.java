public class ConvertIntEx1 {

    // Error: can't convert int to String
    public String convert(int value) {
        return value.toString();
    }

    public String convert(Integer value) {
        return value.toString();
    }

    public String convert(Object value) {
        return value.toString();
    }



    public static void main(String[] args) {

        ConvertIntEx1 obj = new ConvertIntEx1();

        obj.convert(2);

    }
}