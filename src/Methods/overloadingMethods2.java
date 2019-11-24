package Methods;

import java.util.Arrays;

public class overloadingMethods2 {
    public static void main(String[] args) {
        String [] arr = {"a", "b", "d", "f", "g"};
        System.out.println(Arrays.toString (increaseArr (arr, "u",3)));
    }
    public static String [] increaseArr (String [] arr, String word, int index) {
        String [] newArr = new String [arr.length+ 1];
        for (int i=0, j=0;j<newArr.length;j++) {
            if (index==j){
                newArr[j] = word;
            } else {
                newArr[j] = arr[i];
                i++;
            }
        }
    return newArr;
    }
}