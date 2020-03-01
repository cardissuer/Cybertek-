package CodingBat;

public class starOut {
    public static void main(String[] args) {
        System.out.println(starOut("apr***illi**nois"));
    }

/*    public static String starOut(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
        }
    }
}*/

    public static String starOut(String str) {
        if (str.contains("*")) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '*') {
                    str.replace(str.substring(str.charAt(i - 1), str.charAt(i + 1)), "");
                }
            }
        } return str;
    }
}