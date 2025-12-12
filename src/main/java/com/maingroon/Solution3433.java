package com.maingroon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution3433 {

    private static final String TYPE_OFFLINE = "OFFLINE";

    private static final String USERS_ALL = "ALL";
    private static final String USERS_ONLINE = "HERE";

    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        events.sort((e1, e2) -> {
            int result = Integer.compare(Integer.parseInt(e1.get(1)), Integer.parseInt(e2.get(1)));
            if (result == 0) {
                String type1 = e1.get(0);
                String type2 = e2.get(0);
                if (type1.equals(type2)) {
                    return 0;
                } else if (type1.equals(TYPE_OFFLINE)) {
                    return -1;
                } else {
                    return 1;
                }
            }
            return result;
        });

        int[] mentions = new int[numberOfUsers];
        int[] offTime = new int[numberOfUsers];
        Arrays.fill(offTime, -1);

        for (List<String> event : events) {
            int timestamp = Integer.parseInt(event.get(1));
            if (event.get(0).equals(TYPE_OFFLINE)) {
                offTime[Integer.parseInt(event.get(2))] = timestamp;
            } else if (event.get(2).equals(USERS_ALL)) {
                for (int i = 0; i < numberOfUsers; i++) {
                    mentions[i]++;
                }
            } else if (event.get(2).equals(USERS_ONLINE)) {
                for (int i = 0; i < numberOfUsers; i++) {
                    if (offTime[i] == -1 || timestamp - offTime[i] >= 60) {
                        mentions[i]++;
                    }
                }
            } else {
                List<Integer> ids = parseIds(event.get(2));
                for (int id : ids) {
                    mentions[id]++;
                }
            }
        }

        return mentions;
    }

    private List<Integer> parseIds(String input) {
        List<Integer> ids = new LinkedList<>();
        int i = 0;
        while (i < input.length()) {
            while (i < input.length() && (input.charAt(i) < '0' || input.charAt(i) > '9')) {
                i++;
            }
            if (i >= input.length()) {
                break;
            }
            int id = 0;
            while (i < input.length() && input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                id *= 10;
                id += input.charAt(i) - 48;
                i++;
            }
            ids.add(id);
        }
        return ids;
    }
}
