import java.io.IOException;

public class ExceptionIO {
    public static void main(String[] args) throws IOException {
        new ExceptionIO().throwsIOException();
    }


    void throwsIOException() {
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Caught Checked IOException");
        }
    }  
}
