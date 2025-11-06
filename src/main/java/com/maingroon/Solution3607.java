package com.maingroon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution3607 {

    private static final int CHECK_TASK = 1;
    private static final int DISABLE_TASK = 2;

    static class UnionFind {
        private final int[] parent;

        public UnionFind(int size) {
            parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] == x) {
                return x;
            }
            parent[x] = find(parent[x]);
            return parent[x];
        }

        public void join(int a, int b) {
            parent[find(a)] = find(b);
        }
    }

    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        UnionFind uf = new UnionFind(c + 1);
        for (int[] connection : connections) {
            uf.join(connection[0], connection[1]);
        }

        boolean[] online = new boolean[c + 1];
        int[] offlineCounts = new int[c + 1];
        Arrays.fill(online, true);
        for (int[] query : queries) {
            int task = query[0];
            int x = query[1];
            if (task == DISABLE_TASK) {
                online[x] = false;
                offlineCounts[x]++;
            }
        }

        Map<Integer, Integer> minOnlineStations = new HashMap<>();
        for (int i = 1; i <= c; i++) {
            int root = uf.find(i);
            if (!minOnlineStations.containsKey(root)) {
                minOnlineStations.put(root, -1);
            }

            int station = minOnlineStations.get(root);
            if (online[i] && (station == -1 || station > i)) {
                minOnlineStations.put(root, i);
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = queries.length - 1; i >= 0; i--) {
            int task = queries[i][0];
            int x = queries[i][1];
            int root = uf.find(x);
            int station = minOnlineStations.get(root);

            switch (task) {
                case CHECK_TASK -> {
                    if (online[x]) {
                        ans.add(x);
                    } else {
                        ans.add(station);
                    }
                }
                case DISABLE_TASK -> {
                    if (offlineCounts[x] > 1) {
                        offlineCounts[x]--;
                    } else {
                        online[x] = true;
                        if (station == -1 || station > x) {
                            minOnlineStations.put(root, x);
                        }
                    }
                }
                default -> throw new IllegalArgumentException("Unknown task number: " + task);
            }
        }
        return ans.reversed()
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

//    first attempt solution
//    public int[] processQueries(int c, int[][] connections, int[][] queries) {
//        boolean[] stationStatuses = new boolean[c];
//        Arrays.fill(stationStatuses, true);
//        Map<Integer, Queue<Integer>> stationConnections = new HashMap<>(c);
//        for (int[] connection : connections) {
//            int s1 = connection[0];
//            int s2 = connection[1];
//            boolean s1HasGrid = stationConnections.containsKey(s1);
//            boolean s2HasGrid = stationConnections.containsKey(s2);
//            if (s1HasGrid && s2HasGrid) {
//                Queue<Integer> grid1 = stationConnections.get(s1);
//                Queue<Integer> grid2 = stationConnections.get(s2);
//                if (grid1 != grid2) {
//                    if (grid1.size() > grid2.size()) {
//                        grid1.addAll(grid2);
//                        grid2.forEach(station -> {
//                            stationConnections.put(station, grid1);
//                        });
//                    } else {
//                        grid2.addAll(grid1);
//                        grid1.forEach(station -> {
//                            stationConnections.put(station, grid2);
//                        });
//                    }
//                }
//            } else if (s1HasGrid) {
//                Queue<Integer> grid = stationConnections.get(s1);
//                grid.add(s2);
//                stationConnections.put(s2, grid);
//            } else if (s2HasGrid) {
//                Queue<Integer> grid = stationConnections.get(s2);
//                grid.add(s1);
//                stationConnections.put(s1, grid);
//            } else {
//                Queue<Integer> grid = new PriorityQueue<>(Comparator.naturalOrder());
//                grid.add(s1);
//                grid.add(s2);
//                stationConnections.put(s1, grid);
//                stationConnections.put(s2, grid);
//            }
//        }
//
//        int[] result = new int[queries.length];
//        int idx = 0;
//        for (int[] query : queries) {
//            int task = query[0];
//            int station = query[1];
//            if (task == CHECK_TASK) {
//                if (stationStatuses[station - 1]) {
//                    result[idx] = station;
//                } else if (stationConnections.containsKey(station)) {
//                    Queue<Integer> grid = stationConnections.get(station);
//                    while (!grid.isEmpty()) {
//                        if (stationStatuses[grid.peek() - 1]) {
//                            result[idx] = grid.peek();
//                            break;
//                        } else {
//                            grid.remove();
//                        }
//                    }
//                    if (grid.isEmpty()) {
//                        stationConnections.remove(station);
//                        result[idx] = -1;
//                    }
//                } else {
//                    result[idx] = -1;
//                }
//                idx++;
//            } else if (task == DISABLE_TASK) {
//                stationStatuses[station - 1] = false;
//            } else {
//                throw new IllegalArgumentException("Unknown query task: " + task);
//            }
//        }
//        return Arrays.copyOf(result, idx);
//    }
}
