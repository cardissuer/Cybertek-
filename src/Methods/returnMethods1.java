package Methods;

public class returnMethods1 {
    public static int checkNumber (int num) {
        if (num<0) {
            return 0;
        } else {
            return num+1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Positive: " + checkNumber(4));
    }
}