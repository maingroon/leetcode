package com.maingroon;

import java.util.ArrayList;
import java.util.List;

public class Solution1018 {

    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>(nums.length);
        int prefix = 0;
        for (int num : nums) {
            prefix = ((prefix << 1) + num) % 5;
            result.add(prefix == 0);
        }
        return result;
    }
}
