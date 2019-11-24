package Objects;

import java.util.Arrays;
import java.util.Scanner;

public class BookScanner {

    //Create a program that will ask the user how many books they have.
    // Then they will be asked to enter the book’s title, author, and number of pages.
    // Create each book object and store them into a Book array.
    //Part 2: Loop through your array and print the name of all the books

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many books you have?");
        int size = scanner.nextInt();
        scanner.nextLine();
        Book [] newBooks = new Book[size];

        for (int i = 0; i < newBooks.length; i++) {
            System.out.println("Please enter the book's title" + (i+1));
            String title = scanner.nextLine();

            System.out.println("Please enter book's author" + (i+1));
            String author = scanner.nextLine();

            System.out.println("Please enter pages amount" + (i+1));
            int pages = scanner.nextInt();
            scanner.nextLine();

            Book eachBook = new Book(title, author, pages);
            newBooks[i] = eachBook;
        }
        for (Book book : newBooks) {
            System.out.println(book.title);
        }
    }
}