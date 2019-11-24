package Methods;

public class overloadingMethods5 {

    //Create a method that will accept two Strings. Return true if the first string begins with the second String. Return false if it does not.
    //Overload the method to accept a two Strings and a number. Return true if the second String is found inside of your first String the amount of times equal to your number parameter.
    //input: “jamesjajl”,”ja", 2
    //output: true

    public static void main(String[] args) {
        System.out.println(words("james", "ja"));
        System.out.println(words("jajajavez", "ja", 3));
    }
    public static boolean words (String word1,String word2) {
        //if (word1.substring(0,word2.length()).equals(word2)) {
          //  return true;
        //} else
          //  return false;
        return word1.toLowerCase().startsWith(word2.toLowerCase());
        }
    public static boolean words (String word1, String word2, int n) {
        int count=0;
        for (int i=0; i<word1.length()-word2.length()+1; i++) {
            String sub=word1.substring(i,i+word2.length());
            if (sub.equals(word2)){
                count++;
            }
        }
        if(n==count) return true;
        return false;
    }

    }
