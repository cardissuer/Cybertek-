package Arrays;

public class twoDArraysGurhan {
    public static void main(String[] args) {
        //int [][] numbers = {
        //      {1,2,3,4,5},
        //    {6,7,8,9,0},
        //  {10,11,12,13,14},
        //{15,16,17,18,19}};
        //System.out.println(numbers [2][3]);
        //System.out.println(numbers [3] [4]);
        //}
        int[][] numbers1 = {
                {23, 35, 46, 57, 68},
                {23, 56, 78, 96, 34},
                {45, 77, 33, 45, 78},
                {56, 44, 33, 56, 88}
        };
        for (int row = 0; row < numbers1.length; row++) {
            for (int column = 0; column < numbers1[row].length; column++) {
                System.out.print(numbers1[row][column] + "\t");
            }
            System.out.println();
        }
    }
}