package CodingBat;

public class less20 {

    public static void main(String[] args) {
        System.out.println(less20(38));
    }

    public static boolean less20(int n) {
        return ((n+1)%20==0 || (n+2)%20==0);
    }
}
