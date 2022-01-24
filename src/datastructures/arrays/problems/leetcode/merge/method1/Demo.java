package datastructures.arrays.problems.leetcode.merge.method1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 0;
        int n = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != 0) m++;
        }
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] != 0) n++;
        }
        solution.merge(nums1,m,nums2,n);
    }
}
