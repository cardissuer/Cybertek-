package Hackerrank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class timeConversion {

    public static void main(String[] args) {
        System.out.println(timeConversion("12:24:10AM"));
    }

//    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
//    if (!(s.length()==10)) return "Time format is invalid";
//    else if (s.endsWith("AM") && s.substring(0,2).equals())
  //      return "0";
   // }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        DateFormat inFormat = new SimpleDateFormat("hh:mm:ssaa");
//        DateFormat outFormat = new SimpleDateFormat("HH:mm:ssaa");
//        Date date = null;
//        try {
//            date = inFormat.parse(s);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        if (date != null) {
//            String myDate = outFormat.format(date);
//            System.out.println(myDate);
//        }
//    }
static String timeConversion(String s) {
//        Scanner in = new Scanner(System.in);
//        String time = in.next();
        String listTime[] = s.split(":");
        String hour = listTime[0];
        String minutes = listTime[1];
        String seconds = listTime[2].substring(0, 2);
        String caser = listTime[2].substring(2, 4);
        if(caser.equals("AM")){
            if(hour.equals("12"))
                hour="00";

            return hour+":"+minutes+":"+seconds;
        }else{
            if(!hour.equals("12")){
                int h = Integer.parseInt(hour);
                h = h +12;
                hour =""+h;
            }
            return hour+":"+minutes+":"+seconds;
        }
    }
}