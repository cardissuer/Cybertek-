package repl;

public class HWMethodsWithReturnIsEven {
    public static void main(String[] args) {
//isEven method gets a number(int) if its even (2,4,8...) returns true.
//if its odd return false.
        System.out.println(isEven(5));
    }
    public static boolean isEven (int n){
        if (n%2==0){
            return true;
        }
        return false;
    }
}
