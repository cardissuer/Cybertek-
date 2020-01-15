package CodingBat;

public class conCat {
    public static void main(String[] args) {
        System.out.println();
    }

    public String conCat(String a, String b) {
        if (a.length() > 0 && b.length() == 0) {
            return a;
        }
        if (a.length() == 0 && b.length() > 0) {
            return b;
        }
        if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
            b = b.replace(b.substring(0, 1), "");
        }
        return a + b;
    }
}
