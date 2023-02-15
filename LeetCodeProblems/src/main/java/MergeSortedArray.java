package main.java;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        //test 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        //test 2
        int[] nums21 = {1};
        int[] nums22 = {0};

        //test 3
        int[] nums31 = {0};
        int[] nums32 = {1};

        MergeSortedArray sortedArray = new MergeSortedArray();
        sortedArray.merge(nums1, 3, nums2, 3);
        sortedArray.merge(nums21, 1, nums22, 0);
        sortedArray.merge(nums31, 0, nums32, 1);

        System.out.println(Arrays.deepToString(new int[][]{nums1}));
        System.out.println(Arrays.deepToString(new int[][]{nums21}));
        System.out.println(Arrays.deepToString(new int[][]{nums31}));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m + n - 1;
        while (i >= 0) {
            if (m == 0 && n > 0) {
                nums1[i] = nums2[n - 1];
                n--;
            } else if (m > 0 && n == 0) {
                nums1[i] = nums1[m - 1];
                m--;
            } else if (nums1[m - 1] > nums2[n - 1]) {
                nums1[i] = nums1[m - 1];
                m--;
            } else {
                nums1[i] = nums2[n - 1];
                n--;
            }
            i--;
        }
    }
}
