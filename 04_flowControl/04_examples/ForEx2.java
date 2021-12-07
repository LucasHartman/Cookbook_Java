public class ForEx2 {

    public static void main(String[] args) {

        int[] weather = {1,2,3,4,5};
        
        // iterate upwards
        for( int i=0; i<=weather.length-1; ++i ) {
            System.out.println(weather[i]);
            }

        // iterate downwards
        for( int i=weather.length-1; i>=0; i-- ) {
            System.out.println(weather[i]);
            }

    }
    
}
