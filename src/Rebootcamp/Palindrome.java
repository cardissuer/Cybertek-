package Rebootcamp;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(Palin("regexeger"));
        System.out.println (Palin1("regexeger"));
    }

public static boolean Palin (String word){
    for (int i=0; i<word.length()/2;i++){
        if (word.toLowerCase().charAt(i) == word.toLowerCase().charAt(word.length()-1-i)) return true;
    } return false;
}

public static boolean Palin1 (String word){
        boolean check = true;
    for (int i=0; i<word.length()/2;i++){
        if (word.toLowerCase().charAt(i) != word.toLowerCase().charAt(word.length()-1-i)) return check == false;
        break;
    } return check;
}
}
