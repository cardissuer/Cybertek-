package tek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GlebTaskforHavenLife {

    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(5);
        System.out.println(countStudents(list));
    }

    public static int countStudents (List<Integer> height){
        List <Integer> sortArr = new ArrayList<>(height);
        int count = 0;
        Collections.sort(sortArr);
        for (int i=0; i<height.size(); i++){
            if (height.get(i)!=sortArr.get(i)){
                count++;
            }
        } return count;
    }
}
