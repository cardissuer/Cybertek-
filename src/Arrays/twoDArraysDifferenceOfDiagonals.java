package Arrays;

public class twoDArraysDifferenceOfDiagonals {
    public static void main(String[] args) {
        int[][] arr = {{3, 2, 1}, {56, 118, 30}, {26, 76, 46}};
        System.out.println(difference(arr));
        System.out.println(differ(arr));
    }
    //Create a method that will take 2d array and return the difference
    // between the sum of the diagonals

    public static int difference(int[][] arr) {
        int sum1 = arr[0][0] + arr[1][1] + arr[2][2];
        int sum2 = arr[0][2] + arr[1][1] + arr[2][0];
        int diff = sum1 - sum2;
        return diff;
    }

    public static int differ(int[][] arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            sum1 += arr[i][i];
            sum2 += arr[j][i];
        }
        return Math.abs(sum1 - sum2);
    }
}