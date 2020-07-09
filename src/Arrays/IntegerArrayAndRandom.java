package Arrays;

import java.util.Arrays;
import java.util.Random;

public class IntegerArrayAndRandom {
    public static void main(String[] args) {
        //Create an array with 50 random numbers in the range of 1-100. Then print the array
        Random random = new Random();
        int [] numbers = new int [50];
        for (int i=0; i<50; i++){
            int number = random.nextInt((100) + 1);
            numbers[i]= number;
//            System.out.println(Arrays.toString(numbers));
        }
        System.out.println(Arrays.toString(numbers));
    }
}
