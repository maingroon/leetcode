package com.maingroon;

public class Solution2536 {

    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] mat = new int[n][n];
        for (int[] query : queries) {
            int fromRow = query[0];
            int fromCol = query[1];
            int toRow = query[2];
            int toCol = query[3];

            for (int row = fromRow; row <= toRow; row++) {
                for (int col = fromCol; col <= toCol; col++) {
                    mat[row][col]++;
                }
            }
        }
        return mat;
    }
}
