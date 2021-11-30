public class CastEx1 {

    public static void main(String[] args) {
        
        short height = 1, weight = 3;
        short zebra = (byte) weight * (byte) height; // Error 
        // multiplication operator automatically promotes them to int
        // int does not store in a short type value
        System.out.println(zebra);
    }
    
}
