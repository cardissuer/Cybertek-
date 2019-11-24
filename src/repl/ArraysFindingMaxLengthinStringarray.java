package repl;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFindingMaxLengthinStringarray {
    public static void main(String[] args) {

        //Given the array words, it will print the word with the largest length.
        // Assume that there are no 2 words with longest length
        //
        //Example:
        //words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
        //prints jaaaaavvaaaaaaaaaa

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine().toLowerCase();

        }
for (int i=0;i<5;i++){
    words [i] = words[i].replace(" ","");
}
        Arrays.sort(words);
        System.out.println(words[4]);
    }
}

/*	        int temp = 0;
        String res = "";
        for (int i = 1; i <= words.length - 1; i++) {
            if (words[i].length() > words[i - 1].length()) {
                temp = words[i - 1].length();
                temp += temp;
                res = words [i-1];
            }
            temp = words[i].length();
            res = words[i];
        }
        System.out.println(res);
    }
}*/