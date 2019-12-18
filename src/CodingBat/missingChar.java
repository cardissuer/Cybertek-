package CodingBat;

public class missingChar {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));
    }
    public static String missingChar(String str, int n) {
        String str1 = str.substring (0,n);
        String str2 = str.substring (n+1,str.length());
        return str = str1 + str2;
    }
}
