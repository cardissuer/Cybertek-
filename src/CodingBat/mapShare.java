package CodingBat;

import java.util.Map;

public class mapShare {

    public Map<String, String> mapShare(Map<String, String> map) {
        String a = map.get("a");
        if (map.containsKey("a")) {
            map.put("b", a);
        }
        if (map.containsKey("c")) {
            map.remove("c");
        }
        return map;
    }
}


