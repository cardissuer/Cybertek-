package CodingBat;

public class xyBalance {

    public static void main(String[] args) {
        System.out.println(xyBalance("x"));
    }

    public static boolean xyBalance(String str) {

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'x') {
                return false;
            } else if (str.charAt(i) == 'y') {
                return true;
            }
        }
        return true;
    }
}
