package loop;

import java.util.Scanner;

public class nestedloops8 {
    public static void main(String[] args) {
        /* Scanner input = new Scanner(System.in);
        System.out.println("Please enter word");
        String word = input.nextLine();
        String back = "";

        for (int i=word.length()-1;i>=0;i--){
            back += word.charAt(i);
        }
        System.out.println(word);
        System.out.println(back);

        if (word.equals(back)) {
            System.out.println("Palindrome");
        }else
            System.out.println("Not a palindrome");
        }
    }*/
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word");
        String word = input.nextLine();
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            String checked = "";

            if (checked.contains(word.charAt(i) + "")) {
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        count++;
                    }
                    checked = word.charAt(i) + "";
                    System.out.println(word + " has " + count + " " + word.charAt(i));
                }
            }
        }
    }
}
