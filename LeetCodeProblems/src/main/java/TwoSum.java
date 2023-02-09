package main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 18;

        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.deepToString(new int[][]{twoSum.twoSum(nums, target)}));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> passedMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (passedMap.containsKey(remainder)) {
                return new int[]{passedMap.get(remainder), i};
            } else {
                passedMap.put(nums[i], i);
            }
        }
        return null;
    }
}
