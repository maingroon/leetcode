package com.maingroon;

import java.util.HashSet;
import java.util.Set;

public class Solution2154 {

    public int findFinalValue(int[] nums, int original) {
        Set<Integer> values = new HashSet<>();
        for (int num : nums) {
            values.add(num);
        }
        while (values.contains(original)) {
            original *= 2;
        }
        return original;
    }

//    first try solution
//    public int findFinalValue(int[] nums, int original) {
//        for (int i = 0; i < nums.length;) {
//            if (nums[i] == original) {
//                original *= 2;
//                i = 0;
//            } else {
//                i++;
//            }
//        }
//        return original;
//    }
}
