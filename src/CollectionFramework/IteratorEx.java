package CollectionFramework;

import java.util.*;

public class IteratorEx {

    public static void main(String[] args) {

        Set <String> names = new HashSet<>();

        names.add("James");
        names.add ("Joe");
        names.add("Sarah");
        names.add("Ben");
        names.add("Adam");

        Iterator<String> it = names.iterator();
        //it.next(); // "James"
        //it.next(); // "Sarah"

        while (it.hasNext()){
            String name = it.next();
            System.out.println(name);
            if (name.equalsIgnoreCase("Ben")){
                it.remove();
            }
        }
        System.out.println(names);
    }
}
