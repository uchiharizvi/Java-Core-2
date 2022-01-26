package problems.leetcode.algo.easy.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(arr, 2, 0, arr.length - 1));
    }

    public static int search(int[] nums, int target, int l, int r) {
        return binarySearch(nums, target, 0, nums.length - 1);

    }

    private static int binarySearch(int[] nums, int target, int l, int r) {
        if (r >= 1) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) return binarySearch(nums, target, l, mid);
            return binarySearch(nums, target, mid + 1, r);
        }
        return -1;
    }
}
