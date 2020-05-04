package CodingBat;

public class mixString {

    public static void main(String[] args) {
        System.out.println(mixString("Ridgeway", "Ave"));
    }

    public static String mixString(String a, String b) {
        String mix = "";
        String end = "";
        if (a.length() >= b.length()) {
            end = a.substring(b.length());
            for (int i = 0; i < b.length(); i++) {
                mix += (a.charAt(i) + "") + (b.charAt(i) + "");
            }
        }
            else  {
                end = b.substring(a.length());
                for (int i = 0; i < a.length(); i++) {
                    mix += (a.charAt(i) + "") + (b.charAt(i) + "");
                }
            }
            return (mix + end);
        }
    }



