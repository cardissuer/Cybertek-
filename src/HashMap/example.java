package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class example {
    public static void main(String[] args) {
        Map<String, String> credentials = new HashMap<>();
        credentials.put("cardissuer", "somehow");
        System.out.println(credentials.put("cardissuer", "anyhow"));
        System.out.println(credentials.get("cardissuer"));
        System.out.println(credentials.remove("cardissuer"));
        System.out.println(credentials);
        Set<String> keys = credentials.keySet();
        credentials.put("cardissuer", "somehow");
        for (String key: keys){
            System.out.println(credentials.get(key));
        }
    }
}