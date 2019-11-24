package Arrays;

public class twoDArrays2 {
    public static void main(String[] args) {
        int [][] arr = {{2,3,4,5,6,7,8,9},{4,3,5,6},{3,2}};
        for (int i=0;i<arr.length;i+=1){
                System.out.println("Length of row " + (i+1) + " : " + arr[i].length);
            }
        }
    }
