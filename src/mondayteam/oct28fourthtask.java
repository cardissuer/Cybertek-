package mondayteam;

import java.util.Scanner;

public class oct28fourthtask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String str2 = input.nextLine();
        String newStr = "";
        //----------------------------------------------------------
        for(int i = str2.length()-1; i>=0; i--){
            newStr = "" + newStr + str2.charAt(i);
        }
        if(newStr.equals(str2)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
