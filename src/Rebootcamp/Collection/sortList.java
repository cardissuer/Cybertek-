package Rebootcamp.Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class sortList {

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(4, 4, 3, 6, 6, 90, 2));
        System.out.println(sortList(list));
    }

    public static ArrayList <Integer> sortList (ArrayList<Integer>list){
        for (int i=0; i<list.size();i++){
            for (int j=0; j<list.size();j++){
                if (list.get(i)<list.get(j)){
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }return list;
    }
}
