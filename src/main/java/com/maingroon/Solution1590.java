package com.maingroon;

class Solution1590 {
    public int minSubarray(int[] nums, int p) {
        int rem = 0;
        for (int num : nums) {
            rem = (rem + num) % p;
        }
        
        if (rem == 0) {
            return 0;
        }

        int curRem = 0;
        int minLen = nums.length;
        Map<Integer, Integer> modMap = new HashMap<>();
        modMap.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            curRem = (curRem + nums[i]) % p;
            int needed = (curRem - rem + p) % p;
            if (modMap.containsKey(needed)) {
                minLen = Math.min(minLen, i - modMap.get(needed));
            }
            modMap.put(curRem, i);
        }

        return minLen == nums.length
            ? -1
            : minLen;
    }
}