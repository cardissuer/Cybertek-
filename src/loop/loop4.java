package loop;

import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i=1; i<=5;i+=1) {
            System.out.println("Please enter name" + i + ":");
            String name = input.nextLine();
            System.out.println(name);
        }
    }
}
