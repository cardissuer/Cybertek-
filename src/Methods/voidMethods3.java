package Methods;

public class voidMethods3 {
    public static void main(String[] args) {
        printName ("james");
        printName("adam");
        firstChar("fkghkdfjhgkdh");
    }
    public static void printName(String name) {
        System.out.println(name);
    }
    public static void firstChar (String name) {
        System.out.println(name.charAt(0));
    }
}
