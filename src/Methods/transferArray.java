package Methods;

import java.util.Arrays;

public class transferArray {
    public static void main(String[] args) {
        maxNumber(3,4,34,56,45,38,69);
    }
    public static void maxNumber (int ... arr) {
        Arrays.sort(arr);
        System.out.println("The biggest number is " + arr [arr.length-1]);
    }
}
