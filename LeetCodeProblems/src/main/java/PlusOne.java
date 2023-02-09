package main.java;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        int[] input1 = {1, 2, 3};
        int[] input2 = {9};
        int[] input3 = {9, 9, 9, 9, 9, 9};

        PlusOne obj = new PlusOne();
        System.out.println(Arrays.deepToString(new int[][]{obj.plusOne(input1)}));
        System.out.println(Arrays.deepToString(new int[][]{obj.plusOne(input2)}));
        System.out.println(Arrays.deepToString(new int[][]{obj.plusOne(input3)}));
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = digits[i] + 1;
            if (temp == 10) {
                digits[i] = 0;
            } else {
                digits[i] = temp;
                return digits;
            }
        }

        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        System.arraycopy(digits, 0, arr, 1, arr.length - 1);

        return arr;
    }
}
