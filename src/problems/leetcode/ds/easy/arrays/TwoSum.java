package problems.leetcode.ds.easy.arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        int target = 6;
        arr = twoSum(arr, target);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        return calculateTwoSum(nums, 0, nums.length - 1, target);
    }

    private static int[] calculateTwoSum(int[] nums, int start, int end, int target) {
        int cur = 0;
        int[] res = new int[2];
        for (int i = start; i <= start + 1; i++) {
            cur += nums[i];
        }
        if (cur == target) {
            res[0] = start;
            res[1] = start + 1;
        } else {
            calculateTwoSum(nums, start + 1, end, target);
        }
        return res;
    }
}
