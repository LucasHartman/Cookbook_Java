import java.util.Arrays;

/*
-- binarySearch
-   input list and search key, returns the index position
-   elements have to be sorted in ascending order.
-   it can be sorted using the method Arrays.sort(arr).
-   Compared to linear search, binary search is considered to be faster. 
-   if an element is searched and not found, the index’s negative value 
    will be returned if that element was present.
*/

public class BinarySearchEx1 {
    
    public static void main(String[] args) {
    
        // byte array
        byte ba[] = {05, 10, 15, 20, 30};

        // character array
        char ca[] = {'a','n','s','p','v','i','d'};

        // integer array
        int ia[] = {10, 20, 15, 20, 22, 35};

        // double array
        double da[] = {10.1, 15.34, 22.35, 13.5};

        // float array
        float fa[] = {13.4f, 25.1f, 22.2f, 43.5f};



        // sort all the arrays
        Arrays.sort(ba);
        Arrays.sort(ca);
        Arrays.sort(ia);
        Arrays.sort(da);
        Arrays.sort(fa);


        // key element that has to be searched
        byte bKey = 15;
        char cKey = 'c';
        int iKey = 22;
        double dKey = 15.34;
        float fKey = 22.2f;


        // Find Element
        System.out.println("Element "+ bKey + " is found at the position of " + Arrays.binarySearch(ba,bKey) ); // 2
        System.out.println("Element "+ cKey + " is found at the position of " + Arrays.binarySearch(ca,cKey) ); // -2
        System.out.println("Element "+ iKey + " is found at the position of " + Arrays.binarySearch(ia,iKey) ); // 4
        System.out.println("Element "+ dKey + " is found at the position of " + Arrays.binarySearch(da,dKey) ); // 2
        System.out.println("Element "+ fKey + " is found at the position of " + Arrays.binarySearch(fa,fKey) ); // 1

    }
}
