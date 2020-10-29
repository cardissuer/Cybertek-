package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class birthdayCakeCandles {

    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add (4);
        list.add (4);
        list.add (3);
        list.add (2);
        System.out.println(birthdayCakeCandles(list));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        //Arrays.stream(candles.toArray()).sorted();
        int result = 0;
        IntSummaryStatistics stats = candles.stream().mapToInt((x) -> (int) x).summaryStatistics();
        candles.sort(null);
        for (int i=candles.size()-1; i>0;i--){
        if (candles.get(i)==stats.getMax()) result++;
        }
    return result;
    }
}