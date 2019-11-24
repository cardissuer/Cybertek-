package repl;

public class loopFullTree {
    public static void main(String[] args) {

        //Please print full tree using nested loop

            for (int i = 1; i <= 8; i++) {
                for (int z = 8 - i; z >= 0; z--) {
                    System.out.print(" ");
                }
                for (int y = 2; y <= i * 2; y++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }