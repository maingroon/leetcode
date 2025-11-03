package com.maingroon;

public class Solution1578 {

    public int minCost(String colors, int[] neededTime) {
        int cost = 0;
        int lastColorIdx = 0;
        for (int idx = 1; idx < colors.length(); idx++) {
            if (colors.charAt(lastColorIdx) == colors.charAt(idx)) {
                if (neededTime[lastColorIdx] < neededTime[idx]) {
                    cost += neededTime[lastColorIdx];
                    lastColorIdx = idx;
                } else {
                    cost += neededTime[idx];
                }
            } else {
                lastColorIdx = idx;
            }
        }
        return cost;
    }
}
