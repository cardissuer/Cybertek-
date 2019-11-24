package Arrays;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        /*double[] prices = new double[5];
        prices[0] = 45.99;
        prices[1] = 23.5;
        prices[2] = 11.50;
        prices[3] = 33.33;
        prices[4] = 99.99;*/
        double[]prices = {45.99,23.5,11.50,33.33,99.99};
        System.out.println(Arrays.toString(prices));
        prices[prices.length-1] = 112.98;
        System.out.println(Arrays.toString(prices));
    }
}
