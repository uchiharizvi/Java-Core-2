package datastructures.arrays.problems.leetcode.merge.method1;

import java.util.Arrays;

public class Solution {
    /**
     * Merge Sorted Array
     **/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        //use arrayCopy
        System.arraycopy(nums1, 0, result, 0, m);
        System.arraycopy(nums2, 0, result, m, n);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}
