package mondayteam;

import java.util.Arrays;

public class nov18firsttask {
     public static void main(String[] args) {
         System.out.println(Arrays.toString(extractNum("sflghsl65464glfdgnlfdkbgls")));
     }

   public static int[] extractNum(String str) {
       String word = "";
       for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
               word += str.charAt(i);
           }
       }
           String[] arr1 = word.split("");
           int[] arr = new int[arr1.length];
           for (int i = 0; i < arr1.length; i++) {
               arr[i] = Integer.valueOf(arr1[i]);
           }
           return arr;
       }
   }

