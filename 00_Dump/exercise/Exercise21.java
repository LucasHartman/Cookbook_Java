/*
The first compilation problem with the code is that the second catch block in
openDrawbridge() is unreachable since CableSnapException is a subclass of
OpenDoorException. 
The catch blocks should be ordered with the more narrow exception
classes before the broader ones. 

Next, the variable ex is declared twice within the same
scope since it appears in the second catch block as well as the embedded try-catch block.

Finally, the openDrawbridge() method declares the checked Exception class, but it is not
handled in the main() method with a try-catch block, nor in the main() method declara-
tion. For these three reasons, Option D is correct.
*/

class OpenDoorException extends Exception {}
class CableSnapException extends OpenDoorException {}

public void Exercise21() throws Exception { //  declares the checked Exception class, 
                                            //  but it is not handled in the main() method with a try-catch block, 
                                            //  nor in the main() method declaration.
    try {
        throw new Exception("Problem");
    } catch (OpenDoorException e) {     // The catch blocks should be ordered with the more narrow exception classes before the broader ones.
        throw new OpenDoorException();
    } catch (CableSnapException ex) {   // unreachable since CableSnapException is a subclass of OpenDoorException.
    
        try {
            throw new OpenDoorException();
        } catch (Exception ex) {        // the variable ex is declared twice within the same
                                        // scope since it appears in the second catch block as 
                                        // well as the embedded try-catch block.
        } finally {
            System.out.println("Almost done");
        }

    } finally {
        throw new RuntimeException("Unending problem");
    }

    public static void main(String[] moat) throws IllegalArgumentException { 
        new Palace().Exercise21();
    }
}