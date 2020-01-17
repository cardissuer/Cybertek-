package CodingBat;

public class firstTwo {

    public static void main(String[] args) {
        System.out.println(firstTwo("jesus"));
    }

    public static String firstTwo (String str){
        if (str.length()>2) {
            return str.substring(0,2);
        } else {
            return str;
        }
    }
}
