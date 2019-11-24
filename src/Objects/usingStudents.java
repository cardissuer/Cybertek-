package Objects;

public class usingStudents {
    public static void main(String[] args) {
        Student studentOne = new Student();
        Book book1 = new Book ("java", "cybertek", 120);
        studentOne.read(book1);
    }

}
