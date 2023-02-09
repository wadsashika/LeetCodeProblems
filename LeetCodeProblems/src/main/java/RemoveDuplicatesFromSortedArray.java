package main.java;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
        System.out.println(obj.removeDuplicates(nums1));
        System.out.println(obj.removeDuplicates(nums2));
    }

    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
