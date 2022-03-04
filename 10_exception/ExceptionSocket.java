import java.net.SocketException;

public class ExceptionSocket {
    public static void main(String[] args) throws SocketException {
        throwSocketException();
    }

    static void throwSocketException () {
        try {
            throw new SocketException();
        } catch (SocketException e) {
            System.out.println("Caught ShoutException");
        }
    }
    
}
