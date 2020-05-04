package CodingBat;

public class xyzThere {

    public static void main(String[] args) {
        System.out.println(xyzThere(".xyzcd"));
    }

    public static boolean xyzThere(String str) {
    for (int i=0; i<str.length()-2; i++){
        if (str.charAt(i) == 'x' && str.charAt(i+1)=='y' && str.charAt(i+2)=='z') {

        if (i == 0 || str.charAt(i-1) != '.')
                return true;
            }
        } return false;
    }
    }

