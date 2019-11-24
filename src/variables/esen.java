package variables;

public class esen {
    public static void main(String[] args) {
        System.out.println("What's up");

        byte b = 45;
        int i = b;
        short s = (short)i;
        System.out.println(i+s);

        // Find even or odd number using remainder
        int size = 32;
        int result = size % 2;
        System.out.println(result);
        System.out.println(size);
        size = 45;
        System.out.println(size);

        int age = 25;
        age+=11;
        System.out.println(age);
    }
}
