package Encapsulation;

public class abc {
    public static void main(String[] args) {
        Author author = new Author();
        //author.gender = "m";
        // you can't use private gender variable in another class because it belongs to Author class

        String name = "Jennifer";
        //Random random = new Random();
        //Person p = new Person("Ashley");
        System.out.println(name);
        //System.out.println(p.name);
    }
}
