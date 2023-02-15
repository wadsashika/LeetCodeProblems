package main.java;

public class ClimbingStairs {

    public static void main(String[] args) {
        ClimbingStairs stairs = new ClimbingStairs();
        System.out.println(stairs.climbStairs(2));
        System.out.println(stairs.climbStairs(3));
        System.out.println(stairs.climbStairs(4));
        System.out.println(stairs.climbStairs(5));
        System.out.println(stairs.climbStairs(6));
    }

    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        int[] num = new int[n];
        num[0] = 1;
        num[1] = 2;

        for (int i = 2; i < n; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }
        return num[n - 1];
    }
}
