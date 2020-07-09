package Arrays;

import java.util.Arrays;

public class twoDArrays {
    public static void main(String[] args) {
        int [][] groups = new int [3][4];
        int [] num = {1,2,3,4,5};
        groups [0] = num;
//        String [][]str = new String[4][4];
        System.out.println(Arrays.deepToString(groups));
    }
}
