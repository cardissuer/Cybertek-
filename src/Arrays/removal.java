package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class removal {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<> (Arrays.asList(0,1,2,3,4,5,6,7,8));
        List <Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 4 ) {
                result.add(list.get(i));
            }
        }
        System.out.println(result);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if (it.next() < 4) {
                it.remove();
            }
        }
        System.out.println(list);
    }
    }
