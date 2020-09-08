package CodingBat;

import java.util.Map;

public class topping2 {

    public Map<String, String> topping2(Map<String, String> map) {
        String iceCream = map.get("ice cream");
        if (map.containsKey("spinach")) map.replace("spinach", "nuts");
        if (map.containsKey("ice cream")) map.put ("yogurt", iceCream);
        return map;
    }
}
