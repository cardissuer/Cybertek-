package repl;

public class loopEx3 {
    public static void main(String[] args) {
        //Write for and while loops so that they add up the even numbers between 1 and 20 and prints it
        //
        //Expected Output:  110
    int sum = 0;
        for (int i=0; i<=20; i+=2) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
