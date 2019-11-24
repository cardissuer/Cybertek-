package repl;

public class loopEx5 {
    public static void main(String[] args) {

        //Write for and while loops so that they print the square of each odd number from numbers between 1 and 20.
        //Expected Output:  1 9 25 49 81 121 169 225 289 361

        int mult = 0;
        for (int i=1; i<20; i+=2) {
            mult = i*i;
            System.out.print (mult + " ");
        }
    }
}
