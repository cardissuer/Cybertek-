package repl;

public class loopEx2 {
    public static void main(String[] args) {
        //Write for and while loops so that they go through the odd integers (from 1 to 19),
        // keeping track of the sum of these integers at each stage, and printing the sum at each stage.
        int sum=0;
        for (int i=1;i<=20;i+=2) {
            sum=sum+i;
            System.out.print(sum + " ");
        }
    }
}
