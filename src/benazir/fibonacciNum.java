package benazir;

public class fibonacciNum {
    public static void main(String[] args) {
        System.out.println(Fib(100));
    }
    public static int Fib (int m) {
        int n1 = 1;
        int n2 = 1;
        int n3 = 2;
        System.out.print(n1 + ", " + n2 + ", ");
        do {
            System.out.print(n3 + ", ");
            n1=n2;
            n2 = n3;
            n3 = n1 + n2;
        } while ((n3+n1) < m);
    return n3;
    }
}