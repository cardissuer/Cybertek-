package Methods;

public class voidMethods {
    public static void main(String[] args) {
        sayHi();
        sayBye();
    }

    public static void sayHi() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
        }
    }

    public static void sayBye() {
        for (int i = 0; i < 5; i++) {
            System.out.println("bye");
        }
    }
}
