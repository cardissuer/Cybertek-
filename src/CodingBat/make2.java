package CodingBat;

import java.util.Arrays;

public class make2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(make2(new int [] {}, new int [] {1,2})));
    }

    public static int[] make2(int[] a, int[] b) {
        int [] newarr = new int [2];
        if (a.length>=2) { newarr [0] = a[0]; newarr[1] = a[1];
        } if (a.length==1&&b.length>=1){ newarr[0] = a[0]; newarr[1] = b[0];
        } if (a.length==0& b.length>1){ newarr[0] = b[0]; newarr [1] = b[1];
        } if (a.length==0& b.length==1){ newarr[0]=b[0];
        }
        return newarr;
    }
}
