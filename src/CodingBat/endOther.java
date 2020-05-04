package CodingBat;

public class endOther {

    public static void main(String[] args) {
        System.out.println(endOther("BBc", "abcabcabc"));
    }

//    public static boolean endOther(String a, String b) {
//
//        if ((a.substring(a.length() - b.length()).equalsIgnoreCase(b)) || (b.substring(b.length() - a.length() - 1).equalsIgnoreCase(a))) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}

    public static boolean endOther(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        String end = "";
        String temp = "";
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (aLen >= bLen) {
            end = a.substring(aLen - bLen);
            temp = b;
        } else {
            end = b.substring(bLen - aLen);
            temp = a;
        }
        return (end.equals(temp));
    }
}