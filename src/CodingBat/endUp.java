package CodingBat;

public class endUp {
    public static void main(String[] args) {
        System.out.println(endUp("whatta"));
    }
    public static String endUp(String str) {
        int cut = (str.length()-3);
        if (str.length()<=3) {
            return str.toUpperCase();
        } return (str.substring (0,cut) + str.substring(cut).toUpperCase());
    }
}
