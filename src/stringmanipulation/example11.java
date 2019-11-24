package stringmanipulation;
import java.util.Scanner;

public class example11 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter account number");
        String account = input.nextLine();
// boolean check = account.startsWith ("2") && account.length == 7;
// boolean check2 = account.startsWith ("5") && account.length == 10;
        if (account.charAt(0) =='2') {
            if (account.length()==7){
                System.out.println("Valid 2 account");
            }else {
                System.out.println("Invalid 2 account");
            }
        } else if (account.charAt(0) == '5') {
            if (account.length()==10) {
                System.out.println(("Valid 5 account"));
            }else {
                System.out.println("Invalid 5 account");
            }
        }else
            System.out.println("Invalid account number");
    }
}
