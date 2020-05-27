package Rebootcamp;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(Palin("regexeger"));
        System.out.println(Palin1("regexeger"));
        System.out.println(isPalindrome(12321));
    }

    public static boolean Palin(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.toLowerCase().charAt(i) == word.toLowerCase().charAt(word.length() - 1 - i)) return true;
        }
        return false;
    }

    public static boolean Palin1(String word) {
        boolean check = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.toLowerCase().charAt(i) != word.toLowerCase().charAt(word.length() - 1 - i)) return check == false;
            break;
        }
        return check;
    }

    public static boolean isPalindrome(long num) {
        long remain = num;
        long rev = 0;
        while (remain != 0) {
            long digit = remain % 10;
            rev = rev * 10 + digit;
            remain /= 10;
        }
        return num==rev;
    }
}