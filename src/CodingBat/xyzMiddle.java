package CodingBat;

public class xyzMiddle {

    public static void main(String[] args) {
        System.out.println(xyzMiddle("xyzBB"));
    }

    public static boolean xyzMiddle(String str) {
        int len = str.length();
        int mid;
        if (len < 3)
            return false;
        mid = len / 2;
        if (len % 2 == 0) {
            if (str.charAt(mid) == 'y')
                return (str.charAt(mid - 1) == 'x' && str.charAt(mid + 1) == 'z');
            if (str.charAt(mid - 1) == 'y')
                return (str.charAt(mid - 2) == 'x' && str.charAt(mid) == 'z');
            return false;
        }
        // len%2 != 0
        else if (str.charAt(mid) == 'y')
            return (str.charAt(mid - 1) == 'x' && str.charAt(mid + 1) == 'z');
        return false;
    }
}
