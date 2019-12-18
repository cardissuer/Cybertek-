package staticClass;

public class BestBuy {
    String location = "Chicago";
    static int numOfComputers;
    static String day;
    static {
        System.out.println("run first");
        numOfComputers = 50;
        day = "Monday";
        System.out.println(day);
    }
    static {
        numOfComputers=100;
    }
    public static void main(String[] args) {
        System.out.println(numOfComputers);
    }
}