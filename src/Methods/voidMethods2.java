package Methods;

public class voidMethods2 {
    public static void main(String[] args) {
        printOddNumbers();
    }
    public static void printOddNumbers() {
        for (int i=0; i<100; i++) {
        if (i % 2 == 1) {
            System.out.print(i +" ");
        }
    }
    }
}