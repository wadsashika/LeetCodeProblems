package main.java;

public class Sqrtx {
    public static void main(String[] args) {
        Sqrtx sqrtx = new Sqrtx();
        System.out.println(sqrtx.mySqrt(4));
        System.out.println(sqrtx.mySqrt(8));
        System.out.println(sqrtx.mySqrt(9));
        System.out.println(sqrtx.mySqrt(300));
        System.out.println(sqrtx.mySqrt(2147395600));
    }

    public int mySqrt(int x) {
        int left = 1;
        int right = x;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (x / mid == mid) {
                return mid;
            } else if (mid > x / mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
