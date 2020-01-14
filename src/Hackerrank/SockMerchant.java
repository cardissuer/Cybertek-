package Hackerrank;

import java.util.Arrays;

public class SockMerchant {
    // Complete the sockMerchant function below.
    int sockMerchant(int n, int [] ar) {

        int [] all = new int[100];
        for (int i=0;i<ar.length;i++){
            all [(ar[i]-i)] = all [(ar[i]-i)] + 1;
        }
        return n;
        }
    }