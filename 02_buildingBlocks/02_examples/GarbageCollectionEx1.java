

class public GarabeCollectionEx1 {

    public static void main(String[] fruits) {
        String fruit1 = new String("apple");
        String fruit2 = new String("orange"); // eligible for garbage collection
        String fruit3 = new String("pear");   // eligible for garbage collection
         
        fruit3 = fruit1; // apple
        fruit2 = fruit3; // apple
        fruit1 = fruit2; // apple
        }
}