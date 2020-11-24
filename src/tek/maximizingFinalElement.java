package tek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class maximizingFinalElement {

    public static void main(String[] args) {
        System.out.println(getMaxValue(Arrays.asList(1, 2, 4, 5, 6, 7, 10)));
    }

    public static int getMaxValue(List<Integer> arr) {
        Collections.sort(arr);
        Integer num = arr.get(0);
        Integer extra = arr.get(0);
        List<Integer> result = new ArrayList<>();
        if (num == 1) {
            result.add(num);
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i) - num > 1) {
                    extra = arr.get(i) - (arr.get(i) - num);
                    result.add(extra);
                    num=extra;
                }
            }
        }
        return result.get(result.size() - 1);
    }
}
