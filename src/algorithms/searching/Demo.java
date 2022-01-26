package algorithms.searching;

public class Demo {
    public static void main(String[] args) {
        Search search = new Search();
        int arr[] = {2,3,4,10,40};
        int x = 10;
        int result = search.linearSearch(arr,x);
        System.out.println("Linear Search");
        System.out.println("__________________");
        if(result == -1) System.out.println("Element not Present");
        else System.out.println("Element Present at index " + result);
        System.out.println("Binary Search");
        System.out.println("__________________");
        int result2 = search.binarySearch(arr,0,arr.length-1,x);
        if(result2 == -1) System.out.println("Element not Present");
        else System.out.println("Element Present at index " + result2);
    }
}
