package exercise;

import org.w3c.dom.ls.LSOutput;

public class StringCompareTo {
    public static void main(String[] args) {
        String word = "Java";
        String word2 = "James";
        String word3 = "5Java";
        System.out.println (word.compareTo(word2));
        System.out.println(word2.compareTo(word));
        System.out.println(word.compareTo(word3));
    }
}
