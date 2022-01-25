package problems.leetcode.array.easy.merge.method3;

import java.util.Arrays;

public class Solution {
    /**
     * Merge Sorted Array
     **/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m; i<m+n && j<n; i++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
