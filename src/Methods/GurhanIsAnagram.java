package Methods;

import java.util.Arrays;

public class GurhanIsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("silent","listen"));
    }

    public static boolean isAnagram (String word1, String word2){

        if (word1.length() != word2.length()) {
            System.out.println("These words aren't anagram");
        }
        char [] word4 = word1.toCharArray();
        char [] word5 = word2.toCharArray();
        Arrays.sort(word4);
        Arrays.sort(word5);
        if (word4.equals(word5)) {
            return true;
        } return false;
        }
    }