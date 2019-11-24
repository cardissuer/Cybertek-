package Objects;

public class Book {
    String title;
    String author;
    int pages;

    public Book(String title){
        this.title = title;
    }

    public Book (String title, String author){
        this (title);
        this.author = author;
    }

    public Book (String title, String author, int pages){
        this(title, author);
        this.pages = pages;
    }

    public void info (){
        System.out.println("The name of the book " + this.title);
        System.out.println("The author " + this.author);
        System.out.println("The pages amount " + this.pages);
        System.out.println();
    }
}