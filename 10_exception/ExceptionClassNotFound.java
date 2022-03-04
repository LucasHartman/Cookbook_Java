public class ExceptionClassNotFound {
    public static void main(String[] args) throws ClassNotFoundException {
        throwClassNotFoundException();
    }

    static void throwClassNotFoundException() {
        try {
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException e) {
            System.out.println("Caught Checked ClassNotFoundException");
        }
    }
    
}
