package repl;

public class HWMethodsSimplePattern {
    //Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
    //hint:you will need to use two nested for loops for that, and an if that
    // checks if its the last or first iteration of the loop (so you will know whet to print "*" or " ")

    public static void main(String[] args) {
    printHollowRect();

}


    public static void printHollowRect()
    {
        // your code here

        for (int i=0; i<5; i++) {
            if (i==0 || i==4) {
                System.out.println("*****");
                }else {
                    System.out.println("*   *");
                }
            }

        }

    }
