package algorithms.searching;

public class Search {
    public int linearSearch(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public int binarySearch(int arr[], int l, int r, int x) {
        if (r >= 1) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) return mid;
            if (arr[mid] > x) return binarySearch(arr, l, mid - 1, x);//recursion
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
