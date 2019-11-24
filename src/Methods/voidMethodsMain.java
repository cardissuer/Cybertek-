package Methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class voidMethodsMain {
    public static void main(String[] args) {
        int[] arr2 = {-1, 28, 30, -46, -56};
        int[] arr3 = {-37, 54, 38, -58, -112};
        printNegativeNumbers(-1, 45, 30, -66, -110);
        replaceNegativeNumbers(arr2, 0);
        printIntegersInArray(arr3);
        addNumberToString ("985968796", 5);
        timeFormat(11,54, false);
        twoStrings("behaviour","open");
    }
    public static void printNegativeNumbers(int... arr) {
        for (int num : arr) {
            if (num < 0) {
                System.out.println(num);
            }
        }
    }
    public static void replaceNegativeNumbers(int[] arr, int change) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = change;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void printIntegersInArray(int[] arr3) {
        String res = "[";
        for (int num : arr3) {
            res += num + ", ";
        }
        res = res.trim().substring(0,res.length()-2) + "]";
        System.out.println(res);
    }
    public static void addNumberToString (String numb, int add) {
        //Write a method that will take a String of numbers (9843263 for example) and an int.
// Add that second given number to each other number and show each operation result as separate elements
// of an int array
        String[]arr4 = numb.split ("");
        int[]intArray = new int [arr4.length];
        for (int i=0;i<arr4.length;i++) {
            intArray [i] = Integer.valueOf(arr4[i]) + add;
        }
        System.out.println(Arrays.toString(intArray));
    }
    public static void timeFormat (int hr, int min, boolean amOrPm) {
        if ((hr>0 && hr<=12) && (min>=0 && min<=59)) {
            String date = hr + " : " + min;
            if (amOrPm) {
                date += " AM";
            } else {
                date+= " PM";
            }
            System.out.println(date);
        } else
        System.out.println("Invalid time information given");
    }
    public static void twoStrings (String name1, String name2) {
        if (name1.contains(name2)) {
            name1=name1.replace(name2,"");
            System.out.println(name1.trim());
        } else {
            System.out.println("Try again");
            Scanner scanner = new Scanner(System.in);
            String again = scanner.nextLine();
            if (name1.contains(again)) {
                name1=name1.replace(again,"");
                System.out.println(name1.trim());
            } else {
                System.out.println("Out of tries");
            }
        }
    }
}