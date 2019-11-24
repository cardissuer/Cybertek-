package loop;
import java.util.Scanner;
public class whileloop6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to add 1?");
        String word = input.nextLine();
        int num = 0;
        while (word.equals ("y") || word.equals("yes")) {
            num++;
            System.out.println("Would you like to add 1?");
            word = input.nextLine();
            }
            System.out.println(num);
        }
    }
