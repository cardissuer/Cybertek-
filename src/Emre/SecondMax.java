package Emre;

public class SecondMax {
    public static void main(String[] args) {
        int[] numbers={1,2,3,0,32,-2,43,43};
        System.out.println(secondMax(numbers));
    }
    //{1,3,2,4,5,2,10}
    public static int secondMax(int...arr){
        int max=arr[0];
        int secondMax=arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }if(arr[i]>secondMax && arr[i]<max){
                secondMax=arr[i]; // max =3 second=2
            }
        }
        return secondMax;
    }
}

// *Haven Life task*

//import java.io.*;
//        import java.util.*;
//
///*
// * To execute Java, please define "static void main" on a class
// * named Solution.
// *
// * If you need more classes, simply define them inline.
// */
//
//// arr [1,4,7,8, 10, 2] example input
//// example output 10, 8
//
//class Solution {
//    public static void main(String[] args) {
//
//        System.out.println(findMax(new int [] {1,4,7,8, 10, 2}));
//        System.out.println(secondMax(new int [] {1,4,7,8, 10, 2}));
//
//    }
//
//    public static int findMax (int [] arr){
//        int max = arr[0];
//        for (int i=0; i<arr.length; i++){
//            if (max<arr[i]){
//                max = arr[i];
//
//            }
//        } return max;
//    }
//
//    public static int secondMax (int [] arr){
//        Arrays.sort(arr);
//        int max = arr[arr.length-1];
//        int secondMax = arr[arr.length-2];
//        int [] result = new int [2];
//        max.add(result);
//        secondMax.add(result);
//        return result;
//    }
//}
//