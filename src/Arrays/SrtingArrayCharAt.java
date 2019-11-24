package Arrays;

import java.util.Arrays;

public class SrtingArrayCharAt {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        String [] regular = str.trim().toLowerCase().split (" ");
        System.out.println(Arrays.toString(regular));
        char [] charArr = str.toCharArray();
        System.out.println(Arrays.toString(charArr));
    }
}
