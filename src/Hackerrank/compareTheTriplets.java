package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class compareTheTriplets {

    public static void main(String[] args) {
        List <Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        List <Integer> b = new ArrayList<>();
        b.add(3);
        b.add(2);
        b.add(1);
        System.out.println(compareTriplets(a, b));
    }


    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Integer alice = 0;
        Integer bob = 0;
        for (int i=0; i<a.size(); i++){
            if (a.get(i)>b.get(i)) alice+=1;
            else if (a.get(i)<b.get(i)) bob+=1;
        }
        List <Integer> resultScore = new ArrayList <>();
        resultScore.add (alice);
        resultScore.add (bob);
        return resultScore;
    }
}
