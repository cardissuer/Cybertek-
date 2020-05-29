package Rebootcamp.Collection;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDupValues("GGGGGHKKKKBDDDDIIII"));
    }

    public static String removeDupValues (String str){
        String [] arr = str.split("");
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(arr));
        return set.toString().replace("[", "").replace("]", "").replace(", ", "");
    }
}
