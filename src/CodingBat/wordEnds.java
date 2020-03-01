package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class wordEnds {

    public static void main(String[] args) {
        System.out.println(wordEnds("123XYgh", "XY"));
        //System.out.println(mapAB2(Map (("a", "say"),("b", "stay"));
    }

    public static String wordEnds(String str, String word) {
        String newOne = "";
        if (str.contains (word)){
        newOne = (str.charAt((str.indexOf(word)-1)) + "" + (str.charAt((str.indexOf(word))+2))) + ""; { return newOne;
        }
        }
        return newOne;
    }

    public static Map <String, String> mapAB2(Map<String, String> map) {
        Map<String, String> mapAB2 = new HashMap<>();
        if (mapAB2.containsKey("a") && mapAB2.containsKey("b")){
        } if ((mapAB2.get("a")).equals (mapAB2.get("b")))
        {
            mapAB2.remove ("a", "b");
        } return mapAB2;
    }
}