public class CommandInputEx1 {

    // Command line invocation:     java CommandLineInputEX1

    public static void main(String[] args) {

        for (int x=1; x<args.length; x++) {
            System.out.print(args[x] +" "); 
            // output:(no output is produced
            // and no runtime exception is thrown)
        }
    }   
}