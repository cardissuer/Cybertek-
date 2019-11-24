package mondayteam;

import java.util.Arrays;

public class nov18thirdtask {

    public static int secondLargestNum(int[] arr) {
        Arrays.sort(arr);
        int secondLargestNum = arr[0];
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                secondLargestNum = arr[i - 1];
                break;
            }
        }
        return secondLargestNum;
    }
}
