package Arrays;

public class ArrayKatyaSan {

    public static void main(String[] args) {
        System.out.println(solution(10,20, new int[]{0,1,2,20,4,6,7,8,9,10}));
    }

    public static int solution (int X, int Y, int [] A){
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i=0; i<N;i++) {
        if (A[i] == X || A[i] == Y) {
            nX += 1;
            nY = i;
        }
        if (nX%2==0) result = i - nY;
            }
        return result;
        }
    }
