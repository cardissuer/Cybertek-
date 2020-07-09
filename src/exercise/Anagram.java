package exercise;
public class Anagram {
    public static void main(String[] args) {
        System.out.println(AnagramCheck("silent", "lentis"));
    }
    public static boolean AnagramCheck(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        } else {
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < first.length(); i++) {
                if (first.contains(second.charAt(i) + "")) {
                    count1++;
                }
                if (second.contains(first.charAt(i) + ""))
                    count2++;
            }
            if (count1 == count2) {
                return true;
            }
        }
        return false;
    }
}
