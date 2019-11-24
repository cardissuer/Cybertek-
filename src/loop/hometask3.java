package loop;

import java.util.Scanner;

public class hometask3 {
    public static void main(String[] args) {
        System.out.println("Please enter the word: ");
        Scanner input = new Scanner(System.in);
        String n1 = input.nextLine();
        if (n1.length () % 2 == 1 && n1.length () > 3) {
            System.out.println (n1.substring (n1.length () / 2, (n1.length () / 2)+1 ));
        }
    }
    }

