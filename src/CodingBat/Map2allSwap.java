package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class Map2allSwap {

    public String [] allSwap (String[] strings) {

        Map<String, Integer> map = new HashMap();
        for (int i=0;i<strings.length;i++){
            String s = strings[i];
            String first = s.substring (0,1);
            if (map.containsKey(first)){
                map.put(first,i);
            } else {
                String temp = strings[map.get(first)];
                strings[map.get(first)] = s;
                strings[i] = temp;
                map.remove(first);
            }
        }
        return strings;
    }
}