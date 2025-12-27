package com.maingroon;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2402 {

    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparing(m -> m[0]));

        int[] roomMeetings = new int[n];
        long[] roomTimers = new long[n];
        for (int[] meeting : meetings) {
            int room = -1;
            int earliestRoom = -1;
            long earliestTime = Long.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (roomTimers[j] < earliestTime) {
                    earliestTime = roomTimers[j];
                    earliestRoom = j;
                }
                if (roomTimers[j] <= meeting[0]) {
                    room = j;
                    break;
                }
            }

            if (room != -1) {
                roomTimers[room] = meeting[1];
                roomMeetings[room]++;
            } else {
                roomTimers[earliestRoom] += meeting[1] - meeting[0];
                roomMeetings[earliestRoom]++;
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            if (roomMeetings[i] > roomMeetings[result]) {
                result = i;
            }
        }
        return result;
    }
}
