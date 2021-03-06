package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExercise {

    public static void main(String[] args) {

        Map<String, Integer > gradeScale = new HashMap<>();
        gradeScale.put("A",90);
        gradeScale.put ("B",80);
        gradeScale.put("C",70);
        gradeScale.put("D",60);
        gradeScale.put("F",50);

        System.out.println(gradeScale.get("B"));
        System.out.println(gradeScale.get("F"));
        System.out.println(gradeScale.get("G"));

        gradeScale.remove("F");

        System.out.println(gradeScale);

        System.out.println(gradeScale.containsKey("A"));
        System.out.println(gradeScale.containsValue("50"));

        Set<String> keys = gradeScale.keySet();
        for (String key: gradeScale.keySet()){
            //if (key.equalsIgnoreCase("C")){
              //  gradeScale.remove("C");
            if (key.equalsIgnoreCase("C")) gradeScale.put(key,70);
            System.out.println(key + "" + gradeScale.get(key));
            }
        }
    }
