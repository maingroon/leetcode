package com.maingroon;

public class Solution1437 {

    public boolean kLengthApart(int[] nums, int k) {
        int dis = k;
        for (int num : nums) {
            if (num == 0) {
                dis++;
            } else {
                if (dis < k) {
                    return false;
                }
                dis = 0;
            }
        }
        return true;
    }
}
