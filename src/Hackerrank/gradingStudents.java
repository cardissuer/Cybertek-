package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class gradingStudents {

    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add (46);
        list.add (48);
        list.add (38);
        list.add (22);
        System.out.println(gradingStudents(list));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List <Integer> result = new ArrayList<>();
        for (int i=0; i<grades.size();i++){
            if (grades.get(i)<38 || grades.get(i)%5<3) result.add(grades.get(i));
            else result.add(grades.get(i)+(5-grades.get(i)%5));
        }
    return result;
    }
}
