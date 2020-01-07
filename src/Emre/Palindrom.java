package Emre;

public class Palindrom {
    public static void main(String[] args) {
        numberPalindrom(2552);
    }
    public static void numberPalindrom(int number) {
        int reverse = 0;
        int number2 = number;
        while (number2 > 0) {
            int digit = number2 % 10; //5445 //0110
            reverse  = digit + reverse * 10;  // 5
            number2 = number2 / 10;
        }
        if(number==reverse){
            System.out.println("Number is palindrom");
        }else {
            System.out.println("Number is not Palindrom");
        }
    }
}
