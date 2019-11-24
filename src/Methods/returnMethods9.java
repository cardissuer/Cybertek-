package Methods;

import java.util.Arrays;
import java.util.Random;

public class returnMethods9 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomIntArr(5,100)));
    }
    //Create a method that will generate a random int array.
    // The method takes the size of the array and the bound of the random numbers. Return the random array

    public static int [] randomIntArr (int sizeNum, int boundNum) {
        int [] arr = new int [sizeNum];
        Random random = new Random();
        for (int i=0; i<sizeNum; i++) {
            int number = random.nextInt(boundNum);
            arr [i] = number;
        }
        return arr;
    }
}