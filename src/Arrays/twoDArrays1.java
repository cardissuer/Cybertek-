package Arrays;

public class twoDArrays1 {
    public static void main(String[] args) {
        int [] [] numbers = {{2,3}, {0,4,5,6}, {7,8,9}};
       // System.out.println((numbers[2][0]) + " " + Arrays.toString(numbers[2]));
        //System.out.println(numbers[1].length);
    for (int i=0;i<numbers.length;i+=1){
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
    }
    }
}