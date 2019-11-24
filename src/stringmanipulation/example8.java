package stringmanipulation;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String name1 = input.nextLine().trim();
        String name2 = input.nextLine().trim();
        String last1 = name1.substring(name1.indexOf(" ")+1);
        String last2 = name2.substring(name2.indexOf(" ")+1);
        if(last1.equals(last2)) {
            System.out.println("relatives");
        } else
            System.out.println("Not relatives");
    }
}
