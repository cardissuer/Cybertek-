package tek;

import java.util.*;

public class NassimTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array 1:");
        int size1 = sc.nextInt();
        int[] arrayEx1 = new int[size1];
        System.out.println("Enter the elements of the array1:");


        for (int i = 0; i < arrayEx1.length; i++) {
            arrayEx1[i] = sc.nextInt();
        }

        Arrays.sort(arrayEx1);
        int n = arrayEx1.length;

        int countofmax = 1;
        int temp = arrayEx1[0];
        int count = 1;

        for (int i = 1; i < arrayEx1.length; i++) {
            if (arrayEx1[i] == arrayEx1[i - 1])
                count++;
            else {
                if (count > countofmax) {
                    countofmax = count;
                    temp = arrayEx1[i - 1];
                }
                count = 1;
            }
        }


        if (count > countofmax) {
            countofmax = count;
            temp = arrayEx1[n - 1];
        }
        System.out.println("The most frequent number is:" + temp);
    }

    public String findPopular(String[] array) {
        List<String> list = Arrays.asList(array);
        Map<String, Integer> stringsCount = new HashMap<String, Integer>();
        for (String string : list) {
            if (string.length() > 0) {
                string = string.toLowerCase();
                Integer count = stringsCount.get(string);
                if (count == null) count = new Integer(0);
                count++;
                stringsCount.put(string, count);
            }
        }
        Map.Entry<String, Integer> mostRepeated = null;
        for (Map.Entry<String, Integer> e : stringsCount.entrySet()) {
            if (mostRepeated == null || mostRepeated.getValue() < e.getValue())
                mostRepeated = e;
        }
        try {
            return mostRepeated.getKey();
        } catch (NullPointerException e) {
            System.out.println("Cannot find most popular value at the List. Maybe all strings are empty");
            return "";
        }
    }
}