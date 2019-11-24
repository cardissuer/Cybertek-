package exercise;

import java.util.*;

class eeleventh {
    public static void main(String[] args) {

        System.out.println("Please enter:");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        // Your code here
        //------------------------------------------------

        boolean a = n.contains ("a");
        boolean b = n.contains ("b");
        if (a && b && n.length () >=7 && n.length()<=10) {
            System.out.println ("B Perfect");
        }else if (a && n.length()<5) {
            System.out.println ("A Perfect");
        }else if (a) {
            System.out.println ("");
        } else if (b) {
            System.out.println ("Perfect");
        } else {
            System.out.println ("Sorry");
        }
    }
}