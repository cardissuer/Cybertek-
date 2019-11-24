package Methods;

import java.util.Arrays;

public class overloadingMethods6 {

    //Create a method that will accept an int array.
    // Add up all the numbers in your array, except for numbers that end with 5.
    //Overload your method to take an int array and a number.
    // Now return the sum of all the numbers, except for the numbers that end with the given number.

    public static void main(String[] args) {
        //   int [] arr = createArray.createRandomArray(5,10);
        int[] arr = {5, 4, 2, 4, 5};
        System.out.println(Arrays.toString (arr));
        System.out.println(sumArray(arr, 4));

    }

        public static int sumArray ( int[] arr){
            int sum = 0;
            for (int num : arr) {
                String s = num + "";
                if (s.endsWith("5")) {
                    continue;
                }
                sum += num;
//            if(num % 10 != 5) {
//                sum += num;
//            }
            }
            return sum;
        }
        public static int sumArray ( int[] arr, int number){
            int sum = 0;
            for (int num : arr) {
                String s = num + "";
                if (!s.endsWith(number + "")) {
                    sum += num;
                }
//            if(num % 10 != number) {
//                sum += num;
//            }
            }
            return sum;
        }
    }