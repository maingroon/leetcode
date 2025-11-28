package com.maingroon;

import java.util.ArrayList;
import java.util.List;

public class Solution2872 {

    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] i : edges) {
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }

        int[] result = new int[1];
        dfs(adj, values, 0, -1, result, k);

        return result[0];
    }

    static int dfs(List<List<Integer>> adj, int[] values, int node, int parent, int[] result, int k) {
        int sum = values[node];
        for (int temp : adj.get(node)) {
            if (temp != parent) {
                sum += dfs(adj, values, temp, node, result, k);
            }
        }
        if (sum % k == 0) {
            result[0]++;
        }
        return sum % k;
    }
}
