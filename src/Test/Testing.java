package Test;

import java.util.Arrays;

public class Testing {

//    Write a function that reads the following folders and the respective count so each folder name is unique
//    For example,
//    Input: String[] intArray = {"cost", "DUE", "Stone", "cost", "Stone", "DUE", "Stone", "whole", "cost"};
//    Output: {"cost", "DUE", "Stone", "cost1", "Stone1", "DUE1", "Stone2", "whole", "cost2"};

    public static void main(String[] args) {
//        String[] intArray = {"cost", "DUE", "Stone", "cost", "Stone", "DUE", "Stone", "whole", "cost"};
//        Arrays.sort(intArray);
//        int result[] = new int[intArray.length];
//        int count = 0;
//        for (int i = intArray.length; i > 0 ; i--) {
//            if (intArray[i] == intArray[i - 1]) {
//                ++count;
//                intArray[i + 1] = intArray[i - 1] + count;
////            } else if (!(intArray[i] == intArray[i - 1])) {
////                continue;
//            }
//        }
//another task
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j >= 0; j--) {
                if (i == j)
                    continue;
                System.out.println(i + " " + j);
            }
        }

    }

    }
