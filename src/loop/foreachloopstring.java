package loop;

import java.util.Arrays;

public class foreachloopstring {
    public static void main(String[] args) {
        String[] nameOfStudents = {"Anna", "James", "Mayflower", "John", "Maria"};

        //for (String name : nameOfStudents) {
          //  System.out.println(name);
        //}

        //for (String name : nameOfStudents) {
          //  if (name.contains("a")) {
            //    System.out.println(name);
//            }
  //      }

           // for (String name: nameOfStudents) {
             //   for (int i = name.length() - 1; i >= 0; i--) {
               //     System.out.print(name.charAt(i));
                //}
                //System.out.println();
           // }

            String temp = "";
            String [] newArray = new String[nameOfStudents.length];
            for (int i=0; i<nameOfStudents.length;i++){
                temp="";
                for (int j=nameOfStudents[i].length()-1;j>=0;j--){
                    temp = temp + nameOfStudents[i].charAt(j);
                }
                newArray[i] = temp;
            }
        System.out.println(Arrays.toString(newArray));
        }
    }
