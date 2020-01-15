package CodingBat;

public class frontAgain {

    public static void main(String[] args) {
        System.out.println(frontAgain(""));
    }

    public static boolean frontAgain(String str) {
        if (str.length()>=2){
            if (str.substring(0,2).equalsIgnoreCase(str.substring(str.length()-2))){
                return true;
            }
        }return false;
    }
}
