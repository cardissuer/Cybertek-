package Arrays;

public class twoDArrays5 {
public static void main(String[] args) {
int [][] arr = {{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}};
    //System.out.println(biggestSumArr(int [4][5] );

        //Create a method that takes a 2D array and return the index
        // of the inner array which has the biggest sum of its elements
}
public static int biggestSumArr(int [][] twoarr) {
            int index = 0;
            int biggest = 0;
            for (int i=0; i<twoarr.length;i++){
                int sum=0;
                for (int j=0; j<twoarr[i].length;j++){
                    sum+=twoarr[i][j];
                }
                if (sum>biggest) {
                    biggest = sum;
                    index = i;
                }
            }
            return index;
        }
    }
