package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayBinarySearch {
    public static void main(String[] args) {
        String [] books = {"Last of mohicans","Fight Club", "Around the world in 80 days", "Robinson Crusoe", "Ivanhoe"};
        Scanner scanner = new Scanner(System.in);
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));
        System.out.println("Please enter the book name");
        String b1 = scanner.nextLine();
        int index = Arrays.binarySearch(books, b1);

        if (index>=0) {
            System.out.println("What book will you replace " + b1 + " with?");
            String b2 = scanner.nextLine();
            books[index] = b2;
        } else {
            System.out.println("Book was not found");
    }
        System.out.println(Arrays.toString(books));
}
}
