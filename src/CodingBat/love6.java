package CodingBat;

public class love6 {
    public static void main(String[] args) {
        System.out.println(love6(3,3));
    }

    public static boolean love6(int a, int b) {
        {
            if(a == 6 || b == 6)
                return true;
            return ((a + b) == 6|| Math.abs(a - b) == 6);
        }
    }
}
