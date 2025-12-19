package com.maingroon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class Solution2092 {

    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        Map<Integer, List<int[]>> timeMeetings = new TreeMap<>();
        for (int[] m : meetings) {
            int p1 = m[0];
            int p2 = m[1];
            int time = m[2];
            timeMeetings
                    .computeIfAbsent(time, _ -> new ArrayList<>())
                    .add(new int[]{p1, p2});
        }

        boolean[] knowSecret = new boolean[n];
        knowSecret[0] = true;
        knowSecret[firstPerson] = true;

        for (int time : timeMeetings.keySet()) {
            Map<Integer, List<Integer>> meetList = new HashMap<>();
            for (int[] m : timeMeetings.get(time)) {
                int p1 = m[0];
                int p2 = m[1];
                meetList
                        .computeIfAbsent(p1, _ -> new ArrayList<>())
                        .add(p2);
                meetList
                        .computeIfAbsent(p2, _ -> new ArrayList<>())
                        .add(p1);
            }

            Set<Integer> start = new HashSet<>();
            for (int[] m : timeMeetings.get(time)) {
                int p1 = m[0];
                int p2 = m[1];
                if (knowSecret[p1]) {
                    start.add(p1);
                }
                if (knowSecret[p2]) {
                    start.add(p2);
                }
            }

            Queue<Integer> q = new LinkedList<>(start);
            while (!q.isEmpty()) {
                int person = q.poll();
                if (!meetList.containsKey(person)) {
                    continue;
                }
                List<Integer> personMeetings = meetList.get(person);
                for (int nextPerson : personMeetings) {
                    if (!knowSecret[nextPerson]) {
                        knowSecret[nextPerson] = true;
                        q.offer(nextPerson);
                    }
                }
            }
        }

        List<Integer> knowingPeople = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (knowSecret[i]) {
                knowingPeople.add(i);
            }
        }
        return knowingPeople;
    }
}
