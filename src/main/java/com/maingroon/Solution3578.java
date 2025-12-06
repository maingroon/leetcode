package com.maingroon;

public class Solution3578 {

    private static final int MOD = 1000000007;

    public int countPartitions(int[] nums, int k) {
        long count = 1;
        int begin = 0;
        int min = 0;
        int max = 0;
        for (int cur = 1; cur < nums.length; cur++) {
            int num = nums[cur];
            if (num < nums[min]) {
                min = cur;
            }
            if (num > nums[max]) {
                max = cur;
            }
            while (diffGreater(nums[min], nums[max], k)) {
                min = findMin(nums, begin + 1, cur);
                max = findMax(nums, begin + 1, cur);
                begin++;
            }

            count += cur - begin;
        }
        return (int) (count % MOD);
    }

    private boolean diffGreater(int a, int b, int k) {
        return Math.abs((long) a - b) > k;
    }

    private int findMin(int[] nums, int from, int to) {
        int min = nums[from];
        from++;
        while (from <= to) {
            if (nums[from] <= nums[min]) {
                min = from;
            }
            from++;
        }
        return min;
    }

    private int findMax(int[] nums, int from, int to) {
        int max = nums[from];
        from++;
        while (from <= to) {
            if (nums[from] >= nums[max]) {
                max = from;
            }
            from++;
        }
        return max;
    }
}
