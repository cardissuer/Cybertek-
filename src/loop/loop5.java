package loop;

import java.util.Scanner;

public class loop5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (;;) {
            System.out.println("Please enter");
            String name = input.nextLine();
            if (name.equals("hi")) {
                System.out.println("Hello");
            } else {
                System.out.println("goodbye");
                break;
            }
        }
    }
}
