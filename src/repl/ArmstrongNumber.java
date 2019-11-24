package repl;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //Write a program to print out all Armstrong numbers between 1 and 500.
        // If sum of cubes of each digit of the number is equal to the number itself,
        // then the number is called an Armstrong number.
        //for example:
        //153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
        //
        //Output:
        //1
        //153
        //370
        //371
        //407

        int i=1,a,arm,n;
        while(i<500) {
            n=i;
            arm=0;
            while(n>0) {
                a=n%10;
                arm=arm+(a*a*a);
                n=n/10;
            }
            if(arm==i)
                System.out.println(i);
            i++;
        }
    }
}