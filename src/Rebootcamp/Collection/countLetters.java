package Rebootcamp.Collection;

import java.util.HashMap;
import java.util.Map;

public class countLetters {

    public static void main(String[] args) {
        countLetter("apple are good for you");
    }

    public static void countLetter (String str){
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<str.length();i++){
            char key = str.charAt(i);
            if (!map.containsKey(key)){
                map.put(key,0);
            }
            map.put(key,map.get(key)+1);
        }
        for (Character key: map.keySet()){
            System.out.println("Key = " + key);
            System.out.println("Value = " + map.get(key));
            System.out.println();
        }
        System.out.println(map);
    }
}
