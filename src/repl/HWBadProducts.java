package repl;

public class HWBadProducts {
    public static boolean badP(int[] products, int limit) {
        int counter = 0;
        for (int product : products) {
            if (product == 0) {
                counter++;
            }
        }
        if (counter < limit) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(badP(new int[]{1, 1, 1, 0, 0, 0}, 4));
    }
}