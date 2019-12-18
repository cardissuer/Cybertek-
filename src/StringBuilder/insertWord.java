package StringBuilder;

import java.util.ArrayList;

public class insertWord {

    //Create a method insertWord. The method will take an ArrayList of Strings.
    // Go through each word of your ArrayList and any element that has an even number of characters will be changed
    // to have “hello” in the middle of the String. Return the changed ArrayList.

    public static ArrayList <String> insertWord (ArrayList <String> names){
        ArrayList <String> hello = new ArrayList<>();
    for (int i=0;i<names.size();i++){
        if (names.get(i).length() % 2==0){
            StringBuilder sb = new StringBuilder( (names.get(i)));
            sb.insert(names.get(i).length()/2, "Hello");
            names.set(i,sb.toString());
        }
    }
    return names;
    }
}