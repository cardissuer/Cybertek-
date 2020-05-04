package CodingBat;

public class repeatSeparator {

    public static void main(String[] args) {
        System.out.println(repeatSeparator("Jason", "Push",3));
    }

    public static String repeatSeparator(String word, String sep, int count) {
    String newWord = "";
    for (int i=0;i<count;i++){
        newWord += word + sep;
    }
        return newWord.substring(0,newWord.length()-sep.length());
    }

}
