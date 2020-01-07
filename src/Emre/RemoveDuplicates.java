package Emre;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] numbers={1,2,3,1,2,4,5,5};
        System.out.println(Arrays.toString(removeDuplicate(numbers)));
    }
    public static  int[] removeDuplicate(int ... arr){
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            if(!numbers.contains(arr[i])){
                numbers.add(arr[i]);
            }
        }
        int [] nums=new int[numbers.size()];
        for(int i=0; i<numbers.size(); i++){
            nums[i]=numbers.get(i);
        }
        return nums;
    }
}



