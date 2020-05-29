package Rebootcamp.Collection;

import java.util.Arrays;

public class sortEach {

    public static void main(String[] args) {
        System.out.println(sortEach("076687fkgjhflga6553fddgafgyvnslsa"));
    }

    public static String sortEach(String word) {
        String sorted = "";
        String each = "";
        for (int i = 0; i < word.length(); i++) {
            each += word.charAt(i) + "";
            if (Character.isLetter(word.charAt(i))) {
                if (i==word.length()-1||!Character.isLetter(word.charAt(i + 1))) {
                    sorted+=sortingMethod(each);
                    each = "";
                }
            } else {
                if (i==word.length()-1||!Character.isDigit(word.charAt(i + 1))) {
                    sorted+=sortingMethod(each);
                    each = "";
                }
            }
        }
        return sorted;
    }

    private static String sortingMethod (String word){
        String [] arr = word.split("");
        Arrays.sort(arr);
        return Arrays.toString(arr).replace("[", "").replace("]", "").replace(", ", "");
    }
}
