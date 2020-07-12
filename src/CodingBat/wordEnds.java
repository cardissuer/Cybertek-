package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class wordEnds {

    public static void main(String[] args) {
        System.out.println(wordEnds("123XYgh", "XY"));
        //System.out.println(mapAB2(Map (("a", "say"),("b", "stay"));
        System.out.println(worldEnds("PObuildPOjesusPO", "PO"));
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

    public static String worldEnds(String str, String word)
    {
        int len = str.length();
        int wLen = word.length();
        int pos = str.indexOf(word);
        int i = 0;
        StringBuilder stbuild = new StringBuilder(len);
        while(pos != -1)
        {
            i = pos + wLen;
            if(pos >= 1)
                stbuild.append(str.charAt(pos-1));
            if(i < len)
                stbuild.append(str.charAt(pos+wLen));
            pos = str.indexOf(word, i);
        }
        return stbuild.toString();
    }
}