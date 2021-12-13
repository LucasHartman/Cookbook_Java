public static Try-with-resourcesEx1 {

    /*
    -- Try-with-resources
    -   The try-with-resources statement is a try statement that declares one or more resources.
    -   The try-with-resources statement ensures that each resource is closed at the end of the statement.
    -   This feature is also known as automatic resource management
    -    Each resource in a try-with-resources statement must have its own data type 
        and be separated by a semicolon (;)
    -   A source can be null      FileReader r = null
    -   


    */

    public void readFile(String file) {
        
        try ( FileInputStream is = new FileInputStream("myfile.txt") ) { // <---- declare
             // Read file data
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}