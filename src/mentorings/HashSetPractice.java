package mentorings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetPractice {

    public static void main(String[] args) {
        List<Object> list = Arrays.asList("John", "Sam", "Jane");
        Set<String> set = new HashSet(list);
        System.out.printf ("Size of list is %s, size of set is %s. Is list unique: %s", list.size(), set.size(), list.size() == set.size());
        System.out.println();
        String s = String.format("%s\n%s\n%s", list.get(0), list.get(1), list.get(2));
        System.out.println(s);
        String message = String.format("Unique values test failed. Expected %s, but was: %s", true, list.size() == set.size());
        System.out.println(message);
    }
}