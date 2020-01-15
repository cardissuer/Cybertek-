package Hackerrank;

import java.util.Arrays;

public class SockMerchant {
    // Complete the sockMerchant function below.

    public static void main(String[] args) {
        int [] ar = {10,20,30,10,50,70,90};
        System.out.println(sockMerchant(7, ar));
    }

    static int sockMerchant(int n, int[] ar) {

        int[] all = new int[100];
        for (int i = 0; i < ar.length; i++) {
            all[(ar[i] - 1)] = all[(ar[i] - 1)] + 1;
        }
        int socks = 0;
        for (int sock : all) {
            socks += sock / 2;
        }
        return socks;
    }
}