package StringBuilder;

public class deleteCon {

    //Create a method deleteWord. The method will take a String and check if “con” is in the String.
    // If it is in the String remove it from the String. Return the String with any changes.

    public static void main(String[] args) {
        // System.out.println(deleteCon("concatenate"));
        System.out.println(deleteCon("goddamn it","it"));
    }

    public static String deleteCon (String word){
        StringBuilder newWord = new StringBuilder(word);
        if (word.contains("con")){
            newWord.delete(word.indexOf("con"), (word.indexOf("con")+3));
        }
        return newWord.toString();
    }

    //Overload the deleteWord method to take two Strings. The first String is the main String and the second String
    // is the String we are looking for. Before this second String was always “con”, but now it will be more dynamic.
    // If the String we are looking for is found in the main String, then remove that part.
    // Return the String with any changes.

    public static String deleteCon (String word, String wordWeAreLookingFor){
        StringBuilder newWord = new StringBuilder(word);
        if (word.contains(wordWeAreLookingFor.toLowerCase())){
            newWord.delete(word.indexOf(wordWeAreLookingFor), (word.indexOf(wordWeAreLookingFor)+wordWeAreLookingFor.length()));
        }
        return newWord.toString();
    }
}