package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx {

    public static void main(String[] args) {

        Set<String> cars = new HashSet<>();

        cars.add ("BMW");
        cars.add ("Lexus");
        cars.add ("BMW");
        cars.add ("Toyota");

        for (String car: cars){
            System.out.println(car);
        }

        System.out.println(cars);

        List<String> list = new ArrayList<String>(cars);
        System.out.println(list.get(0));
    }
}