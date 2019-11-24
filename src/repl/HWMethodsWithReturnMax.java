package repl;

public class HWMethodsWithReturnMax {
    //max function gets two ints, x and max.
    //x is the test case, max is what we test against.
    //
    //if  x is bigger then max return max
    //in any other case return x.
    public static void main(String[] args) {
        System.out.println(max(5,5));
    }
    public static int max (int x, int max){
        if (x>max){
            return max;
        }
        return x;
    }
}
