package Arrays;

import java.util.Arrays;
import java.util.Random;

public class twoDArrayAndRandom {
    public static void main(String[] args) {
        //Create a method that will generate a random 2D int array. Take two parameters.
        // The first one for how many 1D arrays you want, and
        // second how many elements each 1D array should have

        System.out.println(Arrays.deepToString(methodName(4,4)));
    }
        public static int[][] methodName (int num1, int num2){
            Random random = new Random();
            int[][] numbers = new int[num1][num2];
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {
                    numbers[i][j] = random.nextInt((100));
                }
            }
        return numbers;
        }
    }