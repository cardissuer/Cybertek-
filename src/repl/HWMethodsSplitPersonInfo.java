package repl;

import java.util.Scanner;

public class HWMethodsSplitPersonInfo {
    //The method person get a string with this format : "name,last name,age"
//hint: use the split method to split the string to a string array where there is a "," char
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        String[] arr = s.split(",");
        String info = "person name: " + arr[0] + " last name: " + arr[1] + " age: " + arr[2];
        System.out.println(info);
    }
}

    /*public static void person(String info){

        //your code here

        String [] arr = s.split(",");
        info = "person name: " + arr[0] + "last name: " + arr[1] + "age: " + arr[2];

    }//end person

}*/
