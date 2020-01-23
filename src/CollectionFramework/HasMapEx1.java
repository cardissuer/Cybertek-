package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HasMapEx1 {

    public static <Map> void main(String[] args) {
        java.util.Map<String, Integer> map = new HashMap<>();
        map.put("First", 1);
        map.put("Second", 2);
        map.put("Third", 3);
        map.put("Forth", 4);
        System.out.println("Please enter the key number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (String key: map.keySet()){
            if (map.get(key) == number) {
                System.out.println(key);
                break;
            }
        }
        // System.out.println("Invalid number");
    }
}