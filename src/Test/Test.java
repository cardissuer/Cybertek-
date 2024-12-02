package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(Reverse("feature"));

//        System.out.println(Palindrome("regexeger"));

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the range");
//        int n = scanner.nextInt();
//        scanner.nextLine();
//
//        int num1 = 0;
//        int num2 = 1;
//        int[] fibonacci = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            fibonacci[i] = num1;
//            int sum = num1 + num2;
//            num1 = num2;
//            num2 = sum;
//        }
//        System.out.println(Arrays.toString(fibonacci));

//       Test test = new Test();
//        test.ex(12);
//        String word = "{{{}}}";
//        System.out.println(CurlyBraces(word));
//        System.out.println(test);
//        int [] grades = {1,2,10,100,150,200};
//        int minValue = grades[0];
//        int maxValue = grades[0];
//        System.out.println("Min Value: " + ArrayMaxMin(minValue));
//        System.out.println("Max Value: " + maxValue);
    }

    public void ex(int num) {
        int number = num;
        System.out.println(number);
    }

    public static boolean Palindrome2Indexez(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) return false;
            i++;
            j--;
        }
        return true;

    }

    public static boolean CurlyBraces(String word) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == '{') sumLeft++;
            if (word.charAt(i) == '}') sumRight++;
        }
        if (sumLeft == sumRight) return true;
        return false;
    }
// 1 variable + make sure that is starts from Left and close with Right - TO THINK!

    public static int ArrayMaxMin(int grades[]) {
        int minValue = grades[0];
        int maxValue = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (minValue > grades[i]) {
                minValue = grades[i];
            }
            if (maxValue < grades[i]) {
                maxValue = grades[i];
            }
        }
        return minValue + maxValue;
    }

    public static boolean Palindrome (String pal){
    for (int i=0; i<pal.length()-1/2; i++){
        if (pal.toLowerCase().charAt(i) == pal.toLowerCase().charAt(pal.length()-1-i)) return true;
    }
    return false;
    }

    public static String Reverse (String straight){
//        Scanner scanner = new Scanner (System.in);
//        System.out.println("Please enter the word");
//        String word = scanner.nextLine();
        String reverse = "";
        for (int i = straight.length()-1;i>=0; i--){
            reverse += straight.charAt(i);
        }
        return reverse;
    }

}