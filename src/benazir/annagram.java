package benazir;

public class annagram {

    public static void main(String[] args) {
        System.out.println(check("listen", "silent"));
    }

    public static boolean check(String word1, String word2) {
        int count = 0;
        if (word1.length() != word2.length()) {
            return false;
        } else {
            for (int i = 0; i < word1.length(); i++) {
                if (word2.contains(word1.charAt(i) + "")) {
                    count++;
                }
                for (i = 0; i < word1.length(); i++) {
                    if (word1.contains(word2.charAt(i) + "")) {
                        count++;
                    }
                    if (count == word1.length())
                        return true;
                }
            }
            return false;
        }
    }
}