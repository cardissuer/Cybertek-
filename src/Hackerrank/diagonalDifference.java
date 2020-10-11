package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class diagonalDifference {

    public static void main(String[] args) {
        List <Integer> one = new ArrayList<>();
        List <Integer> two = new ArrayList<>();
        List <Integer> three = new ArrayList<>();
        one.add(10);
        one.add(15);
        one.add(20);
        two.add(20);
        two.add(25);
        two.add(30);
        three.add(30);
        three.add(35);
        three.add(40);
        List <List <Integer>> arr = new ArrayList<>();
        arr.add(one);
        arr.add(two);
        arr.add(three);
        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        Integer firstDiagonal = 0;
        Integer secondDiagonal = 0;

        for (int i = 0, j = arr.size() - 1; i < arr.size(); i++, j--) {
            firstDiagonal += arr.get(i).get(i);
            secondDiagonal += arr.get(i).get(j);
        }
        return Math.abs(firstDiagonal - secondDiagonal);
    }

}
