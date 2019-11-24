package Strings;

public class StringsReversed {
    public static void main(String[] args) {
        String word = "cybertek";
        String reversed = "";
        for (int i=word.length()-1; i>=0; i--){
            reversed+=word.charAt(i);
        }
        System.out.println(reversed);
    }
}
