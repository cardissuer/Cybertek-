package exercise;

//Number Palindrome Create a method that will accept a number (long).
// Return a boolean: true if your given number is a palindrome number or false if it is not
// ** You know how to do it with String manipulation.
// If you want a challenge do it without using any String in your code
// Ex: > input: 1001> output: true> input: 1234> output: false

public class PalindromeNumber {

    public static boolean isPalindrome (long number){
        long workingNum = number;
        long reverse = 0;
        while (workingNum!=0){
            long lastNum = workingNum%10;
            reverse = reverse*10 + lastNum;
            workingNum/=10;
        }
        return number == reverse;
    }

    public static boolean isPalindrome2 (long number) {
        for (long i=10;i<=number;i*=10){
            if (number/i == number%i) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
        System.out.println(isPalindrome2(1001));
    }
}
