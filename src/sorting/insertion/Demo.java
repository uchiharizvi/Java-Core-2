package sorting.insertion;

import sorting.PrintArray;
import sorting.bubble.BubbleSort;

public class Demo {
    public static void main(String[] args) {
        InsertSort bs = new InsertSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bs.sort(arr);
        System.out.println("Insertion Sorted :");
        PrintArray.print(arr);
    }
}
