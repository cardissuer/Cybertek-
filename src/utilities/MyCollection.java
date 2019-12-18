package utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCollection {

    /**
     * This method creates list of Strings from the User.
     * Method doesn't take anything, uses Scanner to get Strings
     * @return
     */
    public static ArrayList<String> getStringsList() {
        ArrayList<String> strings = new ArrayList<>();
        String string = "";
        String reply = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter your String: ");
            string = scanner.nextLine();
            strings.add(string);
            System.out.println("Do you want to enter more? Please enter Y or N: ");
            reply = scanner.nextLine();
        }
        while (reply.equalsIgnoreCase("y"));
        System.out.println(strings);
        return strings;
    }

    public static ArrayList <String> filterList (ArrayList<String> words, int size){
        ArrayList<String> newwords = new ArrayList<>();
        for (String s: words){
            if (s.length()==size){
                newwords.add (s);
            }
        }
        return newwords;
    }

    public static ArrayList <String> unique (ArrayList<String> words){
        ArrayList <String> uniqueW = new ArrayList<>();
        for (String w:words){
            if (uniqueW.contains(w)){
                continue;
            }
            uniqueW.add (w);
        }
        return uniqueW;
    }
}