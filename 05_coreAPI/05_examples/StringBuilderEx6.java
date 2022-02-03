/*
Does note Compile: 
Calling the constructor and then insert() is an example of method chaining. 
However, the sb.length() call is a problem. 
The sb reference doesn’t exist until after the chained calls complete.
*/


public class StringBuilderEx6 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("radical").insert(sb.length(), "robots");
        // error: variable sb might not have been initialized




    }
}