package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Caterpillar {
    //    Print numbers and their sequences from the given array
    //        array={1,2,3,2,2,2,3,4,5,6,7,8}
    //    For example: 1 is 1, 2 is 4.

    public static void main(String[] args) {
//        Seq(new int[]{1, 2, 3, 2, 2, 2, 3, 4, 5, 6, 7, 8});
//        SeqAlex(new int[]{1, 2, 3, 2, 2, 2, 3, 4, 5, 6, 7, 8});
//        Dist(new int[]{1, 2, 3, 2, 2, 2, 3, 4, 5, 6, 7, 8});
//        MaxNS(5, 32);
//        MaxNSint(5, 32);
//        SameWordINCORRECT(new String[]{"Doc", "Spy", "Doc", "sub", "Cart", "Spy", "Doc"});
//        TwoMaxNum(new int[]{4, 5, 6, 4, 8, 15, 15, 6, 7});
    }

    public static void Seq(int arr[]) {
        for (int j = 0; j < arr.length; j++) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == j) {
                    count++;
                }
            }
            System.out.println("Value: " + j + " appears " + count + " times");
        }
    }

    public static void SeqAlex(int arr[]) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int j = 0; j < arr.length; j++) {
            if (hash.containsKey(arr[j])) {
                int var = hash.get(arr[j]);
                hash.put(arr[j], ++var);
            } else {
                hash.put(arr[j], 1);
            }
        }
        hash.entrySet().forEach(x -> System.out.println("Value: " + x.getKey() + " appears " + x.getValue() + " times"));
    }

    //   Print distinct numbers from the above example (do not use maps) - Hashset is Hashmap in fact, so it's fake decision

    public static void Dist(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        set.forEach(x -> System.out.println("Value: " + x));
    }

//   Return a max number that can be generated from given N and S numbers.
//   N represents how many digits max number can be. S represents the total sum of N digits. S and N will be given.
//   For example, N=5 and S=12 the max number should be 93000. Meaning 9+3+0+0+0 = 12.
//   For example, N=5 and S=32 the max number should be 99950. Meaning 9+9+9+5+0 = 32.

    public static void MaxNS(int n, int s) {
        String result = "";
        boolean isComplete = false;
        for (int i = 0; i < n; i++) {
            if (s >= 9) {
                result += "9";
                s -= 9;
            } else if (!isComplete) {
                result += Integer.toString(s);
                isComplete = true;
            } else {
                result += "0";
            }
        }
        System.out.println(result);
    }

    public static void MaxNSint(int n, int s) {
        int result = 0;
        boolean isComplete = false;
        for (int i = n - 1; i > 0; i--) {
            if (s >= 9) {
                result += 9 * Math.pow(10, i);
                s -= 9;
            } else if (!isComplete) {
                result += s * Math.pow(10, i);
                isComplete = true;
            } else {
                result += 0;
            }
        }
        System.out.println(result);
    }

//    We have to write the java program for the input strung array to get the output as mentioned above
//    Input: ["Doc", "Spy", "Doc","sub", "Cart", "Spy","Doc"]
//    Output: ["Doc", "Spy", "Doc1","sub", "Cart", "Spy1","Doc2"]

    public static void SameWordINCORRECT(String warr[]) {
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        int count = 0;
        for (int i = 0; i < warr.length; i++) {
            String var = hash.get(warr[i]);
            hash.put(i, var = warr[i] + count);
            if (hash.containsValue(warr[i])) {
                ++count;
                hash.put(i, var = warr[i] + count);
            }
        }
        hash.entrySet().forEach(x -> System.out.println(x.getValue()));
    }

//    Write a function that takes an array of integers as in input and returns two unique largest numbers.
//    For example,
//    Input: int[] intArray = {4, 5, 6, 4, 8, 15, 15, 6, 7};
//    Output: 15 and 8

    public static void TwoMaxNum(int num[]) {
        Arrays.sort(num);
        int secondMax = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            if (!(num[i] == num[i - 1])) {
                secondMax = num[i - 1];
                break;
            }
        }
        System.out.println("Max number: " + num[num.length - 1]);
        System.out.println("2nd max number: " + secondMax);
    }
}