package Methods;

public class overloadingMethods1 {
    public static void main(String[] args) {
        int a=45;
        calc(a);
    }
    public static void calc (double d){
        System.out.println("using double");
    }
    public static void calc (float f) {
        System.out.println("using float");
    }
}