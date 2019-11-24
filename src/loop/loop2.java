package loop;

import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        /*for (int i=0;i<15;i++) {
            System.out.println("Welcome," + name + ", the Matrix has you");
        }*/
        for (int i=0; i==name.length(); i+=1) {
            System.out.println(name.charAt(i) + "for index" + i);
        }
    }
}
