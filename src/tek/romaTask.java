package tek;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;

public class romaTask {

    public static int getMaxValue(List<Integer> arr) {
        Collections.sort(arr);
        Integer newVar = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) - arr.get(i - 1) > 1) {
                newVar = arr.get(i - 1) + 1;
            }
        } return 0;
    }
}

//    public static long countMoves (List <Integer> numbers){
//        Collections.sort(numbers);
//        Integer number1 = 0;
//        for (int i=1; i<numbers.size();i++){
//            numbers.get(i) += numbers.get(i);
//        }
//    }

//    public static void main(String[] args) {
//        String [] cities = {"Bangalore", "Pune", "San Francisco", "New York City"};
//        MySort ms = new MySort();
//        Arrays.sort(cities,ms);
//        System.out.println(Arrays.binarySearch(cities,"New York City"));
//    }
//    static class MySort implements Comparator
//    {
//        public int compare (String a, String b){
//            return b.compareTo(a);
//        }
//    }

    //    public static int getMaxValue (List<Integer> arr){
//    public static class GFG {
//
//        // variable to store maximum value
//        // that can be obtained.
//        static int ans;
//
//        // Utility function to find maximum
//        // possible value
//        static void findMaxValUtil(int[] arr, int n, int num,
//                                   int maxLimit, int ind) {
//
//            // If entire array is traversed, then compare
//            // current value in num to overall maximum
//            // obtained so far.
//            if (ind == n) {
//                ans = Math.max(ans, num);
//                return;
//            }
//
//            // Case 1: Subtract current element from value so
//            // far if result is greater than or equal to zero.
//            if (num - arr[ind] >= 0) {
//                findMaxValUtil(arr, n, num - arr[ind],
//                        maxLimit, ind + 1);
//            }
//
//            // Case 2 : Add current element to value so far
//            // if result is less than or equal to maxLimit.
//            if (num + arr[ind] <= maxLimit) {
//                findMaxValUtil(arr, n, num + arr[ind],
//                        maxLimit, ind + 1);
//            }
//        }
//
//        // Function to find maximum possible
//        // value that can be obtained using
//        // array elements and given number.
//        static int findMaxVal(int[] arr, int n,
//                              int num, int maxLimit) {
//
//
//            // variable to store current index position.
//            int ind = 0;
//
//            // call to utility function to find maximum
//            // possible value that can be obtained.
//            findMaxValUtil(arr, n, num, maxLimit, ind);
//
//            return ans;
//        }
//
//        // Driver code
//        public static void main(String args[]) {
//            int num = 1;
//            int[] arr = {3, 10, 6, 4, 5};
//            int n = arr.length;
//            int maxLimit = 15;
//
//            System.out.print(findMaxVal(arr, n, num,
//                    maxLimit));
//        }
//    }
//}
//
//// This code is contributed by Manish Shaw
//// (manishshaw1)
