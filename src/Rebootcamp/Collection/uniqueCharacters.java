package Rebootcamp.Collection;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class uniqueCharacters {
    public static void main(String[] args) {
        System.out.println(uniqueChar("aaaahhhhhkkkkddyid"));
    }
    public static String uniqueChar (String str){
        String unique = "";
        List <String> list = new ArrayList<>(Arrays.asList(str.split("")));
        for (String each: list){
            int count = Collections.frequency(list,each);
            if (count==1) unique+=each;
        }
        return unique;
    }
}
