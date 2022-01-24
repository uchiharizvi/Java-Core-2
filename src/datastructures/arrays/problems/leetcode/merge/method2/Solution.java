package datastructures.arrays.problems.leetcode.merge.method2;

import java.util.Arrays;

public class Solution {
    /**
     * Merge Sorted Array
     **/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        for(int i=0;i<m;i = i+1){
            result[i] = nums1[i];
        }
        for(int i=0;i<n;i = i+1){
            result[m+i] = nums2[i];
        }
        Arrays.sort(result);
        for(int i=0;i<result.length;i = i+1){
            System.out.println(result[i]);
        }
        //use arrayCopy
        /*System.arraycopy(nums1, 0, result, 0, m);
        System.arraycopy(nums2, 0, result, m, n);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));*/
    }
}
