package com.maingroon;

import java.util.ArrayList;
import java.util.List;

public class Solution3562 {

    private List<Integer>[] children;
    private int[] present;
    private int[] future;
    private int budget;

    public int maxProfit(int n, int[] present, int[] future, int[][] hierarchy, int budget) {
        this.present = present;
        this.future = future;
        this.budget = budget;

        createHierarchy(n, hierarchy);

        int[][] result = dfs(1);

        int maxProfit = 0;
        for (int b = 0; b <= budget; b++) {
            maxProfit = Math.max(maxProfit, result[0][b]);
        }

        return maxProfit;
    }

    private void createHierarchy(int n, int[][] hierarchy) {
        children = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            children[i] = new ArrayList<>();
        }

        for (int[] relation : hierarchy) {
            int boss = relation[0];
            int subordinate = relation[1];
            children[boss].add(subordinate);
        }
    }

    private int[] combine(int[] dp1, int[] dp2) {
        int[] newDp = new int[budget + 1];
        for (int b1 = 0; b1 <= budget; b1++) {
            for (int b2 = 0; b1 + b2 <= budget; b2++) {
                newDp[b1 + b2] = Math.max(newDp[b1 + b2], dp1[b1] + dp2[b2]);
            }
        }
        return newDp;
    }

    private int[][] dfs(int employee) {
        int costWithoutDiscount = present[employee - 1];
        int profitWithoutDiscount = future[employee - 1] - costWithoutDiscount;
        int costWithDiscount = present[employee - 1] / 2;
        int profitWithDiscount = future[employee - 1] - costWithDiscount;

        int[] dpWithoutChildren = new int[budget + 1];
        int[] dpWithChildren = new int[budget + 1];

        dpWithoutChildren[0] = 0;
        dpWithChildren[0] = 0;

        List<int[][]> childResults = new ArrayList<>();
        for (int child : children[employee]) {
            childResults.add(dfs(child));
        }

        for (int[][] childRes : childResults) {
            int[] childWithoutDiscount = childRes[0];
            int[] childWithDiscount = childRes[1];

            dpWithoutChildren = combine(dpWithoutChildren, childWithoutDiscount);
            dpWithChildren = combine(dpWithChildren, childWithDiscount);
        }

        int[] dpWithoutDiscount = calcDp(costWithoutDiscount, profitWithoutDiscount, dpWithoutChildren, dpWithChildren);
        int[] dpWithDiscount = calcDp(costWithDiscount, profitWithDiscount, dpWithoutChildren, dpWithChildren);
        return new int[][]{dpWithoutDiscount, dpWithDiscount};
    }

    private int[] calcDp(int cost, int profit, int[] dpChildrenNo, int[] dpChildrenYes) {
        int[] dp = new int[budget + 1];
        System.arraycopy(dpChildrenNo, 0, dp, 0, budget + 1);

        for (int b = cost; b <= budget; b++) {
            int newProfit = dpChildrenYes[b - cost] + profit;
            if (newProfit > dp[b]) {
                dp[b] = newProfit;
            }
        }
        return dp;
    }
}
