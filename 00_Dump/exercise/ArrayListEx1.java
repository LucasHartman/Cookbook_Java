import java.util.ArrayList;

public class ArrayListEx1 {

    static ArrayList<String> myList = new ArrayList<>();
    

    public static void main(String[] args) {
        
        myList.add("Fish");
        myList.add("Dog");
        myList.add("Bird");
        myList.add(0,"Duck");
        System.out.println("print List: " +myList);

        myList.addAll(myList);
        System.out.println("print List: " +myList);

        String getByIndex = myList.get(0);
        System.out.println("get index 0:" +getByIndex);

        int myIndexOf = myList.indexOf("Dog");
        System.out.println("index of Dog: " +myIndexOf); // index of the first "Dog" in list
        System.out.println("index of Ape: " +myList.indexOf("Ape"));

        int myLastIndexOf = myList.lastIndexOf("Dog");
        System.out.println(myLastIndexOf); // index of the last "Dog" in list


    }
    
}
