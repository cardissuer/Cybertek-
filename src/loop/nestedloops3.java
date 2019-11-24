package loop;

import java.util.Scanner;

public class nestedloops3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int i = input.nextInt();
        for (int m = 0; m < i; m++) {
            for (int j = 0; j < i;j++ ) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
