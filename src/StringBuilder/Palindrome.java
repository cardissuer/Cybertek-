package StringBuilder;

import java.util.Scanner;

public class Palindrome {
    public static boolean Palindrome (String word){

        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        if (word.equals(sb.toString())){
            return true;
        }
        return false;
    }
}