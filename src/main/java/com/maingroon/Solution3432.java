package com.maingroon;

public class Solution3432 {

    public int countPartitions(int[] nums) {
        int left = 0;
        int right = 0;
        for (int num : nums) {
            right += num;
        }

        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            left += nums[i - 1];
            right -= nums[i - 1];
            if ((left - right) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
