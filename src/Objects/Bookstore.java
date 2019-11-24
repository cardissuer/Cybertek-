package Objects;

public class Bookstore {
    public static void main(String[] args) {

        Book book1 = new Book("java", "cybertek", 200);
        Book book2 = new Book("automation", "cybertek", 100);
        Book[] myBooks = new Book[3];
        myBooks[0] = book1;
        myBooks[1] = book2;

        myBooks[0].pages = 50;

        for (Book eachbook : myBooks) {
            eachbook.info();
            // System.out.println(eachbook.name + " " + eachbook.pages + "pages");
        }
        for (int i = 0, j = 50; i < myBooks.length; i++, j += 100) {
            myBooks[i].pages = j;
        }
        for (Book eachbook : myBooks) {
            eachbook.info();
        }
    }
}
