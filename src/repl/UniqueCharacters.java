package repl;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {

        //Accept a String and print only unique characters in the String:
        //
        //Input:
        //java
        //Output:
        //jav
        //
        //Input:
        //aabcddee
        //Output:
        //abcde

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        for(int i=0;i<word.length()-1;i++)
        {
            for(int j=i+1;j<word.length();j++)
            {
                if(word.charAt(i)==word.charAt(j))
                    word=word.replace(String.valueOf(word.charAt(j)),"");
            }
        }
        System.out.println(word);

    }
}
        /*Scanner input = new Scanner(System.in);
        String test = input.nextLine();
        String temp = "";
        for (int i = 0; i < test.length(); i++) {
            char ch = test.charAt(i);
            if (temp.indexOf(ch) == -1) {
                temp = temp + ch;
            } else {
                temp.replace(String.valueOf(ch), "");
            }
        }

        System.out.println(temp + " ");

    }
}*/