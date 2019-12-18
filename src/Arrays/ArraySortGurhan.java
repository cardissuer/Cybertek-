package Arrays;

import java.util.Arrays;

public class ArraySortGurhan {
    public static void main(String[] args) {
        String[] series = {"Game of Thrones", "Friends", "Prison Break", "Doctor Who", "Grey's Anatomy"};
        Arrays.sort(series);
        System.out.println("Sorted list of shows:");
        for (int i = 0; i < series.length; i++) {
                System.out.println("#" + i + " " + series[i]);
            }
        }
    }