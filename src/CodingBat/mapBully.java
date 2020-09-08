package CodingBat;

import java.util.Map;

public class mapBully {

    public static Map<String, String> mapBully(Map<String, String> map) {
        String a = map.get("a");
        if (map.keySet().contains("a")) {
            map.replace("a", "");
            map.put("b", a);
        }
        return map;
    }

}
