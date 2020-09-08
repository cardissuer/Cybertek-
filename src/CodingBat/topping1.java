package CodingBat;

import java.util.Map;

public class topping1 {
    public Map<String, String> topping1(Map<String, String> map) {
    map.put("bread", "butter");
        if (map.keySet().contains("ice cream")){
        map.replace("ice cream", "cherry");
        }
    return map;
    }
}
