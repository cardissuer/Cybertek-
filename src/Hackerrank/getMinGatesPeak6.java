package Hackerrank;

import java.util.List;

public class getMinGatesPeak6 {

    public static int getMinGates(List<Integer> landingTimes, List<Integer> takeOffTimes, int maxWaitTime, int initialPlanes) {

        int gatesAvailable = 1 + initialPlanes, result = 1;
        int i = 1, j = 0;

        while (i < landingTimes.size() && j < takeOffTimes.size()) {

            if ((Math.abs(landingTimes.get(i) - takeOffTimes.get(j) - 40)) <= maxWaitTime) {
                gatesAvailable++;
                i++;
            }

            else if ((Math.abs(landingTimes.get(i) - takeOffTimes.get(j) - 40)) > maxWaitTime) {
                gatesAvailable--;
                j++;
            }

            if (gatesAvailable > result)
                result = gatesAvailable;
        }

        return result;
    }
}
