package com.maingroon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution754 {

    record Pair(char left, char right) {
    }

    public boolean pyramidTransition(String bottom, List<String> allowed) {
        Map<Pair, List<Character>> allowedTops = new HashMap<>();
        for (String block : allowed) {
            Pair pair = new Pair(block.charAt(0), block.charAt(1));
            allowedTops
                    .computeIfAbsent(pair, k -> new ArrayList<>())
                    .add(block.charAt(2));
        }

        Set<String> prevRows = new HashSet<>();
        prevRows.add(bottom);
        for (int i = bottom.length(); i > 1; i--) {
            Set<String> curRows = new HashSet<>();
            for (String prevRow : prevRows) {
                curRows.addAll(getPossibleRows(prevRow, allowedTops));
            }
            if (curRows.isEmpty()) {
                return false;
            }
            prevRows = curRows;
        }
        return true;
    }

    private Set<String> getPossibleRows(String prevRow, Map<Pair, List<Character>> allowedTops) {
        List<List<Character>> positionsChars = new ArrayList<>();
        for (int i = 0; i < prevRow.length() - 1; i++) {
            Pair pair = new Pair(prevRow.charAt(i), prevRow.charAt(i + 1));
            if (!allowedTops.containsKey(pair)) {
                return new HashSet<>();
            }
            positionsChars.add(allowedTops.get(pair));
        }

        int variationsCount = 1;
        for (List<Character> positionChars : positionsChars) {
            variationsCount *= positionChars.size();
        }

        char[][] variations = new char[variationsCount][positionsChars.size()];
        for (int i = 0; i < positionsChars.size(); i++) {
            for (int j = 0; j < variationsCount; j++) {
                List<Character> positionChars = positionsChars.get(i);
                variations[j][i] = positionChars.get(j % positionChars.size());
            }
        }

        Set<String> possibleRows = new HashSet<>(variationsCount);
        for (char[] variation : variations) {
            possibleRows.add(new String(variation));
        }
        return possibleRows;
    }
}
