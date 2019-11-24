package Objects;

public class Student {
    String name;
    String email;
    int age;

    public void read (){
        System.out.println(name +  " is reading");
    }
    public void read (int hours) {
        System.out.println(name + " is reading " + hours + " hours");
    }
    public void read (Book book){
        System.out.println(name + " is reading" + book.title);
    }
}
