package Test;

public class Anagram {

            public static void main(String[] args) {
            String word = "silent";
            String word1 = "lentis";
            if (word.length()!=word1.length()){
                System.out.println("Not an anagram");
                System.exit(0);
            }
            word = word.toLowerCase().replace(" ", "");
            word1 = word1.toLowerCase().replace(" ","");

            for (int i=0; i<word.length();i++){
                word1 = word1.replaceFirst(""+ word.charAt(i), "");
            }
            if (word1.isEmpty()){
                System.out.println("Anagram");
            } else {
                System.out.println("Not an anagram");
            }
        }
}
