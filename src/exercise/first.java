package exercise;
import java.util.*;

public class first {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Please enter your gender: ");
        char gender = input.nextLine().charAt(0);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("Please enter your phone: ");
        long phone = input.nextLong();
        System.out.println("Please enter your gpa: ");
        double gpa = input.nextDouble();
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phone);
        System.out.println("GPA: " + gpa);
    }
}