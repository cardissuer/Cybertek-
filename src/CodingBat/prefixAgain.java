package CodingBat;

public class prefixAgain {

    public static void main(String[] args) {
        System.out.println(prefixAgain("Donalddon", 3));
    }

    public static boolean prefixAgain(String str, int n) {
    String prefix = str.substring(0,n).toLowerCase();
        return (str.substring(n).toLowerCase().contains(prefix));
    }
    }

