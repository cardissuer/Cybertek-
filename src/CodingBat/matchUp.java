package CodingBat;

import java.util.Arrays;

public class matchUp {

    public static void main(String[] args) {
        System.out.println(matchUp(new int [] {2,3,4,5,6}, new int [] {4,5,6,7,11}));
    }

    public static int matchUp(String[] a, String[] b) {
        int count=0;
        for (int i=0;i<a.length;i++){
            if ((a[i].charAt(0)) == (b[i].charAt(0))) {
                count ++;
            }
        } return count;
    }

    public static int matchUp(int[] nums1, int[] nums2) {
    int count =0;
    int diff = 2;
    for (int i=0; i<nums1.length;i++){
        if (nums1[i]!=nums2[i]){
            if (Math.abs(nums1[i]-nums2[i])<=2) count++;
        }
    } return count;
    }

}