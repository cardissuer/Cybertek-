package tek;

import java.util.*;

public class arrayGame {
    public static void main(String[] args) {

//        List <Integer> numbers = new ArrayList<>();
//
//        numbers.add (2);
//        numbers.add (3);
//        numbers.add (4);
//        numbers.add (5);
//        numbers.add (9);
//
//        numbers.toArray();

        int [] arr = {2,4,6,9,5};
        Arrays.sort(arr); // 2,4,5,6,9
        int max = arr[arr.length-1]; // 9
        int [] store = new int[4]; // , , , ,

        for (int i=0; i<arr.length-1;i++){
            if (arr[i]!=max){
                store [i] = Math.abs (max-arr[i]); // 9 - 2, 9 - 4, 9 - 5, 9 - 6 // 7,5,4,3
            }
        }
        Arrays.sort(store); // 3, 4, 5, 7
        int iterationNum = store[store.length-1];
        //System.out.println(Arrays.toString(store));
        System.out.println(iterationNum);
    }
}
