
    /** Encapsulation 
     * 
     * - The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
     * 
     * - declare class variables/attributes as private
     * 
     * - provide public get and set methods to access and update the value of a private variable
     * 
     * -  Instance variables must include the private access modifier
     * 
     * 
     */

public class Encapsulation {

    // private
    // only code within the class can read or write the value of numberEggs.
    private int numberEggs;                     

    // get
    // Getter Method to use outside this class, to get the private variable numberEggs
    public int getNumberEggs() {
        return numberEggs;
    }

    // set
    // Mutator Method to use outside this class, to set the private variable numberEggs
    public void setNumberEggs(int newEggNumber) {
        this.numberEggs = newEggNumber;
    }  


    public static void main(String[] args) {
        
        // set instancve variable
        new Encapsulation().setNumberEggs(33);

    }

}
