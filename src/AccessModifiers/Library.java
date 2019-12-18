package AccessModifiers;

import Encapsulation.Author;

public class Library {
    public static void main(String[] args) {
        Author author = new Author();
        author.name = "James";
        author.info();
        //Person person = new Person("Jason");
        //person.name = "Jonn";
        //author.email = "";
        // author object doesn't have an access to variable name.
        //Access class is located in another package than Library class
    }
}