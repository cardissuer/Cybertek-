package mondayteam;

public class nov18secondtask {
    public static void main(String[] args) {
        System.out.println(isAnagram("silent", "listen"));
    }
    public static boolean isAnagram(String word1, String word2) {
        int count1 = 0;
        int count2 = 0;
        if (word1.length() != word2.length()) {
            System.out.println("These words aren't annagram");
        } else
            word1 = word1.toLowerCase().trim();
            word2 = word2.toLowerCase().trim();
            for (int i = 0; i < word1.length(); i++) {
                    if (word1.contains(word2.charAt(i) + "")) {
                        count1++;
                    } if (word2.contains(word1.charAt(i)+ "")){
                        count2++;
                } if (count1 == count2)
                        return true;
                }
                return false;
            }
    }