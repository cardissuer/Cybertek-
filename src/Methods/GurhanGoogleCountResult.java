package Methods;

import java.util.Scanner;

public class GurhanGoogleCountResult {
    public static void main(String[] args) {
        System.out.println(resultCount("About 94,500,000 results (0.62 seconds)"));
        System.out.println(CountTime("About 94,500,000 results (0.62 seconds)"));
    }
    public static String resultCount (String sentence){
        String [] arr = sentence.split(" ");
        String secondWord = arr[1];
        String removeCommas = arr[1].replace(",","" );
        return removeCommas;
    }
    public static String CountTime(String str){
        String [] words = str.split("\\(");
        String seconds = words[1];
        return seconds.replaceAll("\\)","");
    }
}
