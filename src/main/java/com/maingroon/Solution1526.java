package com.maingroon;

class Solution1526 {

    public int minNumberOperations(int[] target) {
        int operations = target[0];
        for (int idx = 1; idx < target.length; idx++) {
            operations += Math.max(0, target[idx] - target[idx - 1]);
        }
        return operations;
    }
}
