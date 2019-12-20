package Arrays;

import java.util.Arrays;

public class ArrayExample {

    public static String [] slava(String str){
        String [] arr = str.split(" ");
        return arr;
        }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(slava("The main method in a standard java")));
    }
    }
