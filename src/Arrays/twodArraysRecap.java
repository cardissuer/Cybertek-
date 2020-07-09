package Arrays;

import java.util.Arrays;

public class twodArraysRecap {

    public static void main(String[] args) {
        int [][] arr = {{2,3,4,5,6}, {60,5,4,3,2}, {9,8,7,6,5}};
        int max = 0;
        for (int i=0; i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (max<arr[i][j]){
                    max = arr[i][j];
                } if (arr[i][j]<5){
                    arr[i][j]=0;
                }
            }
        }
        System.out.println(max);
        System.out.println(Arrays.deepToString(arr));
    }
}
