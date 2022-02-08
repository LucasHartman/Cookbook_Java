public class StringBuilderEx4 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<1000; i++) {
            s = " " +i;             // creates a new String object. (*1000)
            sb.append(s);           // changing the single StringBuilder object 

            // If the garbae collector does NOT run while the code is executing,
            // About 1000 object will exist in memory 
        }


    }
}