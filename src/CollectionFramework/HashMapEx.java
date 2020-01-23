package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

    public static void main(String[] args) {
        Map<Integer, Integer > map = new HashMap<>();
        map.put(1,30);
        map.put(2,30);
        map.put(3,40);
        map.put(4,60);

        for (Integer key: map.keySet()){
            if (map.containsValue(key)) System.out.println(key);
        }
    }
}
