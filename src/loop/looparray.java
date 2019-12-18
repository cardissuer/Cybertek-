package loop;

import java.util.Arrays;

public class looparray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int sum=0;
        //for (int i=0; i<arr.length;i++){
            //if (arr[i]%2==0){
        //for (int n: arr){
          //  if (n%2==0){
                //sum = sum + arr[i];
                //newarr[i] = arr[i];
            //    sum = sum + n;
              //  newarr[n] = n;
        int count = 0;
            for (int n: arr){
                if (n%2==0){
                    count++;
            }
            }
        int [] newarr = new int[count];
            for (int i=0, j=0;i<arr.length;i++) {
                if (arr[i] % 2 == 0) {
                    newarr[j] = arr[i];
                    j++;
                }
            }
                System.out.println(Arrays.toString(newarr));
        }
        //System.out.println(sum);
        //System.out.println(Arrays.toString(newarr));
    }