package com.maingroon;

import java.util.ArrayList;
import java.util.List;

public class Solution3542 {

    public int minOperations(int[] nums) {
        int operations = 0;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            while (!list.isEmpty() && list.getLast() > num) {
                list.removeLast();
            }
            if (num != 0 && (list.isEmpty() || list.getLast() < num)) {
                operations++;
                list.add(num);
            }
        }
        return operations;
    }
}
