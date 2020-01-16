package CodingBat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lastChars {
    public static void main(String[] args) {
        System.out.println(lastChars("dog","cat"));
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Cybertek PC\\Desktop\\Cybertek\\Selenium-java-3.141.59");
        //WebDriver obj = new ChromeDriver();
        //obj.get ("https://www.google.com");
    }
    public static String lastChars(String a, String b) {
        String result = "";
        //String a1 = a.charAt(0)+"";
        //String b1 = b.charAt(b.length()-1) + "";
        if (a.length()>0 && b.length()>0){
            result = "" + a.charAt(0)+b.charAt(b.length()-1);
        } if (a.length() == 0 && b.length()>0){
            result = "@" + b.charAt(b.length()-1);
        } if (a.length()>0 && b.length()==0){
            result = a.charAt(0) + "@";
        } if (a.length()==0 && b.length()==0){
            result = "@@";
        }
        return result;
    }

}