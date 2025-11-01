package com.maingroon;

import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();
        for (int idx = 0; idx < nums.length; idx++) {
            if (numIndexMap.containsKey(target - nums[idx])) {
                return new int[]{numIndexMap.get(target - nums[idx]), idx};
            }
            numIndexMap.put(nums[idx], idx);
        }
        throw new IllegalArgumentException("No two sum solution found");
    }

//    first attempt solution
//    public int[] twoSum(int[] nums, int target) {
//        for (int fni = 0; fni < nums.length - 1; fni++) {
//            for (int sni = fni + 1; sni < nums.length; sni++) {
//                if (nums[fni] + nums[sni] == target) {
//                    return new int[]{fni, sni};
//                }
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution found");
//    }
    }
