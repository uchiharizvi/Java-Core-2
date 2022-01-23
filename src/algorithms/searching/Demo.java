package algorithms.searching;

public class Demo {
    public static void main(String[] args) {
        Search search = new Search();
        int arr[] = {2,3,4,10,40};
        int x = 10;
        int result = search.linearSearch(arr,x);
        if(result == -1) System.out.println("Element not Present");
        else System.out.println("Element Present at index " + result);
    }
}
