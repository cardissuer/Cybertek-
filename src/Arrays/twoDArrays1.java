package Arrays;

public class twoDArrays1 {
    public static void main(String[] args) {
        int[][] numbers = {{2, 3}, {0, 4, 5, 6}, {7, 8, 9}};
        int[][] multiplicationTable = new int[10][10];
        // System.out.println((numbers[2][0]) + " " + Arrays.toString(numbers[2]));
        //System.out.println(numbers[1].length);
/*    for (int i=0;i<numbers.length;i+=1){
        for (int j=0; j<numbers[i].length;j++){
            System.out.print(numbers[i][j]);
        }
        System.out.println();
    }
    for (int [] inner: numbers){
        for (int element: inner){
            System.out.print(element);
        }
        System.out.println();
    }*/
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; i <= 10; j++) {
                System.out.println(multiplicationTable[i][j] * i);
            }
        }
    }
}